Feature: Arts
  @Arts
  Scenario: Check Arts page
    Given I navigate to BBC page
    When I click on More
    And I click on Arts
    Then I see Arts page load successfully
