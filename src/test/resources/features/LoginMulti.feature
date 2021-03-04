Feature: loginMulti
  @LoginMulti
  Scenario Outline: Login with different Users
    Given I navigate to BMIInTouchPage
    When I enter  <username> and <password>
    Then I am logged in with that user
    Examples:
    |username || password |
    |sheetal.samnani+1@bmigroup.com||password|
    |sheetal.samnani+777@bmigroup.com||password|
