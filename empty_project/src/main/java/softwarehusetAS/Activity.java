package softwarehusetAS;

public class Activity {

	private static String name;
	private static int timeBudget;
	private static int startWeek;
	private static int endWeek;
	private static boolean isActive;
	
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
