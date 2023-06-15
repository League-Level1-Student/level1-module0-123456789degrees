package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

public class Houses {
	public static void drawFlatHouse(String height) {
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.setPenWidth(50);
		rob.moveTo(700, 500);
		rob.penDown();
		rob.turn(270);
		rob.setPenColor(102,176,50);
		rob.move(20);
		rob.turn(90);
		rob.move(150);
		rob.turn(270);
		rob.move(50);
		rob.turn(270);
		rob.move(150);
		rob.turn(90);
		rob.move(20);
	}
	public void run() {
		
	}
}
