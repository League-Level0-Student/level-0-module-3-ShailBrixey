
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		int repeat = 0;
		int repeating = 7;
		
		//1. Create a new Robot
		Robot robot = new Robot("mini");
		
		for(repeat=0; repeat <= repeating; repeat++) {
	    //2. Make the robot draw a shape (this will take more than one line of code)
		robot.penDown();
		robot.move(50);
		robot.turn(90);
		robot.move(50);
		robot.turn(90);
		robot.move(50);
		robot.turn(90);
		robot.move(50);
		//3. Set the pen width to 10
		robot.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String chosenColor = JOptionPane.showInputDialog("What color do you want the pen to be? Please spell correctly and answer in lowercase.");
		robot.penUp();
		robot.move(90);
		robot.turn(50);
		//5. Use an if/else statement to set the pen color that the user requested
			if(chosenColor.equals("red")) {
				robot.setPenColor(Color.red);
			}
			else if(chosenColor.equals("orange")) {
				robot.setPenColor(Color.orange);
			}
			else if(chosenColor.equals("yellow")) {
				robot.setPenColor(Color.yellow);
			}
			else if(chosenColor.equals("green")) {
				robot.setPenColor(Color.green);
			}
			else if(chosenColor.equals("blue")) {
				robot.setPenColor(Color.blue);
			}
			else if(chosenColor.equals("magenta")) {
				robot.setPenColor(Color.magenta);
			}
			else {
				robot.setPenColor(Color.pink);
			}
        //6. If the user doesn't enter anything, choose a random color
			if(chosenColor == "") {
				robot.setPenColor(Color.black);
			}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		}

		



	}
}
