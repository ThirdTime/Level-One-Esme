import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RiddleGUI implements ActionListener {

	JButton submitButton = new JButton();
	JButton hintButton = new JButton();
	JTextField textField = new JTextField(20);

	public static void main(String[] args) {
		RiddleGUI thisClass = new RiddleGUI();
		thisClass.createUI();
	}

	public void createUI() {

		submitButton.setText("Submit your answer");
		submitButton.addActionListener(this);

		hintButton.setText("I need help!");
		hintButton.addActionListener(this);

		JPanel panel = new JPanel();
		JFrame frame = new JFrame();

		JLabel riddleLabel = new JLabel();
		riddleLabel.setText("I'm tall when i'm young and i'm short when i'm old. What am I?");

		frame.setTitle("Riddles");
		frame.add(panel);
		panel.add(riddleLabel);
		panel.add(textField);
		panel.add(submitButton);
		panel.add(hintButton);
		frame.setVisible(true);
		frame.pack();
	}

	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		String userAnswer = textField.getText();

		if (buttonClicked == hintButton) {
			JOptionPane.showMessageDialog(null, "Your hint: You set me on fire.");
		} else if (buttonClicked == submitButton && userAnswer.equals("candle")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong answer, try again.");
		}

	}
}
