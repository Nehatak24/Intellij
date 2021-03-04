Feature: Change Password
  @Regression
  Scenario: Change Password successful
    Given I navigate to BmiGroup page
    When I Click on ProfileIcon
    And I change to new password
    Then I see password change successful