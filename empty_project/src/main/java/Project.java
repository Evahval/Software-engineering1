import java.util.*;
import softwarehusetAS.Activity;
import softwarehusetAS.Employee;

public class Project {

	private static String projectName;
	private static int projectNumber;
	private static Employee projectManager;
	private static ArrayList<Activity> activities = new ArrayList<Activity>();
	
	public Project(String projectName, int projectNumber) {
		this.projectName = projectName;
		this.projectNumber = projectNumber;
	}
	
	public static ArrayList<Activity> getActivity(Activity activity) {
		return activities;
	
	}
}
