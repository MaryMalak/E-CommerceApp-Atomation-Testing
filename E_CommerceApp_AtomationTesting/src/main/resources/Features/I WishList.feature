@regressionTest
Feature:Guest user could add products to wishlist

  Scenario: Guest user could add products to wishlist
    When Guest user click on any product "Apple MacBook Pro 13-inch" and click on wishlist btn
    Then user find message for wishlist "The product has been added to your wishlist" is displayed in bar notification