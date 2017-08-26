import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*Make a user interface with 3 buttons that will play different videos depending on which button is clicked. 
*Use the methods below to play the cutest videos ever.
*/

public class CutenessTV implements ActionListener {
	JButton dogButton = new JButton();
	JButton frogButton = new JButton();
	JButton duckButton = new JButton();

	public void actionPerformed(ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();
		if(dogButton == buttonPressed){
			showDog();
		}
		if(frogButton == buttonPressed){
			showFrog();
		}
		if(duckButton == buttonPressed){
			showDuck();
		}
		System.out.println("action performed is working");
	}

	public void createUI() {
		duckButton.addActionListener(this);
		dogButton.addActionListener(this);
		frogButton.addActionListener(this);

		JPanel panel = new JPanel();
		JFrame frame = new JFrame();

		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.add(panel);
		panel.add(duckButton);
		panel.add(dogButton);
		panel.add(frogButton);
		dogButton.setText("Dogs!");
		frogButton.setText("Frogs!");
		duckButton.setText("Ducks!");
		frame.pack();
	}

	void showDog() {
		playVideo("ccgkxP-4tVE");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showDuck() {
		playVideo("e3PdcKcUvDY&t=16s");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {

		new CutenessTV().createUI();
		

	}
}
