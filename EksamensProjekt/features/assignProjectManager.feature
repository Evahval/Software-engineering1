Feature: Assigning a project manager to a project.
    Description: An employee should be able to be assigned to a project as the project manager.
    Actor: Softwarehuset A/S
    
    Scenario: Employee is assigned as a project manager.
	Given The employee "KLNJ"
	And the project "project" with serial number "090400"
	And The employee is available
	When Softwarehuset A/S appoints an employee as project manager
	Then the employee is assigned to the project as the project manager.