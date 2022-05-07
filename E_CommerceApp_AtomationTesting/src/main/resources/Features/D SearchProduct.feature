@regressionTest

Feature: Logged User could search for any product

  Background: User could log in with valid email and password
    Given user open login page
    And user enter valid email "maryloka@gmail.com" and password "123456"
    And user click on login button
    And user could login successfully

    Scenario: Logged User could Search for any product
      When user enter any product ( "computer" ) and click search
      Then  user could Search for this product successfully
