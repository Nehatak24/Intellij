Feature: LoginBBC
  @loginBBC
  Scenario: Login BBC Account successfully
    Given:I Navigate to BBCPage
    When I Enter my user details
    And I am able to login successfully
    When I click on Links
    Then I am able to see my Page successfully