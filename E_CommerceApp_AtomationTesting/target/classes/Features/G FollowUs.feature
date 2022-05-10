@regressionTest
  Feature: Confirm 'Follow us' links open the corresponding website

    Background: User could log in with valid email and password
      Given user open login page
      When user enter valid email "marymalak@gmail.com" and password "123456"
      And user click on login button
      Then user could login successfully

    Scenario: Follow us' links open the corresponding website
      When  user click on Facebook logo under follow us text
      And user click on twitter logo under follow us text
      And user click on RSS logo under follow us text
      And user click on youtube logo under follow us text
      Then 'Follow us' links open the corresponding website successfully
