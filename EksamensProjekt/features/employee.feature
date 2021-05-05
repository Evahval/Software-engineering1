Feature: Employee
	Description: A new employee is defined in the system.
	Actor: Project manager

Scenario: An employee is defined in the system.
	Given an employee with initials "EHA" is working at softwarehusetAS
	Then the employee is defined by up to four initials.