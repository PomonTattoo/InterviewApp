Feature: Home page tests

  Background: Navigate to InterviewApp
    Given I open URL of login page
    When I enter username "test@yahoo.com"
    When I enter password "test123"
    And I click a button "Login"

    @test2
    Scenario: IN-2 User Access
      Then Verify "Sign out" button is displayed



