package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class Hooks {

    @Before
    public void setUp() {
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }

    @After
    public void cleanUp(Scenario scenario){
        if(scenario.isFailed()){
            Allure.addAttachment("Screenshot",takeSs());
        }
        DriverManager.getDriver().quit();
    }

    public ByteArrayInputStream takeSs(){
        TakesScreenshot ts=(TakesScreenshot) DriverManager.getDriver();
        byte[] ss=ts.getScreenshotAs(OutputType.BYTES);
        return new ByteArrayInputStream(ss);
    }
}
