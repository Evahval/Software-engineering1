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
	@Given("Softwarehuset A\\/S is assigned a new project with name {string} and the year {string}")
	public void softwarehuset_a_s_is_assigned_a_new_project_with_name_and_serial_number(String name, String year) {
		project1 = company.addProject(name, year);
		assertThat(project1.getName(),is(equalTo(name)));
		assertThat(project1.getProjectNumber(),is(equalTo(year.charAt(year.length()-2) + "" + year.charAt(year.length()-1)+"0001")));
	}

	@Given("the start week {int} and the end week {int} is defined")
	public void the_start_week_and_the_end_week_is_defined(int int1, int int2) {
		project1.setStartWeek(int1);
		project1.setEndWeek(int2);
		assertEquals(project1.getStartWeek(),int1);
		assertEquals(project1.getEndWeek(),int2);
	}

	@Then("a project is created with a name, a serial number and year.")
	public void a_project_is_created_with_a_name_a_serial_number_and_year() {
	    assertTrue(company.getProject().contains(project1));
	}
}