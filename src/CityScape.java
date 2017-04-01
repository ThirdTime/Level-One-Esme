import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class CityScape {
	static Robot rob = new Robot("mini");

	public static void main(String[] args) {
		rob.moveTo(300, 600);
		drawBuilding(200, 85, 255 ,30);
		drawBuilding(480, 250, 100, 10);
		drawBuilding(400, 130, 40, 255);
		drawBuilding(100, 0, 0, 102);
		drawBuilding(170, 119, 0, 150);
		
	}

	static void drawBuilding(int height, int colorRed, int colorGreen, int colorBlue) {

		rob.setSpeed(10);
		rob.penDown();
		rob.setPenColor(colorRed, colorGreen, colorBlue);

		rob.move(height);
		rob.turn(90);
		rob.move(50);
		rob.turn(-90);
		rob.move(-height);
		rob.turn(90);
		rob.setPenColor(Color.green);
		rob.move(50);
		rob.turn(-90);

	}

}
