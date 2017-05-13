import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

public class Shoop {
	private int tailLength;
	private String shape;
	private int numCalled = 2;

	public Shoop(int tailLength, String shape) {
		this.tailLength = tailLength;
		this.shape = shape;
		System.out.println("Created Shoop with tail length " + tailLength + " and shape " + shape + ".");
	}

	public void lengthenTail(int inches) {
		this.tailLength = this.tailLength + inches;
		System.out.println("You have extended your shoop's tail " + inches + " inches!");
		System.out.println("Your shoop now has a tail length of " + tailLength + " inches.");
	}

	public void trimShoop(String newshape) {
		System.out.println("Your shoop is now trimmed! It's now a " + newshape);
	}

	public void multiply() {
		if (numCalled == 2) {
			System.out.println("You now have shoopers! That's " + numCalled + " shoop.");
			numCalled = numCalled * 2;
		} else if (numCalled == 4) {
			System.out.println("You now have shoopith!  That's " + numCalled + " shoop.");
			numCalled = numCalled * 2;
		} else if (numCalled == 8) {
			System.out.println("You now have shoopen! That's " + numCalled + " shoop.");
			numCalled = numCalled * 2;
		} else if (numCalled == 16) {
			System.out.println("You now have shoopid! That's " + numCalled + " shoop.");
			numCalled = numCalled + 1;
		} else if (numCalled >= 17) {
			System.out.println("Too far! Stop multiplying!");

		}
	}

	public void countShoop() {
		if (numCalled <= 16) {
			System.out.println("You have " + numCalled + " shoop.");
		} else {
			System.out.println("You made too many shoop.");
		}
	}

	public void haircut() {
		int rannum = new Random().nextInt(3) + 1;
		if (rannum == 1) {
			System.out.println("Your shoop now has a mohawk!");
		}
		if (rannum == 2) {
			System.out.println("Your shoop now has a mullet!");
		}
		if (rannum == 3) {
			System.out.println("Your shoop now has an afro!");
		}
	}
	
	public void instructions() {
		
		System.out.println("_________________________");
		System.out.println("Here's the things you can do to the Shoop!");
		System.out.println("You can lengthen the tail length of your Shoop with shoop.lengthenTail([number of inches]);");
		System.out.println("You can change the shape of your Shoop with shoop.trimShoop([new shape]);");
		System.out.println("You can multiply your Shoop up to four times with shoop.multiply();");
		System.out.println("You can count how many Shoop you have with shoop.countShoop(); [incomplete]");
		System.out.println("You can give your Shoop a random haircut with shoop.haircut(); [incomplete]");
		System.out.println("Have fun!");
		System.out.println("_________________________");
	}

	public static void main(String[] args) {
		Shoop bob = new Shoop(190, "shoop");
		
		
	}
}
