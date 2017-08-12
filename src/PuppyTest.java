
public class PuppyTest {
	public static void main(String[] args) {
		Puppy dog= new Puppy(3,"fido",true);
		System.out.println(dog);
		dog.setAge(5);
		System.out.println(dog);
		dog.setName("odi");
		System.out.println(dog);
		dog.setIsHappy(false);
		System.out.println(dog);
	}
}
