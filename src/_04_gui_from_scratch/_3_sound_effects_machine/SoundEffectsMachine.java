package _04_gui_from_scratch._3_sound_effects_machine;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine {
	public void showButtons() {
		JFrame frame = new JFrame();
		frame.setTitle("Sound Effects Machine");
		frame.setVisible(true);
		JPanel panel = new JPanel(); 
		frame.add(panel);
		frame.pack();
		JButton button1 = new JButton();
		button1.setText("Button 1");
		JButton button2 = new JButton();
		button2.setText("Button 2");
		JButton button3 = new JButton();
		button3.setText("Button 3");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
	}
}
