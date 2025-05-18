package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Please use all capital letters only.");
		
		String happy = JOptionPane.showInputDialog("Are you happy?");
		if(happy.equals("YES")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
		else {
			String wantHappy = JOptionPane.showInputDialog("Do you want to be happy?"); {
				if(wantHappy.equals("YES")) {
					JOptionPane.showMessageDialog(null, "Change Something");
				}
				else {
					JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
				}
			}
		}
	}

}
