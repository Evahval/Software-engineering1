package softwarehusetAS;
import io.cucumber.java.en.*;



import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

public class askCoworkerSteps {

	private Company company;
	private Employee employee1;
	private Employee employee2;
	private Project project1;
	private Activity activity1;
	
	
	public askCoworkerSteps(Company company) {
		this.company = company;
		
	}
	@Given("an employee {string} works on an activity {string}.")
	public void an_employee_works_on_an_activity(Employee employee1, String activity) {
	    this.employee1 = employee1;
	}

	@When("the employee asks another employee {string} for assistance with an activity.")
	public void the_employee_asks_another_employee_for_assistance_with_an_activity(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the the other employee is invited to work on the activity.")
	public void the_the_other_employee_is_invited_to_work_on_the_activity() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the employee {string} asks another employee {string} for assistance.")
	public void the_employee_asks_another_employee_for_assistance(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the other employee {string} has {int} or more activities")
	public void the_other_employee_has_or_more_activities(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the other employee {string} has not been allowed to have more activities.")
	public void the_other_employee_has_not_been_allowed_to_have_more_activities(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the the other employee is not assigned to the activity")
	public void the_the_other_employee_is_not_assigned_to_the_activity() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
