import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {

	// ------- VARIABLES -------
	
	// Screen size
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;

	// How big we want the objects in the screen to be.
	static final int UNIT_SIZE = 25;

	// Calculate how many objects we can fit on the screen.
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
	
	// Delay for timer. The higher the number the slower the game is, and vice versa.
	static final int DELAY = 75;
	
	// Arrays for holding coordinates for body parts of the snake + head.
	// The snake is not gonna be bigger than the game itself.

	// x and y coordinates for the snake
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];
	
	// Initial amount of body parts (starting size of the snake)
	int bodyParts = 6;
	
	// Amount of apple eaten by the snake.
	int applesEaten;
	
	

	// x and y coordinates for apple.
	int appleX;
	int appleY; 
	
	// Direction when game begins R(ight), L(eft), U(p), D(own)
	char direction = 'R';
	
	// Extra variables.
	boolean running = false;
	Timer timer;
	Random random;
	
	

	// ------- CONSTRUCTOR(S) -------
	GamePanel() {

	}

	// ------- METHODS -------

	// Starts the game
	public void startGame() {

	}

	public void paintComponent(Graphics g) {

	}

	public void draw(Graphics g) {

	}

	// Movement of the snake
	public void move() {

	}

	// Checks if an apple has been eaten or not.
	public void checkApple() {

	}

	// Checks if the player collides with the edges/walls
	public void checkCollissions() {

	}

	// Game over event
	public void gameOver(Graphics g) {

	}

	// Inner class, with one method.
	public class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
