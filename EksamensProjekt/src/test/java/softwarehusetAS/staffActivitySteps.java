	package softwarehusetAS;
import io.cucumber.java.en.*;



import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;
public class staffActivitySteps {

	private ProjectManager projectManager;
	private Project project1;
	private Employee employee;
	private Employee employeeProjectManager;
	private Company company;
	private Activity activity;
	
	public staffActivitySteps(Company company){
		this.company = company;
	}
	
	@Given("a project manager {string} has a project {string} {string} with an activity {string}")
	public void a_project_manager_has_a_project_with_an_activity(String managerName, String projectName, String projectNumber, String activityName) {
		project1 = company.addProject(projectName, projectNumber);
	    employeeProjectManager = company.addEmployee(managerName);
	    projectManager = project1.setManager(employeeProjectManager);
	    activity =  projectManager.addActivity(project1, activityName, true, company);
	}

	@Given("an employee {string} is available")
	public void an_employee_is_available(String name) {
	   employee = company.addEmployee(name);
		
	}

	@When("the project manager assigns the employee to the activity")
	public void the_project_manager_assigns_the_employee_to_the_activity() {
	    projectManager.staffActivity(employee, activity,company,project1);
	}

	@Then("the employee is assigned to the activity")
	public void the_employee_is_assigned_to_the_activity() {
	    assertTrue(activity.getEmployees().contains(employee));
	    assertTrue(employee.getActivities().contains(activity));
	}

	@Given("the employee {string} is unavailable")
	public void the_employee_is_unavailable(String name) {
	    employee = company.addEmployee(name);
	    employee.setActiveActivities(10);
	}

	@Then("the employee is not assigned to the activity")
	public void the_employee_is_not_assigned_to_the_activity() {
		assertFalse(activity.getEmployees().contains(employee));
	    assertFalse(employee.getActivities().contains(activity));
	}
}
