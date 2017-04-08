import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {

		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		Component bliniCat = createImage("http://i2.kym-cdn.com/photos/images/facebook/001/131/651/406.jpg");
		quizWindow.add(bliniCat);
		quizWindow.pack();
	}

	private static Component createImage(String urlString) throws MalformedURLException {
		URL link = new URL(urlString);
		ImageIcon picture = new ImageIcon(link);
		JLabel label = new JLabel(picture);
		return label;
	}
}
