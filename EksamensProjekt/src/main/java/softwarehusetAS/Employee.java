package softwarehusetAS;
import java.util.Arrays;
import java.util.ArrayList;

public class Employee {
	private double hours1 = 0;
	private String initials;
	private ArrayList<Activity> activities = new ArrayList<Activity>();
	private ArrayList<Activity> activitiesAssisting = new ArrayList<Activity>();
	private ArrayList<Activity> standardActivity = new ArrayList<>
			(Arrays.asList(new Activity("sick",false), new Activity("maternity",false), new Activity("vacation",false), new Activity("education",false)));
	private boolean hasPermission = false;
	private int activeActivities1 = 0;
	private int approvedActivities = 10;
	
	public Employee(String initials) {
		this.initials = initials;
	}

	public void updateHours(double before, double after, Activity activity) throws OperationNotAllowedException  {
		if (!(activity.isActivityActive() && this.checkAvailability1())) {
				throw new OperationNotAllowedException("Activity is not active");
		} else {
			double newHours = after - before;
			activity.addToHours(newHours);
			hours1 = newHours + hours1;
		}
	}
	public void addHours(double hours, Activity activity) throws OperationNotAllowedException {
		if (!(activity.isActivityActive() && this.checkAvailability1())) {
			throw new OperationNotAllowedException("Activity is not active");
		} else {
			activity.addToHours(hours);
			hours1 = hours + hours1;
		}
	}

	public void assignActivity(Activity activity){
	if(this.checkAvailability1()){
		activities.add(activity);
		if (activity.isActivityActive()) {
        			activeActivities1++;
       		}
		}		
	}

	public Activity standardActivity(String name, double hours, int startWeek, int endWeek) throws OperationNotAllowedException{
		Activity standActivity=null;
		for (Activity a : standardActivity) {
			if (a.getName().equals(name)) {
				standActivity = a;
			}
		}
		if(standActivity==null){
			throw new OperationNotAllowedException("Enter valid standard activity");
		}
		standActivity.setIsActive();
		standActivity.setStartWeek(startWeek);
		standActivity.setEndWeek(endWeek);

		standActivity.addToHours(hours);

		return standActivity;
	}

	public void setHasPermission(boolean permission){
		hasPermission = permission;
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
		return activeActivities1 < approvedActivities;
	}
	
	public String getInitials() {
		return initials;
	}

	public void setApprovedActivities(int int1){
		approvedActivities = int1;
	}

	public int getApprovedActivities() {
		return approvedActivities;
	}
	
	public ArrayList<Activity> getActivities(){
		return activities;
	}

	public ArrayList<Activity> getAssisting(){
	    return activitiesAssisting;
	}

	public void askCoworker(Employee employee, Activity activity){
		employee.addEmployeeAssisting(activity);
	}

	public void addEmployeeAssisting(Activity activity){
		if (this.checkAvailability1()) {
			activity.addAssisting(this);
			this.activitiesAssisting.add(activity);
		}
	}
}
