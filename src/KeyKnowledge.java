//imports :D
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.omg.Messaging.SyncScopeHelper;

public class KeyKnowledge implements KeyListener{
	
	JLabel panelText = new JLabel();
	
	public static void main(String[] args) {
		KeyKnowledge keyClass = new KeyKnowledge();
		keyClass.createUI();
	}
	
	public void createUI(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.addKeyListener(this);
		frame.setTitle("Key Knowledge");
		frame.add(panel);
		frame.add(panelText);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	private String keyDescription (KeyEvent event){
		return "KEY: " + event.getKeyChar();
	}
	
	public void keyTyped (KeyEvent event){
		panelText.setText(keyDescription(event));
	}
	

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
