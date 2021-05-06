Feature : Standard Activities
  Description : Each project has a set of standard activities (Vacation, sick leave, educational courses etc.), that the project manager can assign an employee to if necessary.
    Actors : Project manager

Scenario : The standard activities are added in a new project
    Given Softwarehuset A/S creates a new project with name "test" and year "2003".
    When the project is created with name and serial number
    Then the standard activities "vacation", "Sick leave" and "educational courses" are added to the project.

Scenario : Project manager tries to add standard activities to a new project
    Given a new project with name "test" and year "2003" is created.
    And the standard activities "vacation", "Sick leave" and "educational courses" activities are created
    And the project manager tries to create a standard activity.
    Then the system will provide an error-message, stating the standard activities have already been created.