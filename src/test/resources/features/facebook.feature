Feature: Login
  @loginFacebook
  Scenario: Login to facebook account
    Given I navigate to FacebookPage
    When I Enter my FacebookUserDetails
    Then I am able to Login successfully