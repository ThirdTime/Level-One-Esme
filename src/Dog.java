
public class Dog {
	private String dogName;
	private int dogAge;
	private static int count;

	public Dog(String dogName, int dogAge) {
		this.dogName = dogName;
		this.dogAge = dogAge;
		this.count= count +1;
	}

	public void setAge(int dogAge) {
		this.dogAge = dogAge;
	}

	public int getAge() {
		return dogAge;
	}
	
	public static int getNumDogs() {
		return count;
	}

	public String toString() {

		if (dogAge == 1) {
			return dogName + " is " + dogAge + " year old.";
		} else {
			return dogName + " is " + dogAge + " years old.";
		}
	}
	
	public String dogWisdom(){
		return dogName + " says; if the ball is too big for your mouth, it's not your ball.";
	}
}
