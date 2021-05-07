Feature: Standard Activities
 Description : Each project has a set of standard activities (Vacation, sick leave, educational courses etc.), that the project manager can assign an employee to if necessary.
   Actors : Project manager

Scenario: An employee tries to register one day spent on a standard activity
    Given an employee "VHS"
    When the employee has typed in the reason "sick" and week 14 and the number of hours 8.0
    Then the employee will be registered on the activity in week 14

Scenario: An employee tries to register more than one day spent on a standard activity
    Given an employee "VHS"
    When the employee has typed in the reason "sick" and the start and end week 14 15 and the number of hours 37.0
    Then the employee will be registered on the activity in week 14 to 15

  Scenario: an employee tries to register time on non-standard activity
    Given an employee "VHS"
    When the employee tries to register 24.0 hours on "Partying" in week 4
    Then the error message "Enter valid standard activity" is displayed
