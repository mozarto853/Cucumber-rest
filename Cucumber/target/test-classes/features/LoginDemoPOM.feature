Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials

    Given browser is open2
    And user is on login page2
    When user enters <username> and <password>2
    And user clicks on login2
    Then user is navigated to the home page2

    Examples:
    |username|password|
    |Estelle Bright|12345|
    |Agate         |12345|
    |Joshua Bright |12345|
    |Reggie Fils   |12345|
