Feature: Home page tests

  Background: Navigate to InterviewApp
    Given I open URL of login page
    When I enter username "test@yahoo.com"
    When I enter password "test123"
    And I click a button "Login"

  @Test07
  Scenario: Verify All Topics button is enable
    Then : Verify All Topics button is enable



