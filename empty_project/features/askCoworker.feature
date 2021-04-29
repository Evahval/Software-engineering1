Feature: Ask a coworker for assistance.
	Description: Employee asks a coworker for assistance on an activity.
	Actors: Employee.

Scenario: Employee asks a coworker for assistance.
	Given an employee "HDJF" works on an activity "activity".
	When the employee invites another employee "YPT" for assistance with an activity.
	Then the the other employee is added to the activity.

 Scenario: Coworker has 10 or more activities.
	Given an employee "HDJF" works on an activity "activity".
	When the employee invites another employee "YPT" for assistance with an activity but the other employee is unavailable
	Then the the other employee is not assigned to the activity

