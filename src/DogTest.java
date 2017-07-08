
public class DogTest {
	public static void main(String[] args) {
		Dog fido= new Dog("fido",2);
		System.out.println(fido);
		fido.setAge(1);
		System.out.println(fido);
		System.out.println(fido.getAge()+" years old.");
		System.out.println(fido.dogWisdom());
		
		Dog lassie=new Dog("lassie", 7);
		System.out.println(lassie);
		
		lassie.setAge(100000);
		System.out.println(fido.getAge()+"; that's fido's age my dude");
		System.out.println("There be "+ Dog.getNumDogs()+ " dog(s)");
	}
}
 