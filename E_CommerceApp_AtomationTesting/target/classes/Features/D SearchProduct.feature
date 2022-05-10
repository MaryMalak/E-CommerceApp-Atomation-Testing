@regressionTest

Feature: Logged User could search for any product

  Background: User could log in with valid email and password
    Given user open login page
    When user enter valid email "marymalak@gmail.com" and password "123456"
    And user click on login button
    Then user could login successfully

    #Scenario 1
    Scenario: Logged User could Search for any product by name
      When user enter any product ( "apple" ) and click search
      Then  user could Search for this product ( "apple" ) successfully
#Scenario 2
  Scenario: Logged User could Search for any product using SKU
    When user enter any Sku("VG_CR_025") and click search
    Then  user could Search the product by this SKU ("VG_CR_025") successfully

