Feature: AmazonLogin
  @AmazonLogin
  Scenario: Login to Amazon page successfully
    Given I navigate to Amazon Page
    When I click on sign page
    And I Enter my user details
    And I click on sign in
    Then I am able to login into Amazon page successfully
