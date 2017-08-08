public class Fish {
	private int speed;
	private String name;

	public Fish(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String toString() {
		return name + " is a fish with speed " + speed;
		// should return “Steven is a fish with speed 4”.
	}

	public static void main(String[] Args) {
		Fish goldFish = new Fish(4, "Steven");
		System.out.println(goldFish);
		goldFish.setSpeed(10);
		System.out.println(goldFish);
		goldFish.setSpeed(20);
		System.out.println(goldFish);

	}
	
	
}
