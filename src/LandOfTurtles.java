import java.util.Random;

import javax.swing.JFrame;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

		
		
		

		// 1. Create a frame & make it visible
		JFrame frame = new JFrame();
		frame.setVisible(true);
		// 2. Add the panel to the frame
		frame.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands
		panel.setBackgroundImage(galapagosIslands);
		// 4. Instantiate a Turtle
		// 5. Add the turtle to the panel


		
		// 6. Put 50 Turtles on the beach
		for (int i = 1; i <= 50; i++) {
			
			Random dom = new Random();
			int setXvariable = dom.nextInt(300);
			//the width of the image is 617
			
			Random ran = new Random();
			int setYvariable = ran.nextInt(442-175)+175;
			//the height of the image is 442
			
			Turtle turt = new Turtle();
			turt.setX(setXvariable);
			turt.setY(setYvariable);
			panel.addTurtle(turt);

		}
		Robot king = new Robot();
		king.setX(500);
		king.setY(200);
		
		frame.pack();
	}

}
