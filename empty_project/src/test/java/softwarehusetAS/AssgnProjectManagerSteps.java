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
	

	@Given("The employee {String} is available and there is a project {String} {int}")
	public void an_employee_is_available(String initials, String projectName, int projectNumber) {
		project1 = new Project(projectName, projectNumber);
		employee = new Employee(initials);
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
