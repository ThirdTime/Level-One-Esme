import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseListenerTestPractice implements MouseListener {
	JFrame frame;
	JPanel panel;

	public void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.addMouseListener(this);
		panel.setSize(20, 20);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		MouseListenerTestPractice mouseClass = new MouseListenerTestPractice();
		mouseClass.createUI();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("clicked!");
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("pressed!");
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("released!");
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("entered!");
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("exited!");
		// TODO Auto-generated method stub

	}

}
