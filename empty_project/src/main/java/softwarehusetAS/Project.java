package softwarehusetAS;
import java.util.*;

public class Project {

	private String projectName;
	private int projectNumber;
	private Employee projectManager;
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	
	public Project(String projectName, int projectNumber) {
		this.projectName = projectName;
		this.projectNumber = projectNumber;
	}
	
	public ArrayList<Activity> getActivity(Activity activity) {
		return activities;
	
	}
	
	public void setManager(Employee employee) {
		projectManager = employee;
	}
	
	public Employee getManager() {
		return projectManager;
	}
}
