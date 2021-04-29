package softwarehusetAS;

import java.util.ArrayList;

public class Activity {

	private String name;
	private int timeBudget;
	private int startWeek;
	private int endWeek;
	private boolean isActive;
	private ArrayList<Employee> employees = new ArrayList<Employee>(); 
	private ArrayList<Employee> employeesAssisting = new ArrayList<Employee>();
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
		hoursOnActivity = hoursOnActivity + hours;
	}
	public boolean isActivityActive() {
		return isActive;
	}
	
	public void assignActivity(Employee employee) {
	    if(employee.checkAvailability1()){
	         employees.add(employee);
	    }
		
	}
	
	public String toString() {
		return name;
	}
	
	public Double getHours() {
		return hoursOnActivity;
	}
	
	public int getStartWeek(){
		return startWeek;
	}
	
	public int getEndWeek(){
		return endWeek;
	}
	
	public int getTimeBudget(){
		return timeBudget;
	}
	
	public void setIsActive(){
		isActive = !isActive;
	}
	
	public ArrayList<Employee> getEmployees(){
		return employees;
	}
	
	public ArrayList<Employee> getEmployeesAssisting(){
		return employeesAssisting;
	}
}
