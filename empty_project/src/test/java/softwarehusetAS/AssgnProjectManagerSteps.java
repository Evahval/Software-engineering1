package softwarehusetAS;
import io.cucumber.java.en.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;
public class AssgnProjectManagerSteps {
	
	private Company company;
	private Employee employee;
	
	public void AssignProjectManagerSteps(Company company) {
		this.company=company;
	}
	

	@Given("The employee is available")
	public void an_employee_is_available(Employee employee) {
		assertTrue(employee.checkAvailability());
	}

	@Then("Softwarehuset A/S assigns the employee as the project manager of the project.")
	public void the_employee_is_assigned_to_the_projec_as_the_project_manager() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
