
public class RunnerTest {
	public static void main(String[] args) {

		Runner John = new Runner("John", "5 mph");
		System.out.println(John.toString());
		
		Runner.setCity("Miami");
		
		Runner Maria = new Runner("Maria", "6 mph");
		System.out.println(Maria.toString());
		
		Runner Esme = new Runner("Esme", "20 mph");
		System.out.println(Esme.toString());
		
		Runner.setCity("San Francisco");
		System.out.println(Maria.toString());
		System.out.println(John.toString());
		System.out.println(Runner.getRunnerCount());
		
		
	}
}
