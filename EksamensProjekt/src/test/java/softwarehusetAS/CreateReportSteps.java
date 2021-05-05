package softwarehusetAS;
import io.cucumber.java.en.*;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;



public class CreateReportSteps  {
    private Company company;
    private Employee employee1;
    private Project project;
    private ProjectManager projectManager;

    public CreateReportSteps(Company company) {
        this.company = company;
    }

    @Given("the project {string} {string} and the project manager {string}")
    public void the_project_and_the_project_manager(String string, String string2, String string3) {
        project = company.addProject(string,string2);
        employee1 = company.addEmployee(string3);
        projectManager = project.setManager(employee1);
        assertTrue(employee1==project.getManager());
    }

    @Given("the project has {int} number of activities")
    public void the_project_has_number_of_activities(int activities) {
    for (int i = 1; i <= activities; i++){
        projectManager.addActivity(project,"Activity" + "" + i,true);
        }
    }
    
    @When("The project manager creates a report with the weekly time usage")
    public void the_project_manager_creates_a_report_with_the_weekly_time_usage() {
        projectManager.getReport(project);

    }

    @Then("the system provides a report with weekly time usage for each activity")
    public void the_system_provides_a_report_with_weekly_time_usage_for_each_activity() {
        System.out.println(projectManager.getReport(project));
        assertTrue(projectManager.getReport(project) != null);
    }
}


