//imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField textField = new JTextField(10);
	JLabel label = new JLabel();
	
	public static void main(String[] args) {
		new BinaryConverter().createUI();
	}
		
	private void createUI(){
		frame.add(panel);
		panel.add(textField);
		panel.add(button);
		button.setText("CONVERT");
		button.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
		
	public void actionPerformed(ActionEvent e){
		
		JButton buttonClicked = (JButton) (e.getSource());
		
		String userNum = textField.getText();
		int num = Integer.parseInt(userNum);
		
		
		int eightsDigit = num/8;
		num = num - 8*eightsDigit;
		System.out.println(eightsDigit);
		
		int foursDigit = num/4;
		num = num - 4*foursDigit;
		System.out.println(foursDigit);
		
		int twosDigit = num/2;
		num = num - 2*twosDigit;
		System.out.println(twosDigit);
		
		int onesDigit = num/1;
		num = num - 1*onesDigit;
		System.out.println(onesDigit);
		
		String digitOne = Integer.toString(eightsDigit);
		String digitTwo = Integer.toString(foursDigit);
		String digitThree = Integer.toString(twosDigit);
		String digitFour = Integer.toString(onesDigit);
		
		JOptionPane.showMessageDialog(null, "Your number is "+ digitOne+ digitTwo+ digitThree+ digitFour);
	}
		
		
		
		
	
}
