Feature: CheckHeaderLink
  @HeaderLink
  Scenario Outline: Checking HeaderLink
    Given I navigate to BBC page
    When I Click <HeaderLink>
    Then I see <HeaderLink> page
    Examples:
    | HeaderLink |
    |News        |
    |Weather     |
