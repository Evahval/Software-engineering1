package softwarehusetAS;

import java.util.ArrayList;

public class Activity {

	private String name;
	private int timeBudget;
	private int startWeek;
	private int endWeek;
	private boolean isActive;
	private ArrayList<Employee> employees = new ArrayList<Employee>(); 
	private double hoursOnActivity;
	
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
	
	public void addToHours(double hours) {
		hoursOnActivity =+ hours;
	}
	public boolean isActivityActive() {
		return isActive;
	}
	
	public void staffActivity(Employee employee) {
		employees.add(employee);
		
	}
	
	public String toString() {
		return name;
	}
	
	public Double getHours() {
		return hoursOnActivity;
	}
	
	public ArrayList<Employee> getEmployees(){
		return employees;
	}
}
