Feature: LoginBBC
  @loginBBC
  Scenario: Login BBC Account
    Given I navigate to BBC page
    When I click on weather
    And I am able to see WeatherPage successfully
    And I click on Bitesize
    Then I am able to see BitesizePage successfully
