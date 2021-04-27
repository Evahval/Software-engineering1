package softwarehusetAS;
import io.cucumber.java.en.*;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

import softwarehusetAS.ErrorMessageHolder;
import softwarehusetAS.OperationNotAllowedException;



public class AssgnProjectManagerSteps {
	
	private Company company;
	private Employee employee;
	private Project project1;
	
	public AssgnProjectManagerSteps(Company company) {
		this.company = company;
		
			}
	
	
	@Given("The employee {string} and the project {string} and {int}")
	public void the_employee_and_the_project_and(String initials, String projectName, int projectNumber) {
		employee = company.addEmployee(initials);
		project1 = company.addProject(projectName, projectNumber);
	}

	@Given("The employee is available")
	public void the_employee_is_available() {
	    assertTrue(employee.checkAvailability());
	}
	
	@When("Softwarehuset A\\/S appoints an employee as project manager")
	public void softwarehuset_a_s_appoints_an_employee_as_project_manager() {
		project1.setManager(employee);
	}
	

	@Then("the employee is assigned to the project as the project manager.")
	public void the_employee_is_assigned_to_the_project_as_the_project_manager() {
	   assertEquals(employee,project1.getManager());
	   
	}
}
