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
	private Activity activity1;
	private ErrorMessageHolder errorMessage;
	
	public registerTimeSteps(Company company,ErrorMessageHolder errorMessage) {
		this.company = company;
		this.errorMessage = errorMessage;
	}

	//Første scenario
	@Given("there is an employee {string}")
	public void there_is_an_employee(String string) {
	    employee = company.addEmployee(string);
	}

	@Given("the employee is assigned with the activity {string}")
	public void the_employee_is_assigned_with_the_activity(String string) {
		activity1 = new Activity(string, true);
		activity1.assignActivity(employee);
		employee.assignActivity(activity1);
	}

	@When("the employee registers that they used {double} hours on the activity that day")
	public void the_employee_registers_that_they_used_hours_on_the_activity_that_day(double double1) {

			try {
				employee.addHours(double1, activity1);
			} catch (OperationNotAllowedException e) {
				errorMessage.setErrorMessage(e.getMessage());
			}
	}
	
	@Then("the {double} hours are registered")
	public void the_hours_are_registered(double hours) {
		assertEquals(activity1.getHours(),hours, 0.01);
	}

	//Næste scenarie 2
	@Given("there is an active activity {string}")
	public void there_is_an_active_activity(String string) {
		activity1 = new Activity(string, true);
		assertTrue(activity1.isActivityActive());
	}

    @When("the employee updates the hours from {double} to {double} on the activity that day")
    public void the_employee_updates_the_hours_from_to_on_the_activity_that_day(double before, double after) {
		try {
			employee.addHours(before, activity1);
		} catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}
		try {
			employee.updateHours(before,after, activity1);
		} catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}

	}
	
    @Then("the hours spent that day is updated to {double}")
    public void the_hours_spent_that_day_is_updated_to(Double hours1) {
		assertEquals(hours1, activity1.getHours(), 0.01);
	}

	//Næste Scenarie 3

	@Given("that the activity {string} is active")
	public void that_the_activity_is_active(String string) {
		activity1 = new Activity(string, true);
	}

	@Given("the employee {string} is not assigned to the activity")
	public void the_employee_is_not_assigned_to_the_activity(String string) {
		employee = company.addEmployee(string);
		assertFalse(activity1.getEmployees().contains(employee));
	}

	@When("the employee registers {double} hours.")
		public void the_employee_registers_hours(double hours) {
		try {
			employee.addHours(hours, activity1);
		} catch (OperationNotAllowedException e) {
			errorMessage.setErrorMessage(e.getMessage());
		}

	}

	//Næste scenario 4

	@Given("that the activity {string} is not active")
	public void that_the_activity_is_not_active(String string) {
		activity1  = new Activity(string,true);
		activity1.setIsActive();
	}

	@Then("there comes an error message {string}")
	public void there_comes_an_error_message(String string) throws Exception{
		assertEquals(errorMessage, this.errorMessage);
		assertFalse(activity1.isActivityActive());
	}

	//Næste scenario 5

	@Given("there is an employee {string} that does not have permission to have more activities")
	public void there_is_an_employee_that_does_not_have_permission_to_have_more_activities(String string) {
		employee = company.addEmployee(string);
	}

	@When("the employee has {int} activities.")
	public void the_employee_has_or_more_activities(int activities) {
 	    employee.setActiveActivities(activities);
 	    assertFalse(employee.checkAvailability1());
	}

    @When("the employee registers {double} hours on the activity {string}")
    public void the_employee_registers_hours_on_the_activity(double hours, String activity) {
        activity1 = new Activity(activity, true);
    }

	@Then("the system provides an error message {string}.")
	public void the_system_provides_an_error_message(String string) throws Exception{
			assertEquals(errorMessage, this.errorMessage);
	}


	
}
