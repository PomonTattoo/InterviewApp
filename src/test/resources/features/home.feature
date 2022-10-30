Feature: Home page tests

  Background: Navigate to InterviewApp
    Given I open URL of login page

    @test1
    Scenario: Login Test
    When I enter username "test@yahoo.com"
    When I enter password "test123"
    And I click a button "Login"

    @test2
    Scenario: IN-1 Page Title
      Then Verify page title is "Interview App"

    @test3
    Scenario: IN-2 User Access
      When I enter username "test@yahoo.com"
      When I enter password "test123"
      And I click a button "Login"
      Then Verify "Sign out" button is displayed



