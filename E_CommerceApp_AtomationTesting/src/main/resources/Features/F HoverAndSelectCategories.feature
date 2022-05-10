@regressionTest
Feature: Logged user could hover and select different Categories

  Background: User could log in with valid email and password
    Given user open login page
    When user enter valid email "marymalak@gmail.com" and password "123456"
    And user click on login button
    Then user could login successfully

    Scenario: user could hover and select different Categories
      When user Select random category ("computers") then hover and open sub-Category if found ("desktops")
      Then user could hover and select different Categories successfully
