@regressionTest
  Feature: Confirm 'Follow us' links open the corresponding website

    Background: User could log in with valid email and password
      Given user open login page
      When user enter valid email "marymalak@gmail.com" and password "123456"
      And user click on login button
      Then user could login successfully

    Scenario: logged user open Facebook link
      When  user click on Facebook logo under follow us text
      Then "https://www.facebook.com/nopCommerce" is opened in new tab

    Scenario: logged user open twitter link
      When  user click on twitter logo under follow us text
      Then "https://twitter.com/nopCommerce" is opened in new tab

    Scenario: logged user open RSS link
      When  user click on RSS logo under follow us text
      Then "https://twitter.com/nopCommerce/RSS" is opened in new tab

    Scenario: logged user open youtube link
      When  user click on youtube logo under follow us text
      Then "https://www.youtube.com/user/nopCommerce" is opened in new tab
