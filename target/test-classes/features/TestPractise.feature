Feature: BBC
  @BBC
  Scenario: Check BBC page
    Given I navigate to BBC page
    When I Click on Header iplayer
    Then I see iplayer page load
    And I Click on Local
    And I Enter Location
    Then I can see Location Page opens successfully
