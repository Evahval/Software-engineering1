package softwarehusetAS;
import java.util.Scanner;

public class Main {

	private static Company SoftwarehusetAS = new Company();

	public static void main(String[] args) {
		
	
		SoftwarehusetAS.addEmployee("AMLT");
		SoftwarehusetAS.addEmployee("BDEF");
		SoftwarehusetAS.addEmployee("DSEU");
		SoftwarehusetAS.addEmployee("VGOK");
		SoftwarehusetAS.addEmployee("NUGT");
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your personel ID: ");
		String checkID = in.next();

		for(Project p: SoftwarehusetAS.getProject()) {
		   	if (p.getManager().getInitials().equals(checkID)){
		   		
		   	}
		   	
		}

		for( Employee e: SoftwarehusetAS.getEmployees()) {
			if(e.getInitials().equals(checkID)) {

			}
		}

		System.out.println("Choose action: \n 1. create project \n 2. create activity \n 3. Assign manager \n 4. register hours \n 5. ask for assistance");
	
		int option = in.nextInt();
	
		switch (option) {
		case 1: 
			System.out.println("input project name and Serial number");
			String projectName= in.nextLine();
			int number= in.nextInt();
			Project project1= new Project(projectName, String.valueOf(number));
		
		case 2:
			System.out.println("input activity name");
			String ActivityName=in.nextLine();
			Activity activity1 = new Activity(ActivityName, true);
			
		case 3: 
			System.out.println("input employee initials and and project name");
			String initials = in.nextLine();
			projectName = in.nextLine();
			Employee manager;
			for (Employee e : SoftwarehusetAS.getEmployees()) {
				if (initials.equals(e.getInitials())) {
					manager=e;
				}	
			}
			Project project ;
			for (Project p: SoftwarehusetAS.getProject()) {
				if(projectName.equals(p.getName())) {
					project=p;
				}
			}
			
			project.setManager(manager);
			
		case 4: 
			
			
		}
	}
	
	public boolean checkForManager(String checkID){
	for(Project p: SoftwarehusetAS.getProject()) {
    		   	if (p.getManager().getInitials().equals(checkID)){
    		   		return true;
    		   	}
    		}
    	return false;
	}
	
	public boolean checkForEmployee(String checkID){
		for( Employee e: SoftwarehusetAS.getEmployees()) {
			if(e.getInitials().equals(checkID)) {
				return true;
			}
		}
		return false;
	}
	
}
