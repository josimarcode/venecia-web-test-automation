@JiraXray-[TestSet]
Feature: My Informations user

  Background:
    Given I am on the login page

  @JiraXray-[Test] @HappyPath @MyInfo @CP001
  Scenario: Register the user
    When I enter valid credentials
      | username | password |
      | Admin    | admin123 |
    When I choose the "My Info" option in the dashboard options menu
    And register the personal data of the user
      | midlename | nickname |
      | smith     | ZETA     |
    And register the employee data of the user
      | otherId | licenseNumber | licenseExpired | SSNumber | SINumber |
      | 123     | AGUILA        | 1989-05-03     | 456778   | PNP123   |
    And register the additional data of the employee
      | nationality | marital | date       | gender | military |
      | Pakistani   | Married | 1989-05-03 | Male   | service  |