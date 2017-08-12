import java.util.Random;

public class Axolotl {
	private int numFins;
	private int hat;
	private boolean dead = false;

	public Axolotl(int numFins) {
		this.numFins = numFins;
		System.out.println("Created axolotl with " + numFins + " fins!");
	}

	public int getNumFins() {
		System.out.println("Your axolotl has " + numFins + " fins.");
		return numFins;
	}

	public void addHats(int hat) {
		this.hat = hat;
		System.out.println("Your axolotl now has " + hat + " hats.");
		if (dead == true) {
			System.out.println("Your axolotl looks dead.");

		} else {
			if (hat <= 3) {
				System.out.println("Your axolotl looks sharp.");
			} else {
				System.out.println("Your axolotl looks ridiculous.");
			}
		}

	}

	public int getNumHats() {
		if (hat == 1) {
			System.out.println("Your axolotl has " + hat + " hat.");
		} else {
			System.out.println("Your axolotl has " + hat + " hats.");
		}

		return hat;
	}

	public void cutFin() {
		numFins = numFins - 1;
		System.out.println("Your axolotl now has " + numFins + " fins.");
	}

	public void gift() {
		System.out.println("You've given your axolotl a gift!");
		if (dead == true) {
			System.out.println("It's dead, so it doesn't seem to appreciate it.");
		} else {

			int num = new Random().nextInt(3) + 1;
			if (num == 1) {
				System.out.println("It doesn't seem to like it...");
			}
			if (num == 2) {
				System.out.println("It seems happy to get something.");
			}
			if (num == 3) {
				System.out.println("It loves your gift!");
			}
		}

	}

	public void regrowFin() {
		if (dead == true) {
			System.out.println("Your axolotl can't regrow it's fin. It's dead.");
		} else {
			numFins++;
			System.out.println("Your axolotl regrew their fin!");
			System.out.println("You axolotl has " + numFins + " fins.");
		}

	}

	public void mood() {
		System.out.println("You ask your axolotl how it's feeling.");
		int num = new Random().nextInt(3) + 1;
		if (dead == true) {
			System.out.println("It's feeling pretty mad about being dead!");
		} else if (num == 1) {
			System.out.println("It's feeling calm.");
		} else if (num == 2) {
			System.out.println("It's feeling happy.");
		} else if (num == 3) {
			System.out.println("It's feeling a little sad.");
		}

	}

	public void kill() {
		dead = true;
		System.out.println("You're a cold, heartless monster, and have KILLED your axolotl.");
	}

	public String toString() {
		if (dead == true) {
			return "Your axolotl is dead. It has " + hat + " hats, and " + numFins + " fins.";
		}
		if (hat <= 3) {
			return "Your axolotl looks stylish with " + hat + " hats. It has " + numFins + " fins.";
		} else {
			return "Your axolotl looks silly with " + hat + " hats. It has " + numFins + " fins.";
		}
		// add different versions for if it's dead and how many hats it has

	}

	public static void main(String[] args) {
		Axolotl lottie = new Axolotl(6);
		lottie.gift();
	}
}
