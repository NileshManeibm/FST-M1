@activity2
Feature: Activity to test the Login feature

  @loginTest
  Scenario: Succeful login
    Given User should be on login page
    When the user enters username and Password
    And  click the login button
    Then get the confirmation text and verify message