@regressionTest

Feature: user could reset his/her password successfully


  Scenario: User could reset his/her password successfully
    Given user go to login page
    When user click on "forgot password"
    And user enter email address "marymalak@gmail.com"
    And user click on Recover button
    Then user receive Email with instructions