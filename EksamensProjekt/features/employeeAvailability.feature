Feature: Check if an employee is available for an activity.
    Description: The project manager has to to check which employees are available for a new activity.
    Actors: Project manager
    
Scenario: Check for available employees to join a new activity
    Given a project manager "HNKJ" of the project "project" "123" wants to check if employee is available
    And an employee "AJFH" is working on less than the allowed number activities
    Then the employee is available
    
 Scenario: Project manager tries to add an employee with 10 activities, who is not approved for more, to a new activity.
    Given an employee "AJFH" is currently working on 10 activities
    And the project manager "HNKJ" of the project "project" "123" wants to check if employee is available
    And the employee hasn't permission to work more than 10 activities
    Then the system will assign the employee as unavailable
    
 Scenario: Project manager tries to add an employee with 10 activities, who is approved to work on 20 activities, to a new activity
   	Given the project manager "HNKJ" of the project "project" "123" wants to check if employee "AJFH" is available
     And the employee is currently working on 10 activities
    And the employee has permission to work on more activities
    Then the system will assign the employee as available

 Scenario: The project manager gives an employee permission to work on up to 20 activities.
    Given the project manager "HNKJ" of the project "project" "123" wants to check if employee "AJFH" is available
    And the employee is already assigned to 10 activities
    And the employee is currently not permitted to work on more than 10 activities
    When the project manager gives the employee permission to work on up to 20 activities
    Then the employee is allowed to work on up to 20 activities

 Scenario: The Project manager takes away the permission to work on 20 activities
    Given a project manager "HNKJ" of the project "project" "123" wants to check if employee is available
    And the employee "AJFH" has permission to work on more activities
   When the project manager takes the permission away
   Then the employee is only allowed to work on 10 activities