
public class Runner {
	private String name;
	private String speed;

	private int bibNumber = 1000;
	private static int count = 0;

	private static String city = "Seattle";
	private static String startTime = "2:17 AM";

	public Runner(String name, String speed) {
		this.name = name;
		this.speed = speed;
		bibNumber = bibNumber + count;
		count++;

	}

	public static void setCity(String newCity) {
		city = newCity;

	}

	public static int getRunnerCount() {
		return count;
	}

	public String toString() {
		return name + ", bib number " + bibNumber + ", is running in " + city + " at " + startTime + ".";
	}

}
