Feature: Assigning a project manager to a project.
    Description: An employee should be able to be assigned to a project as the project manager.
    Actor: Softwarehuset A/S
    
    Scenario: Employee is assigned as a project manager.
	Given The employee "KLNJ" is available and there is a project "Project" 090807
	When Softwarehuset A/S appoints an employee as project manager
	Then the employee is assigned to the project as the project manager.