package softwarehusetAS;

import io.cucumber.java.en.*;



import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Collections;

public class standardActivitiesSteps {
        private Company company;
        private Employee employee1;
        private Activity activity;
        private ErrorMessageHolder errorMessage;

        public standardActivitiesSteps(Company company, ErrorMessageHolder errorMessage){
                this.company=company;
                this.errorMessage=errorMessage;
        }

        @Given("an employee {string}")
        public void an_employee_is_in_the_system(String string) {
               employee1=company.addEmployee(string);
        }

        @When("the employee has typed in the reason {string} and week {int} and the number of hours {double}")
        public void the_employee_has_typed_in_the_reason_and_week_and_the_number_of_hours(String string, int int1, Double double1) throws OperationNotAllowedException {
               activity = employee1.standardActivity(string,double1,int1,int1);
        }


        @Then("the employee will be registered on the activity in week {int}")
        public void the_employee_will_be_registered_on_the_activity_in_that_week(int week) {
                assertTrue(activity.getStartWeek()==week);
                assertTrue(activity.getEndWeek()==week);
        }

        @When("the employee has typed in the reason {string} and the start and end week {int} {int} and the number of hours {double}")
        public void the_employee_has_typed_in_the_reason_and_the_start_and_end_week_and_the_number_of_hours(String string, int int1, int int2, Double double1) throws OperationNotAllowedException {
                activity = employee1.standardActivity(string,double1,int1,int2);
        }

        @Then("the employee will be registered on the activity in week {int} to {int}")
        public void the_employee_will_be_registered_on_the_activity_in_week_to(int int1, int int2) {
                assertTrue(activity.getStartWeek()==int1);
                assertTrue(activity.getEndWeek()==int2);
        }

        @When("the employee tries to register {double} hours on {string} in week {int}")
        public void the_employee_tries_to_register_hours_on_in_week(Double double1, String string, int int1) throws OperationNotAllowedException {
                try {
                        activity = employee1.standardActivity(string,double1,int1,int1);
                } catch (OperationNotAllowedException e) {
                        errorMessage.setErrorMessage(e.getMessage());
                }
        }

        @Then("the error message {string} is displayed")
        public void the_error_message_is_displayed(String string) {
                assertEquals(errorMessage, this.errorMessage);
        }
}
