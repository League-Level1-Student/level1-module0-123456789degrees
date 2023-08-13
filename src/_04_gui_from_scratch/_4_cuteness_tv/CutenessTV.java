package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	public void showButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.pack();
		b1.setText("Ducks");
		b2.setText("Frog");
		b3.setText("Fluffy Unicorns");
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		frame.pack();
	}
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == b1) {
			showDucks();
		}
		else if (buttonPressed == b2) {
			showFrog();
		}
		else {
			showFluffyUnicorns();
		}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
