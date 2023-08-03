package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	static int rand = new Random().nextInt(5);
	public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        
        
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo!");
		if (rand == 0)  {
        	JOptionPane.showMessageDialog(null, "You will get a million bucks!");
        }
        else if (rand == 1) {
        	JOptionPane.showMessageDialog(null, "Your house is going to be a mansion.");
        }
        else if (rand == 2) {
        	JOptionPane.showMessageDialog(null, "You will live a long life.");
        }
        else if (rand == 3) {
        	JOptionPane.showMessageDialog(null, "Everything you touch wil turn to gold.");
        }
        else {
        	JOptionPane.showMessageDialog(null, "Nothing happens.");
        }
		rand = new Random().nextInt(5);
	}
}
