Feature: Staffing
        Description: A project manager is given a project. They allocates staff to the project based on the availability of employees, and the estimated time for each activity. More than one employee can be assigned to each activity.
        Actor: Project manager
	
Scenario: Project manager is staffing an activity
        Given a project manager "JGHF" has a project "project" "040404" with an activity "activity"
        And an employee "EHA" is available
        When the project manager assigns the employee to the activity
        Then the employee is assigned to the activity
	
Scenario:  Project manager is staffing an activity with unavailable employee
        Given a project manager "JGHF" has a project "project" "040404" with an activity "activity"
        And  the employee "EHA" is unavailable
        When the project manager assigns the employee to the activity
        Then the employee is not assigned to the activity
