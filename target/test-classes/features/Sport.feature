Feature: Sport
  @Sport
  Scenario: Check Sport page
    Given I navigate to BBC page
    When I click on sport
    Then I see sport page load successfully
