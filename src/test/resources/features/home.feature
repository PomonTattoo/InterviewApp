Feature: Home page tests

  Background: Navigate to InterviewApp
    Given I open URL of login page

    @test1
    Scenario: Login Test
    When I enter username "test@yahoo.com"
    When I enter password "test123"
    And I click a button "Login"

#    @test2
#    Scenario: IN1 Page Title
#      Then Verify title of the page




