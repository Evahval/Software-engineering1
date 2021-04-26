package softwarehusetAS;

import java.util.ArrayList;

public class Employee {
	private double hours;
	private String initials;
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	
	public Employee(double hours, String initials) {
		this.hours = hours;
		this.initials = initials;
	}
	
	public void updateHours(int hours, Activity activity) {
		
	}
}
