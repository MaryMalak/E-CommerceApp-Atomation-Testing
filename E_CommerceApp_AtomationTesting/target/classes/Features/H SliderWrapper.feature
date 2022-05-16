@regressionTest

Feature:guest user will be able to open slider in home page

  Scenario: first slider is clickable on home page
    When user clicks on first slider
    Then relative product for first slider is displayed

  Scenario: second slider is clickable on home page
    When user clicks on second slider
    Then relative product for second slider is displayed