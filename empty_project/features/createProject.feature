Feature: Create a project.
	Description: An employee can create a project.
	Actor: Employee

Scenario: Project created
    Given Softwarehuset A/S is assigned a new project with name "test" and serial number "030901"
    And the start week 2 and the end week 5 is defined
    Then a project is created with a name, a serial number and year.