Feature: Home page tests

  Background: Navigate to InterviewApp
    Given I open URL of login page
    When I enter username "test@yahoo.com"
    When I enter password "test123"
    And I click a button "Login"

  @IN3
  Scenario: When I log in as any user there should always be 3 dashboards present
    Then Verify there are three items on dashboard:
      | All Topics  |
      | Coding      |
      | Soft skills |

  @IN4
  Scenario: As a user I should have an option to add a statement in Do's and Dont's sections
    Then




