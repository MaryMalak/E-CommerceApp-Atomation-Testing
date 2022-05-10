@regressionTest
Feature:Guest user could add products to shopping cart

  Scenario: Guest user could add products shopping cart
    When Guest user click on any product "Apple MacBook Pro 13-inch" and click on shopping cart btn
    Then user find message for shopping cart "The product has been added to your shopping cart" is displayed in bar notification