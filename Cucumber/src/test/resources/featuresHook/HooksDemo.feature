Feature: feature to test google search functionality


@jisan
  Scenario Outline: Validate google search is working

    Given browser is open
    And user is on google search page
    When user enters a <text> in search box
    And hits enter
    Then user is navigated to search results

    Examples:
    |text|
    |Planet Earth|
    |Jisan       |
    |Mozart      |

  @mursalin
  Scenario Outline: Validate google search is working

    Given browser is open
    And user is on google search page
    When user enters a <text> in search box
    And hits enter
    Then user is navigated to search results

    Examples:
      |text|
      |Planet |
      |Chicken|


