package softwarehusetAS;
//Skrevet af Eva
import java.util.ArrayList;

public class ProjectManager extends Employee{
	public ProjectManager(String initials) {
		super(initials);
		
	}
	
	public Activity addActivity(Project project, String activityName, boolean isActive, Company company) {
		assert company.getProject().contains(project);
		Activity activity = new Activity(activityName,isActive);
		project.addActivityProject(activity);
		assert project.getActivity().contains(activity);
		return activity;

	}
	
	public void staffActivity(Employee employee, Activity activity, Company company, Project project) {
		assert company.getEmployees().contains(employee);
		assert project.getActivity().contains(activity);
		if (checkEmployeeAvailability(employee)) {
			activity.assignActivity(employee);
			employee.assignActivity(activity);
			assert activity.getEmployees().contains(employee);
			assert employee.getActivities().contains(activity);
		}
		else {
			System.out.println("Employee is unavailable");
			assert !(activity.getEmployees().contains(employee));
			assert !(employee.getActivities().contains(activity));
		}
	}
	
	public boolean checkEmployeeAvailability(Employee employee) {
		return employee.checkAvailability1();
	}
	public void giveEmployeePermission(Employee employee) {
		givePermission(employee);
	}
	public void takeAwayEmployeePermission(Employee employee) { takeAwayPermission(employee);
	}

	public ArrayList<String> getReport(Project project){
		ArrayList<String> report = new ArrayList<String>();
		for (Activity a : project.getActivity()){
			String str = a.getName() + " " + String.valueOf(a.getHours());
			report.add(str);
		}
		return report;
	}

	public void givePermission(Employee employee) {
		if (employee.hasPermission() == false) {
			employee.setHasPermission(true);
			employee.setApprovedActivities(20);

		}
	}

	public void takeAwayPermission(Employee employee) {
		if (employee.hasPermission() == true) {
			employee.setApprovedActivities(10);
			employee.setHasPermission(false);
		}
	}

}
