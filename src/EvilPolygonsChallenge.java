import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot m=new Robot();
		//2. Set the speed to 100
       m.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "corlos", "choices", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"green","blue", "red","baby blue"},0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		 if (m.equals("green")) {
			 m.setPenColor(0,255,0);
			
		}
		 
		 else if (m.equals("blue")) {
			m.setPenColor(0,0,255);
		}
		 else if (m.equals("red")) {
			m.setPenColor(255,0 , 0);
		}
		 else {
			m.setPenColor(0,255 , 255);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String f= JOptionPane.showInputDialog ("How many polygons do you want me to draw");
		//5. Use the robot to draw the number of polygons the user requested.
		int z=Integer.parseInt(f);
		
		for (int i = 0; i < z; i++) {
			m.penDown();
			m.move(100);
			m.turn(90);
			m.move(100);
			m.turn(90);
			m.move(100);
			m.turn(90);
			m.move(100);
			m.penUp();
		
			m.move(100);
		}
		
		//6. Make it so your shapes do not overlap
       
		//7. Challenge: add more colors to the Option Dialog.
	}
}

