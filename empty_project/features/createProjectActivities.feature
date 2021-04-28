Feature: Project activities
	Description: A project manager divides a project into activities. 
	An activity is assigned an estimated time by the project manager. 
	The project manager can further assign a beginning week and an ending week 
	to the activity. 
	The project manager can add new activities before and during the project as
	well as correcting already registered activities. 
	Actor: Project manager
	
Scenario: A project manager  creates an activity 
    Given A project manager "JFHS" has a project "project" "859445"
    When the project mangager creates an activity "activity" 
    Then an activity is created
    
Scenario: A project manager adds a beginning week and an ending week
	Given A project manager "JFHS" has a project "project" "859445"
	And the project manager has added an activity "activity" 
	When the project manager add a beginning week 10 and an ending week 20
	Then the activity has a beginning week and ending week
	
Scenario: A project manager adds a timebudget to an activity
	Given A project manager "JFHS" has a project "project" "859445"
	And the project manager has added an activity "activity" 
	When the project manager adds an estimated amount of weeks 10 as a timebudget
	Then the activity has a timebudget of x amounts of weeks
	
Scenario: A project manager corrects an activity
	Given A project manager "JFHS" has a project "project" "859445"
	And the project manager has added an activity "activity" 
	And An active activity has an estimated time of 25 hours
	When the project manager corrects the estimated time to 30 hours
	Then the activity has an estimated time of 30 hours
	
Scenario: Project manager corrects inactive activity
	Given A project manager "JFHS" has a project "project" "859445"
	And the project manager has added an activity "activity" 
	And An activity is inactive
	And the inactive activity has an estimated time of 11 hours
	When the project manager updates the estimated time for the activity to 22 hours
	Then the activity has an estimated time of 22 hours