
public class Axolotl {
	private int numFins;

	public Axolotl(int numFins) {
		this.numFins = numFins;
		System.out.println("Created Lotl with " + numFins + " fins!");
	}

	public int getNumFins() {
		System.out.println("Your axolotl has " + numFins + " fins.");
		return numFins;
	}
	
	public void addHats(int hat) {
		System.out.println("Your axolotl now has "+ hat +" hats.");
	}

	public void gift() {
		System.out.println("You've given your axolotl a hat!");
		System.out.println("Your axolotl looks sharp.");
	}

	public static void main(String[] args) {
		Axolotl lottie = new Axolotl(4);
		lottie.gift();
		lottie.getNumFins();
		lottie.addHats(4);
	}
}
