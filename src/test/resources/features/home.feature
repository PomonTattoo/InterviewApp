Feature: Home page tests

  Background: Navigate to InterviewApp
    Given I open URL of login page
    When I enter username "test@yahoo.com"
    When I enter password "test123"
    Then I click a button "Login"


 
 @test5
  Scenario: As a user I need an option to add a question in dashboards like "Coding" and "Soft Skills".
  Question content should accept letter, number and any special characters.
    When  I click a navBtn "Coding"
    And I click a windowBtn "Enter new question"
    And Enter content "why 123 is not equals ###"
    And I click a windowBtn "Enter"
    Then Verify "why 123 is not equals ###" is dispayed

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


  @Test07
  Scenario: Verify All Topics button is enable
    Then : Verify All Topics button is enable

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

    @IN-9
    Scenario: Test Sign Out button navigate back to log in page
      Then I click a button sign out

    @IN-10
    Scenario: Test admin logs in Manage Access button is visible
      Given I open URL of login page
      Then I enter username "admin@yahoo.com"
      And I enter username "admin123"
      And I click a button "LOGIN"
      Then Verify link text "Manage Access" is display







