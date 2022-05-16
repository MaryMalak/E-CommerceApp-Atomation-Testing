@regressionTest
Feature:Guest user could add products to shopping cart

  Scenario: Guest user could add products shopping cart
    When user add a product to shopping cart
    Then shopping cart message is displayed in notification bar