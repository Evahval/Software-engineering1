package softwarehusetAS;
import java.util.*;
public class Company {
	
	private ArrayList<Project> projects = new ArrayList<Project>();
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public ArrayList<Project> getProject() {
		return projects;
	}
	
	public ArrayList<Employee> getEmployees(){
		return employees;
	}

	public Project addProject(String name, String serialNumber) {
		Project project1 = new Project(name,serialNumber);
		projects.add(project1);
		return project1;
	}
	
	public Employee addEmployee(String initials) {
		Employee employee1 = new Employee(initials);
		employees.add(employee1);
		return employee1;
	}
	
}
