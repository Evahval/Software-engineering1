Feature: Register hour on an active activity
   Actor: Employee

Scenario: the employee registers hours on an activity that they are assigned
    Given there is an employee "EHA" 
	And the employee is assigned with the activity "activity"
    When the employee registers that they used 3.0 hours on the activity that day
    Then the 3.0 hours are registered 

 Scenario: The employee updates the hours they used on the activity
 	Given there is an employee "EHA" 
	And the employee is assigned with the activity "activity"
    When the employee updates the hours from 3.0 to 5.5 on the activity that day
    Then the hours spent that day is updated to 5.5

 Scenario: The employee registers hours on an acitivty that they are not assigned to
 	Given there is an employee "EHA" 
    And that the activity is active 
    And the employee is not assigned to the activity 
    When the employee registers that they used 3.0 hours on the activity that day
    Then the 3.0 hours are registered 

 Scenario: The employee registers hours on an activity that is not active
    Given that the activity "activity" is not active
    When the employee registers that they used 3.0 hours on the activity that day
    Then there comes an error message "The hours have not been updated" 
    
 Scenario: Employee has 10 or more activities.
	Given the employee has 10 or more activities.
	And the employee does not have permission to have more activities.
	When the employee registers 3.5 hours on the activity "activity"
	Then the system provides an error message, that the employee can't register the hours.