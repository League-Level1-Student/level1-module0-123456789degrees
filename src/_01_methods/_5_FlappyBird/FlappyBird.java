package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
	static int gravity = 1;
	static int yVelocity = -10;
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    static int x = 50, y = 10;
    static int x2 = -100;
    static int ran = 250;
    static int pipeGaps = 100;
    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }
    boolean intersectsPipes() { 
        if (y < ran && x > 600 - x2 && x < (725 - x2)){
           return true; }
       else if (y > ran + pipeGaps && x > 600-x2 && x < (725-x2)) {
           return true; }
       else { return false; }
}
    @Override
    public void draw() {
    	background(0, 20, 255);
    	fill(101,67,33);
    	rect(0,590,WIDTH,50);
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
    	int score = 0;
    	fill(0, 255, 0);
    	rect(600 - x2, 0, 125, ran);
    	rect(600 - x2, 450, 125, ran + pipeGaps);
    	x2++;
    	if (x2 > 800) {
    		x2 = -100;
    		ran = (int) random(200,400);
    	}
    	if (intersectsPipes()) {
    		y = 500;
    	}
    	else {
    		score++;
    	}
    	text("Your score is: " + score, 50, 50); 
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
