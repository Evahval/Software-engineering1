package softwarehusetAS;

import java.util.ArrayList;

public class Employee {
	private double hours = 0;
	private String initials;
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	private boolean hasPermission = false;
	private int activeActivities = 0;
	private int approvedActivities = 10;
	
	public Employee(String initials) {
		this.initials = initials;
	}
	
	public void updateHours(double hours, Activity activity) {
		activity.addToHours(hours);
	}
	
	public boolean checkAvailability() {
		activeActivities = 0;
		if (activities.isEmpty()) {
			return true;
		}
		for (int i = 0 ; i < activities.size() ; i++) {
			if (activities.get(i).isActivityActive()) {
				activeActivities ++;
			}
		}
		if (activeActivities < approvedActivities) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getInitials() {
		return initials;
	}
	
	public void assignActivity(Activity activity){
		if (this.checkAvailability()){
			activities.add(activity);
		}
		else{
			System.out.println("Employee is unavailable");
		}
	}
	
	public void givePermission() {
		if (hasPermission=false) {
			approvedActivities = 20;
			hasPermission = true;
		}
	}
	public void takeAwayPermission() {
		if (hasPermission=true) {
			approvedActivities = 10;
			hasPermission = false;
		}
	}
	
}
