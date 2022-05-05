@regressionTest
@register
Feature:User should be able to register to the system successfully
  Scenario: User could register with valid data
    Given user open Register page
#     When user enter his Personal data
    When user choose gender "female"
    And user enter first name "Mary"
    And user enter last name "Malak"
    And user enter valid email address "maryloka@gmail.com"
    And user enter new password and confirm it "123456"
    And user click on Register button
    Then user could register successfully