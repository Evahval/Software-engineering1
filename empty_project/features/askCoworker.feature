Feature: Ask a coworker for assistance.
	Description: Employee asks a coworker for assistance on an activity.
	Actors: Employee.

Scenario: Employee asks a coworker for assistance.
	Given an employee "HDJF" works on an activity "activity".
	When the employee asks another employee "YPT" for assistance with an activity.
	Then the the other employee is invited to work on the activity.

 Scenario: Coworker has 10 or more activities.
	When the employee "HDJF" asks another employee "YPT" for assistance.
	And the other employee "YPT" has 10 or more activities 
	And the other employee "YPT" has not been allowed to have more activities.
	Then the the other employee is not assigned to the activity

