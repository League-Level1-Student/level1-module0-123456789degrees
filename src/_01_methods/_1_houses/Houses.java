package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		Robot rob = new Robot();
		
		rob.moveTo(500, 100);
		rob.penDown();
		rob.turn(270);
		rob.setPenColor(102,176,50);
		rob.move(10);
	}
}
