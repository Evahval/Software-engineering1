package softwarehusetAS;
import java.util.*;
//Skrevet af Amalie H
public class Project {

	private String projectName;
	private String projectNumber;
	private ProjectManager projectManager;
	private Employee projectManager1;
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	
	public Project(String projectName, String projectNumber) {
		this.projectName = projectName;
		this.projectNumber = projectNumber;
	}
	
	public ArrayList<Activity> getActivity() {
		return activities;
	}
	
	public ProjectManager setManager(Employee employee) {
		ProjectManager projectManager = new ProjectManager(employee.getInitials());
		this.projectManager = projectManager;
		projectManager1 = employee;
		return projectManager;
		
	}
	
	public Employee getManager() {
		return projectManager1;
	}
	
	public void addActivityProject(Activity activity) {
		activities.add(activity);
	}
	
	public String getName() {
		return projectName;
	}
	public String getProjectNumber() {
		return projectNumber;
	}

	

}
