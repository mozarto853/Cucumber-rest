Feature: feature to test google search functionality

  @smoketest
Scenario Outline: Validate google search is working

  Given browser is open
  And user is on google search page
  When user enters a <text> in search box
  And hits enter
  Then user is navigated to search results
























    Examples:
  |text|
  |Estelle Bright|
  |Rean Scwarzer |
  |Dixie Kong    |
  |Resto Druid   |

  @regression
  Scenario Outline: Validate google search is working

    Given browser is open
    And user is on google search page
    When user enters a <text> in search box
    And hits enter
    Then user is navigated to search results

    Examples:
      |text|
      |Bowser|
      |Mario |
      |Dixie |
      |Daisy |

  @googletest
  Scenario Outline: Validate google search is working

    Given browser is open
    And user is on google search page
    When user enters a <text> in search box
    And hits enter
    Then user is navigated to search results

    Examples:
      |text|
      |Jisan|
      |Madany|
