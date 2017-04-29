
/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 1 Cat
 * Duration=0.5 Platform=Eclipse Type=Recipe Objectives=Create your own object
 */

public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives--;
		if (lives == 1)
			System.out.println("nice try, but I still have 1 life left");
		else if(lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}
	
	int getLives(){
		return lives;
	}
	
	
	void printLives(){
		System.out.println("I have "+getLives()+ " lives.");
	}
	
	void smallTalk(int age, String food){
		System.out.println("I'm "+ age + " years old, and my favorite food is "+ food + "!");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		Cat catty = new Cat("Pablo"); 

		// 1. Make the Cat meow
		catty.meow();
		// 2. Get the Cat to print it's name
		catty.printName();
		//2.5 Get to know your cat!
		catty.smallTalk(7, "Puriana Cat Chow(tm)");
		// 3. Kill the Cat!
		catty.printLives();
		for (int i = 1; i <= 9; i++) {
			catty.kill();
		}
		

	}
}
