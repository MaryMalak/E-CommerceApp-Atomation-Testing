@regressionTest

Feature: Logged User could search for any product

  Background: User could log in with valid email and password
    Given user open login page
    When user enter valid email "marymalak@gmail.com" and password "123456"
    And user click on login button
    Then user could login successfully

    Scenario: Logged User could Search for any product
      When user enter any product ( "computer" ) and click search
      Then  user could Search for this product successfully
