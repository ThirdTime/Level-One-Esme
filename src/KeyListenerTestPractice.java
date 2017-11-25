//imports
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyListenerTestPractice implements KeyListener{
	
	JFrame frame;
	JPanel panel;
	
	public void createUI(){
		frame = new JFrame();
		panel = new JPanel();	
		frame.add(panel);
		frame.addKeyListener(this);
		panel.setSize(20, 20);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		KeyListenerTestPractice keyClass = new KeyListenerTestPractice();
		keyClass.createUI();
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Typed!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Released!");
		// TODO Auto-generated method stub
		
	}

}
