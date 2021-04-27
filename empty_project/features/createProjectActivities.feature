Feature: Project activities
	Description: A project manager divides a project into activities. 
	An activity is assigned an estimated time by the project manager. 
	The project manager can further assign a beginning week and an ending week 
	to the activity. 
	The project manager can add new activities before and during the project as
	well as correcting already registered activities. 
	Actor: Project manager
	
Scenario: A project manager creates an activity
    Given A project manager has a project
    When the project mangager creates an activity with a beginning week, an ending week and an estimated time
    Then an activity is created
	
Scenario: A project manager corrects an activity
	Given An activity has an estimated time of 25 hours
	When the project manager corrects the estimated time to 30 hours
	Then the activity has an estimated time of 30 hours
	
Scenario: Project manager corrects inactive activity
	Given An activity is inactive
	And the activity has an estimated time of 11 hours
	When the project manager updates the estimated time for the activity to 22 hours
	Then the activity has an estimated time of 22 hours