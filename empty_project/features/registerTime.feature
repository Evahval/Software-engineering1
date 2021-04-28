Feature: Register hour on an active activity
   Actor: Employee

Scenario: the employee registers hours on an activity that they are assigned
    Given there is an employee "EHA" 
	And there is a project "project" 123
	And there is an active activity "activity" 
	And the employee is assigned the activity 
    When the employee registers that they used 3 hours on the activity that day
    Then the 3 hours are registered 

 Scenario: The employee updates the hours they used on the activity
    Given that the activity is active
    When the employee update that they have used 5 hours on the activity that day
    Then the hours used that day is updated to 5

 Scenario: The employee registers hours on an acitivty that they are not assigned to
    Given that the activity is active 
    And the employee is not assigned to the activity "FUN"
    When the employee register that they used 3 hours on the activity that day
    Then the 3 hours are registered 

 Scenario: The employee registers hours on an activity that is not active
    Given that the activity is not active
    When the employee register that they used 3 hours on the activity that day
    Then there comes an error message "the activity is not active" 
    
 Scenario: Employee has 10 or more activities.
	When the employee registers hours.
	And the employee has 10 or more activities.
	And the employee has not been allowed to have more activities.
	Then the system provides an error message, that the employee can't register the hours.