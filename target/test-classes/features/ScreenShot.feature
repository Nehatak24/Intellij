Feature:ScreenShot

  @ScreenShot
  Scenario: Screenshot of FB is successful
    Given I navigate to facebook page
    Then  I am able to take screenshot successfully
