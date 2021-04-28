package softwarehusetAS;

import java.util.ArrayList;


public class Employee {
	private double hours = 0;
	private String initials;
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	private boolean hasPermission = false;
	private int activeActivities1 = 0;
	private int approvedActivities = 10;
	
	public Employee(String initials) {
		this.initials = initials;
	}
	
	public void updateHours(double hours, Activity activity) {
		activity.addToHours(hours);
	}
	
	public boolean checkAvailability() {
		int activeActivities = 0;
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
			if (activity.isActivityActive()) {
				activeActivities1++;
			}
		}
		else{
			System.out.println("Employee is unavailable");
		}
	}
	
	public void givePermission() {
		if (hasPermission == false) {
			hasPermission = true;
			approvedActivities = 20;
			
		}
	}
	
	public void takeAwayPermission() {
		if (hasPermission == true) {
			approvedActivities = 10;
			hasPermission = false;
		}
	
	}
	
	public boolean hasPermission() {
		return hasPermission;
	}
	
	public void setActiveActivities(int int1) {
		activeActivities1 = int1;
	}
	
	public int getActiveActivities() {
		return activeActivities1;
	}
	
	public boolean checkAvailability1() {
		
		if (activeActivities1 < approvedActivities) {
			return true;
		}
		else {
			
			return false;
			
		}
	}
	
	public int getApprovedActivities() {
		return approvedActivities;
	}
	
	public ArrayList<Activity> getActivities(){
		return activities;
	}
}
