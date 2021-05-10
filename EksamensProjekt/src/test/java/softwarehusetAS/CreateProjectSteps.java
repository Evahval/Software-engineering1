package softwarehusetAS;
import io.cucumber.java.en.*;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

public class CreateProjectSteps {
	
	private Project project1;
	private Company company;
	
	public CreateProjectSteps(Company company) {
		this.company = company;
	}
	
	@SuppressWarnings("deprecation")
	@Given("Softwarehuset A\\/S is assigned a new project")
	public void softwarehuset_a_s_is_assigned_a_new_project() {

	}

	@When("Softwarehuset A\\/S creates a new project with name {string} and the year {string}")
	public void softwarehuset_a_s_creates_a_new_project_with_name_and_the_year(String name, String year) {
		project1 = company.addProject(name,year);
		assertThat(project1.getName(),is(equalTo(name)));
		assertThat(project1.getProjectNumber(),is(equalTo(year.charAt(year.length()-2) + "" + year.charAt(year.length()-1)+"0001")));
	}

	@Then("a project is created with a name, a serial number and year.")
	public void a_project_is_created_with_a_name_a_serial_number_and_year() {
	    assertTrue(company.getProject().contains(project1));
	}
}
