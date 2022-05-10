@regressionTest
Feature: Logged User could switch between currencies US-Euro

  Background: User could log in with valid email and password
    Given user open login page
    When user enter valid email "marymalak@gmail.com" and password "123456"
    And user click on login button
    Then user could login successfully


  Scenario: User could switch between currencies US-Euro

    When user could select Euro currency
    And user could select Euro currency
    Then User could switch between currencies successfully
