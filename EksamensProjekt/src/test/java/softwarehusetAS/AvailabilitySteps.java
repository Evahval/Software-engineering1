package softwarehusetAS;
import io.cucumber.java.en.*;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

public class AvailabilitySteps {

	private ProjectManager projectManager;
	private Project project1;
	private Employee employee1;
	private Employee employeeProjectManager;
	private Company company;
	
	public AvailabilitySteps(Company company){
		this.company = company;
	}
	
	@Given("a project manager {string} of the project {string} {string} wants to check if employee is available")
	public void a_project_manager_of_the_project_wants_to_check_if_employee_is_available(String managerName, String projectName, String projectNumber) {
	    project1 = company.addProject(projectName, projectNumber);
	    employeeProjectManager = company.addEmployee(managerName);
	    projectManager = project1.setManager(employeeProjectManager);
	    
	}

	@Given("an employee {string} is working on less than the allowed number activities")
	public void an_employee_is_working_on_less_than_activities(String string) {
		employee1 = company.addEmployee(string);
	    assertTrue(employee1.getActiveActivities()<employee1.getApprovedActivities());
	}

	@Then("the employee is available")
	public void the_employee_is_available() {
	   assertTrue(projectManager.checkEmployeeAvailability(employee1));
	}

	@Given("an employee {string} is currently working on {int} activities")
	public void an_employee_is_currently_working_on_activities(String initials, int activities) {
	   employee1 = company.addEmployee(initials);
	  employee1.setActiveActivities(activities);
	  assertEquals(employee1.getActiveActivities(),activities);
	}

	@Given("the project manager {string} of the project {string} {string} wants to check if employee is available")
	public void the_project_manager_of_the_project_wants_to_check_if_employee_is_available(String managerName, String projectName, String projectNumber) {
	    project1 = company.addProject(projectName, projectNumber);
	    employeeProjectManager = company.addEmployee(managerName);
	    projectManager = project1.setManager(employeeProjectManager);
	    
	}

	@Given("the employee hasn't permission to work more than {int} activities")
	public void the_employee_hasn_t_permission_to_work_more_than_activities(int int1) {
	    assertEquals(int1,employee1.getApprovedActivities());
	}

	@Then("the system will assign the employee as unavailable")
	public void the_system_will_assign_the_employee_as_unavailable() {
		assertFalse(projectManager.checkEmployeeAvailability(employee1));
		
	}
	
	@Given("the project manager {string} of the project {string} {string} wants to check if employee {string} is available")
	public void the_project_manager_of_the_project_wants_to_check_if_employee_is_available(String managerName, String projectName, String projectNumber, String employee) {
	    employee1 = company.addEmployee(employee);
	    project1 = company.addProject(projectName, projectNumber);
	    employeeProjectManager = company.addEmployee(managerName);
	    projectManager = project1.setManager(employeeProjectManager);
	}
	
	@Given("the employee is currently working on {int} activities")
	public void the_employee_is_currently_working_on_activities(int activities) {
		employee1.setActiveActivities(activities);
		assertEquals(employee1.getActiveActivities(),activities);
	}

	@Given("the employee has permission to work on more activities")
	public void the_employee_has_permission_to_work_on_more_activities() {
	    projectManager.giveEmployeePermission(employee1);
	    assertTrue(employee1.hasPermission());
	}

	@Then("the system will assign the employee as available")
	public void the_system_will_assign_the_employee_as_available() {
		projectManager.giveEmployeePermission(employee1);
	   assertTrue(projectManager.checkEmployeeAvailability(employee1));
	}

}
