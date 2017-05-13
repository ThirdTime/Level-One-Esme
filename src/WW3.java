

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WW3 implements ActionListener{
	
	static JFrame france = new JFrame();
	static JPanel japan = new JPanel();
	static JButton britain = new JButton();
	
	public static void main(String[] args) {
		
		
		
		france.setVisible(true);
		france.add(japan);
		japan.add(britain);
		
		
		france.setTitle("wwIII");
		britain.setText("start wwIII");
		//push the button
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0){
		JButton buttonPressed = (JButton) arg0.getSource();
		System.out.println("i'm not a dog person");
		
		
		france.pack();
		//puns
	}
}
