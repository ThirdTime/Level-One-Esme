
//imported things
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Other things to add include playing a sound and adding the date and time

public class WhackAMole implements ActionListener {

	JFrame frame;
	JPanel panel;
	int moleCounter;
	
	public static void main(String[] args) {
		new WhackAMole().createUI();
	}
	
	private void createUI() {
		
		frame = new JFrame();
		panel = new JPanel();
		
		
		frame.setVisible(true);
		frame.add(panel);
		Random rand = new Random();
		int randomNumber = rand.nextInt(19) + 1;

		for (int i = 1; i <= 20; i++) {
			JButton button = new JButton();
			button.addActionListener(this);

			if (i == randomNumber) {
				button.setText("MOLE");
			}
			panel.add(button);
		}
		frame.setSize(350, 200);
	}

	public void actionPerformed(ActionEvent insertACoolVariableNameHere) {
		JButton buttonclicked = (JButton) insertACoolVariableNameHere.getSource();
		String isMole = buttonclicked.getText();
		if (isMole.equals("MOLE")){
			moleCounter++;
			System.out.println(moleCounter);
			frame.dispose();
			createUI();
		}
		
		if (moleCounter == 5){
			frame.dispose();
			JOptionPane.showMessageDialog(null, "You've whacked all 5 moles in... seconds!");
		}
		
	}

}
