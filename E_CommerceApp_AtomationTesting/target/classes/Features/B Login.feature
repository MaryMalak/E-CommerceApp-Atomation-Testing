@regressionTest
@login
Feature: user should be able to login to the system

 Scenario: User could log in with valid email and password
  Given user open login page
  When user enter valid email "maryloka@gmail.com" and password "123456"
  And user click on login button
  Then user could login successfully

