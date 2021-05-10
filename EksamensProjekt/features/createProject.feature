Feature: Create a project.
	Description: An employee can create a project.
	Actor: Employee

Scenario: Project created
    Given Softwarehuset A/S is assigned a new project
    When Softwarehuset A/S creates a new project with name "test" and the year "2018"
    Then a project is created with a name, a serial number and year.