package softwarehusetAS;
import java.util.Scanner;

public class Main {

	private static Company SoftwarehusetAS = new Company();
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {

		Project project2 = SoftwarehusetAS.addProject("project", "2003");
		System.out.print(project2.getProjectNumber());

		SoftwarehusetAS.addEmployee("AMLT");
		SoftwarehusetAS.addEmployee("BDEF");
		SoftwarehusetAS.addEmployee("DSEU");
		SoftwarehusetAS.addEmployee("VGOK");
		SoftwarehusetAS.addEmployee("NUGT");



		//System.out.print("Please enter your personel ID: ");
		//String checkID = in.next();


		//if (checkForManager(checkID)) {
		//	System.out.println("Choose action: \n 1. Create activity \n 2. Assign employee to activity");


		//} else if (checkForEmployee(checkID)) {
		//	System.out.println("Choose action: \n 1. Register hours \n 2. Ask for assistance");


		//} else if (checkID.equals("ADMIN")) {
		//	System.out.println("Choose action: \n 1. Create project \n 2. Define new employee \n 3. Assign manager");


		//}
	}

	public static boolean checkForManager(String checkID) {
		for (Project p : SoftwarehusetAS.getProject()) {
			if (p.getManager().getInitials().equals(checkID)) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkForEmployee(String checkID) {
		for (Employee e : SoftwarehusetAS.getEmployees()) {
			if (e.getInitials().equals(checkID)) {
				return true;
			}
		}
		return false;
	}

	public void optionsManager(int option) {
		switch (option) {

			case 1:
				System.out.println("input activity name");
				String ActivityName = in.nextLine();
				Activity activity1 = new Activity(ActivityName, true);

			case 2:

		}
	}

	public void optionsEmployee(int option) {
		switch (option) {
			case 1:


			case 2:

		}
	}

	public void optionsCompany(int option) {
		switch (option) {
			case 1:
				System.out.println("input project name and the year");
				String projectName = in.nextLine();
				String year = in.nextLine();
				SoftwarehusetAS.addProject(projectName, year);

			case 2:
				System.out.println("input employee initials and and project name");
				String initials = in.nextLine();
				projectName = in.nextLine();
				Employee manager;
				for (Employee e : SoftwarehusetAS.getEmployees()) {
					if (initials.equals(e.getInitials())) {
						manager = e;
					}
				}
				Project project;
				for (Project p : SoftwarehusetAS.getProject()) {
					if (projectName.equals(p.getName())) {
						project = p;
					}
				}

				//project.setManager(manager);
		}
	}
}
