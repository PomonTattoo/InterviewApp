Feature: Home page tests

  Background: Navigate to InterviewApp
    Given I open URL of login page
    When I enter username "test@yahoo.com"
    When I enter password "test123"
    And I click a button "Login"

    @test2
    Scenario: IN-2 User Access
      Then Verify "Sign out" button is displayed

  @test5
  Scenario: As a user I need an option to add a question in dashboards like "Coding" and "Soft Skills".
  Question content should accept letter, number and any special characters.
    When  I click a navBtn "Coding"
    And I click a windowBtn "Enter new question"
    And Enter content "why 123 is not equals ###"
    And I click a windowBtn "Enter"
    Then Verify "why 123 is not equals ###" is dispayed

@test6
Scenario: As a user I should be able able to edit or delete the question i have added
  When  I click a navBtn "Coding"
  And I click a windowBtn "Enter new question"
  And Enter content "why 123 is not equals ###"
  And I click a windowBtn "Enter"
  Then Verify I can delete the content by pressing "delete"

