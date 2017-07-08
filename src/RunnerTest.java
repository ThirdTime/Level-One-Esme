
public class RunnerTest {
	public static void main(String[] args) {

		Runner Steve = new Runner("Steve", "5 mph");
		System.out.println(Steve.toString());
		Runner Ron = new Runner("Ron", "6 mph");
		System.out.println(Ron.toString());
		Runner.setCity("San Francisco");
		System.out.println(Ron.toString());
		System.out.println(Steve.toString());
		System.out.println(Runner.getRunnerCount());
	}
}
