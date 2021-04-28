
Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials

    Given browser is openPF
    And user is on login pagePF
    When user enters <username> and <password>PF
    And user clicks on loginPF
    Then user is navigated to the home pagePF

    Examples:
      |username|password|
      |Jisan|12345|
      |Mursalin|12345|
      |Midul |12345|
