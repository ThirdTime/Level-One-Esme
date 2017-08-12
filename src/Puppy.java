
public class Puppy {
	private int age;
	private String name;
	private boolean isHappy;

	public Puppy(int age, String name, boolean isHappy) {
		this.age = age;
		this.name = name;
		this.isHappy = isHappy;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIsHappy(boolean isHappy) {
		this.isHappy = isHappy;
	}

	public String toString() {
		if (isHappy) {
			return name + ", "+ age + ", is happy.";
		} else {
			return name + ", "+ age + ", is not happy.";
		}
	}
}
