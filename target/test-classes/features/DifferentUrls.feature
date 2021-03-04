Feature: Different Urls
  @DifferentUrls
  Scenario Outline: Checking different Urls
    Given I navigate to BmiGroup page
    Then I type <Different Countries Urls>

    Examples:
    |Different Countries Urls|
    |it |
    |pl |
    |uk |
    |dk |
    |fi |
    |no |
    |my |
    |es |
    |se |
    |de |