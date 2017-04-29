import org.omg.Messaging.SyncScopeHelper;

public class Shoop {
	private int tailLength;
	private String shape;

	public Shoop(int tailLength, String shape) {
		this.tailLength = tailLength;
		this.shape = shape;
		System.out.println("Created Shoop with tail length " + tailLength+ ".");
	}

	public void lengthenTail(int inches) {
		this.tailLength = this.tailLength + inches;
		System.out.println("You have extended your shoop's tail "+ inches+ " inches!");
		System.out.println("Your shoop now has a tail length of "+tailLength+ " inches.");
	}

	/*
	 * public void trimShoop(String "shape"){ if
	 * shape.equalsIgnoreCase("Square"){ System.out.println(
	 * "Your shoop is now a square!"); }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Shoop Tim = new Shoop(3, "triangle");

		Tim.lengthenTail(5);
	}
}
