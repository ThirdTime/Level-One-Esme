import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		Component stabCrab = createImage("https://pbs.twimg.com/media/C7jhunUVAAEjPOo.jpg");
		quizWindow.add(stabCrab);
		quizWindow.pack();
		int quizScore = 0;
		String questionOneCrab = JOptionPane.showInputDialog("What animal is this?");
		if (questionOneCrab.contains("crab")) {
			quizScore++;
			System.out.println(quizScore);
		}

		Frame quizWindow2 = new Frame();
		quizWindow2.setVisible(true);
		Component catWithGun = createImage("http://a.fod4.com/images/user_photos/1195582/cat-gun_square_fullsize.jpg");
		quizWindow2.add(catWithGun);
		quizWindow2.pack();
		String questionTwoCat = JOptionPane.showInputDialog("What type of weapon is this?");
		if (questionTwoCat.contains("gun")) {
			quizScore++;
			System.out.println(quizScore);
		}
		
		Frame quizWindow3 = new Frame();
		quizWindow3.setVisible(true);
		Component birdWithCheese = createImage("http://static.boredpanda.com/blog/wp-content/uploads/2016/01/funny-animals-eating-1021__605.jpg");
		quizWindow3.add(birdWithCheese);
		quizWindow3.pack();
		String questionThreeBird = JOptionPane.showInputDialog("What type of weapon is this?");
		if (questionThreeBird.contains("cheese")) {
			quizScore++;
			System.out.println(quizScore);
		}
		
		JOptionPane.showMessageDialog(null, "Your score is "+ quizScore+"/3!");
	}


	private static Component createImage(String urlString) throws MalformedURLException {
		URL link = new URL(urlString);
		ImageIcon picture = new ImageIcon(link);
		JLabel label = new JLabel(picture);
		return label;
	}
}
