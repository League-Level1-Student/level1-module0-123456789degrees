package _04_gui_from_scratch._3_sound_effects_machine;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	public void showButtons() {
		JFrame frame = new JFrame();
		frame.setTitle("Sound Effects Machine");
		frame.setVisible(true);
		JPanel panel = new JPanel(); 
		frame.add(panel);
		frame.pack();
		button1.setText("Button 1");
		button2.setText("Button 2");
		button3.setText("Button 3");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		
	}
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == button1) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		else if (buttonPressed == button2) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		else {
			playSound("sawing-wood-daniel_simon.wav");
		}
	}
	private void playSound(String soundFile) {
		String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
}
