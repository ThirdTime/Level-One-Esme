import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class JWarmup {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JSlider slide = new JSlider();
	JTextField textfield = new JTextField(20);
	JLabel label = new JLabel("hello!");

	private void createUI() {
		frame.add(panel);
		panel.add(button);
		panel.add(slide);
		panel.add(textfield);
		panel.add(label);
		frame.setVisible(true);
		frame.pack();

	}

	public static void main(String[] args) throws Exception {
		new JWarmup().createUI();
	}
}
