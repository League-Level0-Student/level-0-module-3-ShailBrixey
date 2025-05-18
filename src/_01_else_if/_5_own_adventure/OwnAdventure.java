package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "You are in a forest.");
		String Choice1 = JOptionPane.showInputDialog("Do you walk to the left or right?");
		if(Choice1.equals("right")) {
			JOptionPane.showMessageDialog(null, "You start walking right and find civilization. You find a hotel. It costs $10 to stay there for the night. You pay in the morning.");
			String Choice2 = JOptionPane.showInputDialog("Do you lie and stay the night at the hotel or do you leave?");
			if(Choice2.equals("stay the night")) {
				JOptionPane.showMessageDialog(null, "You go up to your room and fall asleep.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You go outside and find a place to sleep on the ground");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "You start walking left and find a house.");
			String Choice3 = JOptionPane.showInputDialog("Do you go into the house to sleep or do you keep walking?");
			if(Choice3.equals("enter house")) {
				JOptionPane.showMessageDialog(null, "You find a bed and go to sleep.");
			}
			else {
				JOptionPane.showMessageDialog(null, "You keep walking and find a empty tree trunk. You go to sleep in it.");
			}
		}
		
	}

}
