import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class CoolPicture {

	static Robot bsquare = new Robot("mini");


	public static void main(String[] args) {
		bsquare.moveTo(900, 600);
		drawSquare(200);
		bsquare.penUp();
		bsquare.moveTo(950, 400);
		drawSquare(100);
		
		Robot arms = new Robot("mini");
		arms.moveTo(900, 450);
		arms.penDown();
		arms.turn(-90);
		arms.move(50);
		arms.turn(90);
		arms.move(50);
		
		Robot armtwo= new Robot("mini");
		armtwo.setSpeed(10);
		armtwo.moveTo(1100,450);
		armtwo.penDown();
		armtwo.turn(90);
		armtwo.move(50);
		armtwo.turn(-90);
		armtwo.move(50);
		
		/*Robot eyes = new Robot();
		eyes.moveTo(, 390);
		*/
		
	}

	static void drawSquare(int size) {
		bsquare.setSpeed(10);
		bsquare.penDown();
		
		for (int i = 1; i <= 4; i++) {

			bsquare.move(size);
			bsquare.turn(90);
		}
	}
}
