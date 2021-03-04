Feature: Adduser
  @AddUser
  Scenario: Add user to project successfully
    Given I navigate to BmiGroup page
    When I click icon Team
    And I click on AddToProject
    And I click on FlatRoof
    Then I am able to add user successfully to project

