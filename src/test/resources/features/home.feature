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
    And I click a navBtn "Enter"
    Then Verify the field displays "why 123 is not equals ###" you entered

@test6a
Scenario: As a user I should be able able to delete the question i have added
  When  I click a navBtn "Coding"
  And I click a windowBtn "Enter new question"
  And Enter content "what time is it?"
  And I click a navBtn "Enter"
  And  I click a "delete"
  Then Verify the field doesn't display "what time is it?" is deleted

@test6b
Scenario: As a user I should be able able to edit the question i have added
  When  I click a navBtn "Coding"
  And I click a windowBtn "Enter new question"
  And Enter content "what time is it?"
  And I click a navBtn "Enter"
  And I click "edit" button
  And I enter "It is 10"
  And I click "submit"
  Then Verify if "what time is it? It is 10" text changed

