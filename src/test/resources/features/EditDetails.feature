Feature: EditDetails
  @EditDetails
  Scenario: Edit Information Successfully
    Given I navigate to BMIGroupPage
    When I Click on ProfileIcon
    And I Click on Edit
    And I Enter my personal Details
    Then I am able to Edit my Details Successfully