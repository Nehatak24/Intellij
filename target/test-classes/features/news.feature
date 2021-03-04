Feature: News
  @News
  Scenario: Check News page
    Given I navigate to BBC page
    When I click on News
    Then I see News page load successfully
