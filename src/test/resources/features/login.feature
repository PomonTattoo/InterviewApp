Feature: Login page tests

  Background: Navigate to InterviewApp
    Given I open URL of login page

  Scenario: IN-1 Page Title
    Then Verify page title is "Interview App"

  @test1
  Scenario: Login Test
    When I enter username "test@yahoo.com"
    When I enter password "test123"
    And I click a button "Login"


