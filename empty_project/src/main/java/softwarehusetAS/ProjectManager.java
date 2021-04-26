package softwarehusetAS;
 
public class ProjectManager extends Employee{

	public ProjectManager(double hours, String initials) {
		super(hours, initials);
		
	}
	
	public void addActivity(Project project, String activityName, boolean isActive) {
		Activity activity = new Activity(activityName,isActive);
	}
	
}
