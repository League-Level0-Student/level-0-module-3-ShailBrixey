package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class YearsAlive {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("What year were you born?");
		int now = 2025;
		int year = Integer.parseInt(input);
		for(int i=year; i <= now; i++) {
			System.out.println(i);
		}
	}

}
