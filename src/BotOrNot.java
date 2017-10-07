import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BotOrNot implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton okbutton = new JButton();
	JTextField textField = new JTextField(50);
		
	public static void main(String[] args) throws Exception{
		new BotOrNot().createUI();
		Component captcha = createImage("https://thefallenbrain.files.wordpress.com/2016/05/input-black.gif?w=816");

	}
	private void createUI(){
	
		frame.add(panel);
		frame.setVisible(true);
		panel.add(textField);
		okbutton.setText("OK");
		okbutton.addActionListener(this);
		panel.add(okbutton);
		frame.pack();
		frame.setTitle("Bot or Not?");
	

	}
	
	private static Component createImage(String urlString) throws MalformedURLException {
		URL link = new URL(urlString);
		ImageIcon picture = new ImageIcon(link);
		JLabel label = new JLabel(picture);
		return label;
	}
	
	public void actionPerformed(ActionEvent arg0){
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == okbutton){
			System.out.println("aah you've solved the puzzle");
		}
		
		
		
	}
}
