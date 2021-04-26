package softwarehusetAS;

import java.util.ArrayList;

public class Employee {
	private double hours = 0;
	private String initials;
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	private boolean isAvailability;
	
	public Employee(String initials) {
		this.initials = initials;
	}
	
	public void updateHours(int hours, Activity activity) {
		activity.addToHours(hours);
	}
	
	public boolean checkAvailability() {
		int activeActivities = 0;
		for (int i = 0 ; i < activities.size() ; i++) {
			if (activities.get(i).isActivityActive()) {
				activeActivities ++;
			}
		}
		if (activeActivities < 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getInitials() {
		return initials;
	}
	
}
