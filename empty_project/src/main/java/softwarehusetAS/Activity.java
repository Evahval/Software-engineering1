package softwarehusetAS;

import java.util.ArrayList;

public class Activity {

	private String name;
	private int timeBudget;
	private int startWeek;
	private int endWeek;
	private boolean isActive;
	private ArrayList<Employee> employee = new ArrayList<Employee>(); 
	
	public Activity(String name, boolean isActive) {
		this.name = name;
		this.isActive = isActive;
	}
	
	public void setTimeBudget(int timeBudget) {
		this.timeBudget = timeBudget;
	}
	
	public void setStartWeek(int startWeek) {
		this.startWeek = startWeek;
	}
	
	public void setEndWeek(int endWeek) {
		this.endWeek = endWeek;
	}
}
