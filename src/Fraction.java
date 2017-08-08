
public class Fraction {
	public int numerator;
	public int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public float getValue(){
		return (float)numerator/denominator;
	}
	
	public void setDenominator(int denominator){
		this.denominator= denominator;
		if (denominator==0){
			System.out.println("Invalid denominator.");
			denominator= 1;
		}
	}

	
	
	
	
	
	
	/*
	 * public float getValue() { 
	 * float floatingNumerator = numerator; 
	 * float floatingDenominator = denominator;
	 * return floatingNumerator /floatingDenominator; }
	 */
	
	/*
	 * So what am I doing with public float getValue()? Saving "numerator" and
	 * "denominator" as floats has a few problems; First; floats take up a lot
	 * of room on a computer (as opposed to ints) Second; you could do something
	 * like this; 13.4/9.2, which while technically correct, looks weird. And
	 * customers don't want weird.
	 * 
	 * So in getValue i'm saving the values of the ints (numerator and
	 * denominator)
	 * 
	 * Or you could do it like this; (float) numerator/ denominator This is
	 * called casting!! But it might not always work. For example, turning
	 * String dog = chihuahua; into (int) dog.
	 */

}
