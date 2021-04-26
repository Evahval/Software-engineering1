package softwarehusetAS;
import java.util.*;

public class Project {

	private String projectName;
	private int projectNumber;
	private Employee projectManager;
	private int startWeek;
	private int endWeek;
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	
	public Project(String projectName, int projectNumber) {
		this.projectName = projectName;
		this.projectNumber = projectNumber;
	}
	
	public void setStartWeek(int startWeek) {
		this.startWeek = startWeek;
	}
	
	public void setEndWeek(int endWeek) {
		this.endWeek = endWeek;
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
	
	public void addActivityProject(Activity activity) {
		activities.add(activity);
	}
	
	public String getName() {
		return projectName;
	}
	public int getProjectNumber() {
		return projectNumber;
	}
	
	public int getStartWeek() {
		return startWeek;
	}
	
	public int getEndWeek() {
		return endWeek;
	}
	
	public String toString() {
		return projectName + " " + projectNumber;
	}
}
