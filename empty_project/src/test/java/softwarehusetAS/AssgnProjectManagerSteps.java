package softwarehusetAS;
import io.cucumber.java.en.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;
public class AssgnProjectManagerSteps {
	
	private Company company;
	
	public void AssignProjectManagerSteps(Company company) {
		this.company=company;
	}
	
	@Given("a project exists")
	public void a_project_exists() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("an employee is available")
	public void an_employee_is_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Softwarehuset A\\/S appoints an employee as project manager")
	public void softwarehuset_a_s_appoints_an_employee_as_project_manager() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the employee is assigned to the projec as the project manager.")
	public void the_employee_is_assigned_to_the_projec_as_the_project_manager() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
