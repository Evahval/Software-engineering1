package softwarehusetAS;
import io.cucumber.java.en.*;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

public class AvailabilitySteps {

	private ProjectManager projectManager;
	private Project project1;
	private Employee employee1;
	private Employee employee2;
	private ErrorMessageHolder errorMessageHolder;
	private Company company;
	
	public AvailabilitySteps(Company company, Project project1, ErrorMessageHolder errorMessageHolder){
		this.project1 = project1;
		this.errorMessageHolder = errorMessageHolder;
	}
	
	@Given("a project manager {string} of the project {string} {int} wants to check if employee is available")
	public void a_project_manager_of_the_project_wants_to_check_if_employee_is_available(String managerName, String projectName, int projectNumber) {
	    project1 = company.addProject(projectName, projectNumber);
	    employee1 = company.addEmployee(projectName);
	    project1.setManager(employee1);
	}

	@Given("an employee {string} is working on less than {int} activities")
	public void an_employee_is_working_on_less_than_activities(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the employee is available")
	public void the_employee_is_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("an employee {string} is currently working on {int} activities")
	public void an_employee_is_currently_working_on_activities(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the project manager {string} of the project {string} {int} wants to check if employee is available")
	public void the_project_manager_of_the_project_wants_to_check_if_employee_is_available(String managerName, String projectName, int projectNumber1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the employee hasn't permission to work more than {int} activities")
	public void the_employee_hasn_t_permission_to_work_more_than_activities(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the system will provide an error-message {string}")
	public void the_system_will_provide_an_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("an employee is currently working on {int} activities")
	public void an_employee_is_currently_working_on_activities(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the project manager {string} of the project {string} {int} wants to check if employee {string} is available")
	public void the_project_manager_of_the_project_wants_to_check_if_employee_is_available(String managerName, String projectName, int projectNumber, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("the employee has permission")
	public void the_employee_has_permission() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the system will assign the employee as available")
	public void the_system_will_assign_the_employee_as_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
