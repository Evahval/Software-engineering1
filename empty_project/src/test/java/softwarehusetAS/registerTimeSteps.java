package softwarehusetAS;
import io.cucumber.java.en.*;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

import softwarehusetAS.ErrorMessageHolder;
import softwarehusetAS.OperationNotAllowedException;

public class registerTimeSteps {

	private Company company;
	private Employee employee;
	private Project project1;
	private Activity activity1;
	private ErrorMessageHolder errorMessageHolder;
	
	public registerTimeSteps(Company company,ErrorMessageHolder errorMessageHolder) {
		this.company = company;
		this.errorMessageHolder = errorMessageHolder;
	}

	@Given("there is an employee {string}")
	public void there_is_an_employee(String string) {
	    employee = company.addEmployee(string);
	}

	@Given("there is a project {string} {string}")
	public void there_is_a_project(String name, String number) {
    	project1 = company.addProject(name, number);
	}

	@Given("there is an active activity {string}")
	public void there_is_an_active_activity(String string) {
		activity1 = new Activity(string, true);
	}

	@Given("the employee is assigned the activity")
	public void the_employee_is_assigned_the_activity() {
		employee.assignActivity(activity1);
	}
	
	@When("the employee registers that they used {int} hours on the activity that day")
	public void the_employee_registers_that_they_used_hours_on_the_activity_that_day(Integer int1) {
		employee.updateHours((double) int1, activity1);
	}
	
	@Then("the {int} hours are registered")
	public void the_hours_are_registered(Integer int1) {
		assertEquals(activity1.getHours(),int1);
	}
	
	
	
	@Given("that the activity is active")
	public void the_project_is_active() {
		assertTrue(activity1.isActivityActive());
	}
	
	@When("the employee update that they have used {int} hours on the activity that day")
	public void the_employee_update_that_they_have_used_hours_on_the_activity_that_day(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("the hours used that day is updated to {int}")
	public void the_hours_used_that_day_is_updated_to(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@Given("the employee is not assigned to the activity {string}")
	public void the_employee_is_not_assigned_to_the_activity(String activityName) {
		Activity activity2 = new Activity(activityName, true);
		assertFalse(activity2.getEmployees().contains(employee));
	}



	@Given("that the activity is not active")
	public void that_the_activity_is_not_active() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@Then("there comes an error message {string}")
	public void there_comes_an_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the employee registers hours.")
	public void the_employee_registers_hours() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the employee has {int} or more activities.")
	public void the_employee_has_or_more_activities(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the employee has not been allowed to have more activities.")
	public void the_employee_has_not_been_allowed_to_have_more_activities() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the system provides an error message, that the employee can't register the hours.")
	public void the_system_provides_an_error_message_that_the_employee_can_t_register_the_hours() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
