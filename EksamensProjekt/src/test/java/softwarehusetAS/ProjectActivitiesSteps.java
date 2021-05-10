package softwarehusetAS;

import io.cucumber.java.en.*;



import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

public class ProjectActivitiesSteps {
	
	private ProjectManager projectManager;
	private Project project1;
	private Employee employee;
	private Employee employeeProjectManager;
	private Company company;
	private Activity activity;
	
	public ProjectActivitiesSteps(Company company){
		this.company = company;
	}
	
	@Given("A project manager {string} has a project {string} {string}")
	public void a_project_manager_has_a_project(String managerName, String projectName, String projectNumber) {
		project1 = company.addProject(projectName, projectNumber);
	    employeeProjectManager = company.addEmployee(managerName);
	    projectManager = project1.setManager(employeeProjectManager);
	}

	@When("the project mangager creates an activity {string}")
	public void the_project_mangager_creates_an_activity(String activityName) {
	   activity =  projectManager.addActivity(project1, activityName, true, company);
	}

	@Then("an activity is created")
	public void an_activity_is_created() {
	    project1.getActivity().contains(activity);
	}

	@Given("the project manager has added an activity {string}")
	public void the_project_manager_has_added_an_activity(String activityName) {
	    activity = projectManager.addActivity(project1, activityName, true, company);
	}

	@When("the project manager add a beginning week {int} and an ending week {int}")
	public void the_project_manager_add_a_beginning_week_and_an_ending_week(int int1, int int2) {
		activity.setStartWeek(int1);
		activity.setEndWeek(int2);
	}

	@Then("the activity has a beginning week and ending week")
	public void the_activity_has_a_beginning_week_and_ending_week() {
	    assertTrue(activity.getStartWeek() != 0);
		assertTrue(activity.getEndWeek() != 0);
	}

	@When("the project manager adds an estimated amount of weeks {int} as a timebudget")
	public void the_project_manager_adds_an_estimated_amount_of_weeks_as_a_timebudget(int estimateTime) {
	    activity.setTimeBudget(estimateTime);
	}
	
	@Then("the activity has a timebudget of x amounts of weeks")
	public void the_activity_has_a_timebudget_of_x_amounts_of_weeks() {
	    assertTrue(activity.getTimeBudget() != 0);
	}

	@Given("An active activity has an estimated time of {int} hours")
	public void an_active_activity_has_an_estimated_time_of_hours(int int1) {
	    activity.setTimeBudget(int1);
	}

	@When("the project manager corrects the estimated time to {int} hours")
	public void the_project_manager_corrects_the_estimated_time_to_hours(int int1) {
		activity.setTimeBudget(int1);
	}

	@Then("the activity has an estimated time of {int} hours")
	public void the_activity_has_an_estimated_time_of_hours(int int1) {
		assertEquals(int1, activity.getTimeBudget());
	}

	@Given("An activity is inactive")
	public void an_activity_is_inactive() {
	    activity.setIsActive();
	    assertFalse(activity.isActivityActive());
	}

	@Given("the inactive activity has an estimated time of {int} hours")
	public void the_inactive_activity_has_an_estimated_time_of_hours(int int1) {
	    activity.setTimeBudget(int1);
	}

	@When("the project manager updates the estimated time for the activity to {int} hours")
	public void the_project_manager_updates_the_estimated_time_for_the_activity_to_hours(int int1) {
	    activity.setTimeBudget(int1);
	}
	

	

}
