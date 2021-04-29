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

	@Given("the employee is assigned with the activity {string}")
    public void the_employee_is_assigned_with_the_activity(String string) {
        activity1 = new Activity(string, true);
    }
	
	@When("the employee registers that they used {double} hours on the activity that day")
	public void the_employee_registers_that_they_used_hours_on_the_activity_that_day(double double1) {
		employee.updateHours(double1, activity1);
	}
	
	@Then("the {double} hours are registered")
	public void the_hours_are_registered(double hours) {
		assertEquals(activity1.getHours(),hours, 0.01);
	}
	
	@Given("that the activity is active")
	public void the_project_is_active() {
		assertTrue(activity1.isActivityActive());
	}
	
    @When("the employee updates the hours from {double} to {double} on the activity that day")
    public void the_employee_updates_the_hours_from_to_on_the_activity_that_day(double before, double after) {
        employee.updateHours(before, activity1);
	    double newHours = after-before;
		employee.updateHours(newHours, activity1);
	}
	
    @Then("the hours spent that day is updated to {double}")
    public void the_hours_spent_that_day_is_updated_to(Double hours1) {
		assertEquals(hours1, activity1.getHours(), 0.01);
	}
	
	@Given("the employee is not assigned to the activity {string}")
	public void the_employee_is_not_assigned_to_the_activity(String activityName) {
		Activity activity2 = new Activity(activityName, true);
		assertFalse(activity2.getEmployees().contains(employee));
	}

	@Given("that the activity {string} is not active")
	public void that_the_activity_is_not_active(String string) {
		activity1.setIsActive();
	}
	
	@When("the employee registers {double} hours.")
		public void the_employee_registers_hours(double hours) {
	   		employee.updateHours(hours, activity1);
	}
	
	@Then("there comes an error message {string}")
	public void there_comes_an_error_message(String message) {
		assertTrue(0 == activity1.getHours());
		System.out.println(message);
	}

	@Given("the employee does not have permission to have more activities.")
	public void the_employee_does_not_have_permission_to_have_more_activities() {
		
    	assertFalse(employee.hasPermission());

	}

	@When("the employee has {int} or more activities.")
	public void the_employee_has_or_more_activities(int activities) {
 	    employee.setActiveActivities(activities);
 	    assertFalse(employee.checkAvailability1());
	}

    @When("the employee registers {double} hours on the activity {string}")
    public void the_employee_registers_hours_on_the_activity(double hours, String activity) {
        activity1 = new Activity(activity, true);
    }

	@Then("the system provides an error message, that the employee can't register the hours.")
	public void the_system_provides_an_error_message_that_the_employee_can_t_register_the_hours() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
