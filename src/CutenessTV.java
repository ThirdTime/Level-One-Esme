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

	
	

	public void actionPerformed(ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();

	}

	void showDog() {
		playVideo("https://www.youtube.com/watch?v=ccgkxP-4tVE");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		JButton dogButton = new JButton();
		
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.add(panel);
		panel.add(dogButton);
		dogButton.setText("Dogs!");
		frame.pack();
	}
}
