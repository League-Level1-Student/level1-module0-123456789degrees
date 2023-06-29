package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static int gravity = 1;
	static int yVelocity = -10;
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    static int x = 50, y = 10;
    static int x2 = 0;
    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
    	background(0, 20, 255);
    	fill(255, 255, 5);
    	stroke(255, 255, 255);
    	ellipse(x, y+gravity, 50, 50);
    	y++;
    	gravity++;
    	yVelocity++;
    	if (mousePressed) {
    		y += yVelocity;
    		gravity = 1;
    		yVelocity = -10;
    	}
    	fill(0, 255, 0);
    	rect(600 - x2, 0, 125, 347);
    	x2++;
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
