package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

public class Houses {
	static Robot rob = new Robot();
	public static void drawFlatHouse(String height, String color) {
		rob.setSpeed(100);
		rob.setPenWidth(50);
		rob.penDown();
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		else if (color.equals("green")) {
			rob.setPenColor(0,255,0);
		}
		else {
			rob.setPenColor(0,0,250);
		}
		if (height.equals("small")) {
			
			rob.move(20);
			rob.turn(90);
			rob.move(100);
			rob.turn(270);
			rob.move(50);
			rob.turn(270);
			rob.move(100);
			rob.turn(90);
			rob.move(20);
			rob.turn(90);
		}
		else if (height.equals("medium")) {
			
			rob.move(20);
			rob.turn(90);
			rob.move(150);
			rob.turn(270);
			rob.move(50);
			rob.turn(270);
			rob.move(150);
			rob.turn(90);
			rob.move(20);
			rob.turn(90);
		}
		else {
			
			rob.move(20);
			rob.turn(90);
			rob.move(250);
			rob.turn(270);
			rob.move(50);
			rob.turn(270);
			rob.move(250);
			rob.turn(90);
			rob.move(20);
			rob.turn(90);
		}
		
	}
	public static void drawPointyHouse(String height, String color) {
		rob.setSpeed(100);
		rob.setPenWidth(50);
		rob.penDown();
		if (color.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		else if (color.equals("green")) {
			rob.setPenColor(0,255,0);
		}
		else {
			rob.setPenColor(0,0,250);
		}
		if (height.equals("small")) {
			rob.move(20);
			rob.turn(90);
			rob.move(100);
			rob.turn(300);
			rob.move(50);
			rob.turn(300);
			rob.move(50);
			rob.turn(300);
			rob.move(100);
			rob.turn(90);
			rob.move(20);
			rob.turn(90);
		}
		else if (height.equals("medium")) {		
			rob.move(20);
			rob.turn(90);
			rob.move(150);
			rob.turn(300);
			rob.move(50);
			rob.turn(300);
			rob.move(50);
			rob.turn(300);
			rob.move(150);
			rob.turn(90);
			rob.move(20);
			rob.turn(90);
		}
		else {

			
			rob.move(20);
			rob.turn(90);
			rob.move(250);
			rob.turn(300);
			rob.move(50);
			rob.turn(300);
			rob.move(50);
			rob.turn(300);
			rob.move(250);
			rob.turn(90);
			rob.move(20);
			rob.turn(90);
		}
		
	}
	public void run() {
		drawPointyHouse("medium", "green");
		drawPointyHouse("tall", "red");
		drawFlatHouse("medium", "red");
		drawPointyHouse("small", "blue");
		drawPointyHouse("medium", "green");
		drawPointyHouse("tall", "red");
		drawFlatHouse("medium", "red");
		drawPointyHouse("small", "blue");
		drawFlatHouse("small", "green");
	}
}
