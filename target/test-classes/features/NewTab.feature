Feature: Opening new tab
  @NewTab
  Scenario: Check new tab opens
    Given I navigate to BmiGroup page
    When I click MyLinks
    And I Click on BMI RoofProof App
    Then New tab Opens successfully