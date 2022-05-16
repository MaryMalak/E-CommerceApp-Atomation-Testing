@regressionTest
Feature:Guest user could add products to wishlist

  Scenario: success message is visible after adding product to wishlist
     When user add a product to wishlist
    Then wishlist message is displayed in notification bar