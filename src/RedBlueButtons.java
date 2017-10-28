//imports
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RedBlueButtons implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton redButton = new JButton();
	JButton blueButton = new JButton();
	
	public static void main(String[] args) {
		new RedBlueButtons().createUI();
	}
	private void createUI (){
		frame.add(panel);
		panel.add(redButton);
		redButton.setText("RED");
		redButton.addActionListener(this);
		panel.add(blueButton);
		blueButton.setText("BLUE");
		blueButton.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) (e.getSource());
		if (buttonPressed == redButton){
			System.out.println("red click!");
			panel.setBackground(Color.cyan);
		}
		if (buttonPressed == blueButton){
			System.out.println("blue click!");
			panel.setBackground(Color.pink);
		}

	}
}