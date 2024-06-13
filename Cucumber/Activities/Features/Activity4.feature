@activity4
  Feature: data driver test with Example

    @loginTest
    Scenario:Testing with correct Data from input
      Given User should be on login page
      When the user enters "admin" and "password"
      And  click the login button
      Then get the confirmation text and verify message as "Welcome Back ,admin"

      @loginTest @loginfail
      Scenario:Testing with incorrect Data from input
        Given User should be on login page
        When the user enters "admin12" and "password12"
        And  click the login button
        Then get the confirmation text and verify message as "Invalid Credentials"
