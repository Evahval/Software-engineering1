package softwarehusetAS;

import io.cucumber.java.en.*;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

public class ProjectActivitiesSteps {
	
	private ProjectManager projectManager;
	private Project project1;
	private Employee employee;
	
	public ProjectActivitiesSteps(Employee employee, Project project1){
		this.employee = employee;
		this.project1 = project1;
	}
	
@Given("A project manager has a project")
public void a_project_manager_has_a_project() {
    assertEquals(projectManager, project1.getManager());
}

@When("the project mangager creates an activity with a beginning week, an ending week and an estimated time")
public void the_project_mangager_creates_an_activity_with_a_beginning_week_an_ending_week_and_an_estimated_time() {
    
}

@Then("an activity is created")
public void an_activity_is_created() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("An activity has an estimated time of {int} hours")
public void an_activity_has_an_estimated_time_of_hours(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the project manager corrects the estimated time to {int} hours")
public void the_project_manager_corrects_the_estimated_time_to_hours(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the activity has an estimated time of {int} hours")
public void the_activity_has_an_estimated_time_of_hours(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("An activity is inactive")
public void an_activity_is_inactive() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the activity has an estimated time of {int} hours")
public void the_activity_has_an_estimated_time_of_hours(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the project manager updates the estimated time for the activity to {int} hours")
public void the_project_manager_updates_the_estimated_time_for_the_activity_to_hours(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("a project manager has to staff an activity.")
public void a_project_manager_has_to_staff_an_activity() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("an employee can work up to {int} activities at once.")
public void an_employee_can_work_up_to_activities_at_once(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("an employee can be added to an acitivty if they are working on less than {int} activities at that time.")
public void an_employee_can_be_added_to_an_acitivty_if_they_are_working_on_less_than_activities_at_that_time(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("an employee is currently working on {int} activities.")
public void an_employee_is_currently_working_on_activities(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the project manager wants to add that employee to another activity.")
public void the_project_manager_wants_to_add_that_employee_to_another_activity() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the employee isn't approved to work on more than {int} activities.")
public void the_employee_isn_t_approved_to_work_on_more_than_activities(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the system will provide an error-message stating that the employee is not available for a new activity.")
public void the_system_will_provide_an_error_message_stating_that_the_employee_is_not_available_for_a_new_activity() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the employee is approved to work on up to {int} activities.")
public void the_employee_is_approved_to_work_on_up_to_activities(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the system will assign the employee as available for a new activity.")
public void the_system_will_assign_the_employee_as_available_for_a_new_activity() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
