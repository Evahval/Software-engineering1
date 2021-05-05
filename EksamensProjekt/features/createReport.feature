Feature: Create report
  Description: A report is created by the project manager. The report shows the time spend for each activity during the last week.
  Actors: Project manager

  Scenario: The project manager creates a report
    Given the project "Project" "2018" and the project manager "HANS"
    And   the project has 12 number of activities
    When  The project manager creates a report with the weekly time usage
    Then  the system provides a report with weekly time usage for each activity