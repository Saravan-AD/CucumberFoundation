Feature: Check end to end Scenario

  Background:
    Given user open website

  Scenario: Verify quantity of items added to cart is correct
    When user clicks reebok brand
    Then verify user is on footwear page
    When user selects the first three products
    And clicks on cart icon
    Then verify user is on cart page
    And  verify the quantity is correct

  Scenario: Verify if price low to high sorting is correct
    When user clicks reebok brand
    Then verify user is on footwear page
    When user selects price low to high sort option
    Then verify is the sorting is correct