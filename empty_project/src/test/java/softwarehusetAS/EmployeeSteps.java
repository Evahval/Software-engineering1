package softwarehusetAS;

import io.cucumber.java.en.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;
import io.cucumber.java.PendingException;

public class EmployeeSteps {
	
	private Project project1;
	private Company company;
	private Employee employee;
	
	public EmployeeSteps(Company company) {
		this.company = company;
	}
	
	@Given("an employee with initials {string} is working at softwarehusetAS")
	public void an_employee_with_initials_is_working_at_softwarehuset_as(String initials) {
		employee=company.addEmployee(initials);
	}

	@Then("the employee is defined by up to four initials.")
	public void the_employee_is_defined_by_up_to_four_initials() {
		for (Employee e : company.getEmployees()){
			assertTrue(e.getInitials().length() <= 4 && e.getInitials().length() > 0);
		}
	}
}