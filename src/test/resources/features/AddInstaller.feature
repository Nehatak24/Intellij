Feature: AddInstaller
  @AddInstaller
  Scenario: Add Installer User successfully
    Given I navigate to BmiGroup page
    When I Click on ProjectIcon
    And I Click on Team
    And I Click on AddAnInstaller
    And I Select team member
    And I click on User
    Then Installer Added successfully

