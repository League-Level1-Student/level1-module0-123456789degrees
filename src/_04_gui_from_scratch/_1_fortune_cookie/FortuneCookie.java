package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	public void showButton() {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setVisible(true);
        
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        int rand = new Random().nextInt(5);
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
	}
}
