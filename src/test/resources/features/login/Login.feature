@JiraXray-[TestSet]
Feature: Login Orange HRM
  As a registered user
  I want to be able to login to the web app
  To access my account and use its features

  Background:
    Given I am on the login page

  @JiraXray-[Test] @HappyPath @Login @CP001
  Scenario: Login successful
    When I enter valid credentials
      | username | password |
      | Admin    | admin123 |
    Then I should be logged in and redirected to dashboard the Orange HRM

  @JiraXray-[Test] @HappyPath @Login @CP002
  Scenario: Login failed with incorrect credentials
    When I enter invalid credentials
      | username | password |
      | Admin    | admin    |
    Then I should see an error message indicating login failure "Invalid credentials"

  @JiraXray-[Test] @HappyPath @Login @CP003
  Scenario: Login failed with empty fields
    When I leave the username or password fields empty
      | username | password |
      |          |          |
    Then I should see an error message indicating login failure "Required"