package softwarehusetAS;
 
public class ProjectManager extends Employee{

	public ProjectManager(String initials) {
		super(initials);
		
	}
	
	public void addActivity(Project project, String activityName, boolean isActive) {
		Activity activity = new Activity(activityName,isActive);
		project.addActivityProject(activity);
	}
	
	public void staffActivity(Employee employee, Activity activity) {
		if (checkEmployeeAvailability(employee)) {
			activity.staffActivity(employee);
		}
		else {
			System.out.println("Employee is unavailable");
		}
	}
	
	//Speciel tilladelse ikke medtaget
	public boolean checkEmployeeAvailability(Employee employee) {
		return employee.checkAvailability();
	}
}
