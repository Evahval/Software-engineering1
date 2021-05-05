package softwarehusetAS;
import io.cucumber.java.en.*;



import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

public class askCoworkerSteps {

	private Company company;
	private Employee employee1;
	private Employee employee2;
	private Activity activity;
	
	
	public askCoworkerSteps(Company company) {
		this.company = company;
	}
	@Given("an employee {string} works on an activity {string}.")
	public void an_employee_works_on_an_activity(String employee, String activityName) {
	    employee1 = company.addEmployee(employee);
	    this.activity = new Activity(activityName, true);
	    activity.assignActivity(employee1);
	    employee1.assignActivity(activity);
		assertTrue(activity.getEmployees().contains(employee1));
	    assertTrue(employee1.getActivities().contains(activity));
	}

	@When("the employee invites another employee {string} for assistance with an activity.")
	public void the_employee_invites_another_employee_for_assistance_with_an_activity(String initials) {
	    employee2 = company.addEmployee(initials);
	    activity.assignActivity(employee2);
		employee2.assignActivity(activity);
	}

	@Then("the the other employee is added to the activity.")
	public void the_the_other_employee_is_added_to_the_activity() {
		assertTrue(activity.getEmployees().contains(employee2));
	    assertTrue(employee2.getActivities().contains(activity));
	}
	
	@When("the employee invites another employee {string} for assistance with an activity but the other employee is unavailable")
    	public void the_employee_invites_another_employee_for_assistance_with_an_activity_but_the_other_employee_is_unavailable(String initials) {
    	    employee2 = company.addEmployee(initials);
    	    employee2.setActiveActivities(10);
    	    assertFalse(employee2.checkAvailability1());
    	    activity.assignActivity(employee2);
    		employee2.assignActivity(activity);
    	}

	@Then("the the other employee is not assigned to the activity")
	public void the_the_other_employee_is_not_assigned_to_the_activity() {
		assertFalse(activity.getEmployees().contains(employee2));
	    assertFalse(employee2.getActivities().contains(activity));
	}
}
