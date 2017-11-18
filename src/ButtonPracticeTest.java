//imports
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonPracticeTest implements ActionListener {
	JButton redButton = new JButton();
	JButton greenButton = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		ButtonPracticeTest test = new ButtonPracticeTest();
		test.createUI();
	}

	public void createUI() {
		frame.add(panel);
		panel.add(greenButton);
		panel.add(redButton);
		redButton.setText("RED");
		greenButton.setText("GREEN");
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) (e.getSource());
		if (buttonClicked == redButton){
			panel.setBackground(Color.red);
		} else
			if(buttonClicked == greenButton){
				panel.setBackground(Color.green);
			}
	}

}
