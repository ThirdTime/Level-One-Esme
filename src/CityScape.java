import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class CityScape {
	static Robot rob = new Robot("batman");

	public static void main(String[] args) {
		
		 rob.moveTo(300, 600); 
		 drawPointiestBuilding(200, 85, 255 ,30);
		 drawPointyBuilding(200, 130, 200 ,170);
		 drawFlatBuilding(350,100,40,255);
		
	}

	// drawing a FLAT building
	static void drawFlatBuilding(int height, int colorRed, int colorGreen, int colorBlue) {
		// setup to make the robot draw with the user-inputted color
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenColor(colorRed, colorGreen, colorBlue);
		// Height of the building
		rob.move(height);
		rob.turn(90);
		//Width of the building
		rob.move(75);
		rob.turn(-90);
		//Other side of building
		rob.move(-height);
		rob.turn(90);
		//The grass
		rob.setPenColor(Color.green);
		rob.move(50);
		rob.turn(-90);

	}
//drawing a POINTY bulding
	static void drawPointyBuilding(int height, int colorRed, int colorGreen, int colorBlue) {
		// setup to make the robot draw with the user-inputted color
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenColor(colorRed, colorGreen, colorBlue);
		
		// Height of the building
		rob.move(height);
		// The point (The 'move' commands dictate how wide the building is)
		rob.turn(45);
		rob.move(50);
		rob.turn(-90);
		rob.move(-50);
		rob.turn(45);
		// The rest of the building
		rob.move(-height);
		rob.turn(90);
		//The grass
		rob.setPenColor(Color.green);
		rob.move(50);
		//Turning as setup for the next building
		rob.turn(-90);

	}
	//UNFINISHED!
	static void drawPointiestBuilding(int height, int colorRed, int colorGreen, int colorBlue) {
		// setup to make the robot draw with the user-inputted color
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenColor(colorRed, colorGreen, colorBlue);
		
		// Height of the building
		rob.move(height);
		// The point (The 'move' commands dictate how wide the building is)
		rob.turn(20);
		rob.move(100);
		rob.turn(-40);
		rob.move(-100);
		rob.turn(20);
		// The rest of the building
		rob.move(-height);
		rob.turn(90);
		//The grass
		rob.setPenColor(Color.green);
		rob.move(50);
		//Turning as setup for the next building
		rob.turn(-90);

	}
	
}
