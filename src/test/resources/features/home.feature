Feature: Home page tests

  Background: Navigate to InterviewApp
    Given I open URL of login page
    When I enter username "test@yahoo.com"
    When I enter password "test123"
    Then I click a button "Login"

    @test2 ///PUSHING THIS AGAIN
    Scenario: IN-2 User Access
      Then Verify "Sign out" button is displayed

  @IN3
  Scenario: When I log in as any user there should always be 3 dashboards present
    Then Verify there are three items on dashboard:
      | All Topics  |
      | Coding      |
      | Soft skills |

  @IN4a
  Scenario: As a user I should have an option to add a statement in Do's sections
    When I click a button "Add do "
    Then I type "<Do something fun in 4 days>" in a "Do's" text field
    And I click a button "Enter"

  @IN4b
    Scenario: As a user I should have an option to add a statement in Dont's sections
    And I click a button "Add don't"
    And I type "<Do something fun in 5 days>" in a "Don't" text field
    And I click a button "Enter"

  @IN4c
  Scenario: Negative test: As a user I should have an option to add a statement in Do's sections
    When I click a button "Add do "
    Then I type "<!@#$#$%$#>" in a "Do's" text field
    And I click a button "Enter"

  @IN4d
  Scenario: Negative test: As a user I should have an option to add a statement in Dont's sections
    And I click a button "Add don't"
    And I type "<!@#$#$%$#>" in a "Don't" text field
    And I click a button "Enter"



