
//imports
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(new GridLayout(4, 1));
	JButton button = new JButton();
	JTextField textField = new JTextField(10);
	JLabel label = new JLabel("Enter a number from 0 to 63.");
	JLabel binaryLabel = new JLabel();
	String userNum;

	/*public int binaryDigit(int userIntputtedNumber, int binaryNumber) {
		int userInputtedNumber = Integer.parseInt(textField.getText());
		int digit = userInputtedNumber / binaryNumber;
		userInputtedNumber = userInputtedNumber - binaryNumber * digit;
		return userInputtedNumber;
	}
	*/

	public static void main(String[] args) {
		new BinaryConverter().createUI();
		
	}

	private void createUI() {
		frame.add(panel);
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		button.setText("CONVERT");
		panel.add(binaryLabel);
		button.addActionListener(this);

		frame.setVisible(true);
		frame.pack();
	}

	public void actionPerformed(ActionEvent e) {

		JButton buttonClicked = (JButton) (e.getSource());

		userNum = textField.getText();
		if (userNum.equals("")) {
			binaryLabel.setText("You must enter a number.");
		}

		int num = Integer.parseInt(userNum);
		if (num >= 64) {
			binaryLabel.setText("This number is too large.");
		} else if (num < 0) {
			binaryLabel.setText("This number is too small.");
		} else {

			int thirtytwosDigit = num / 32;
			num = num - 32 * thirtytwosDigit;

			int sixteensDigit = num / 16;
			num = num - 16 * sixteensDigit;

			int eightsDigit = num / 8;
			num = num - 8 * eightsDigit;

			int foursDigit = num / 4;
			num = num - 4 * foursDigit;

			int twosDigit = num / 2;
			num = num - 2 * twosDigit;

			int onesDigit = num / 1;
			num = num - 1 * onesDigit;

			String thirtytwo = Integer.toString(thirtytwosDigit);
			String sixteen = Integer.toString(sixteensDigit);
			String eight = Integer.toString(eightsDigit);
			String four = Integer.toString(foursDigit);
			String two = Integer.toString(twosDigit);
			String one = Integer.toString(onesDigit);

			binaryLabel.setText("Your number is " + thirtytwo + sixteen + eight + four + two + one);
		}

	}
}
