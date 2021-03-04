Feature:Login

  @login
  Scenario: Login is successful
    Given I navigate to BBC page
    When  I click signin link
    And   I enter my valid userdetails
    And   I click login
    Then  I am able to login successfully

