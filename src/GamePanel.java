import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {

	// ------- VARIABLES -------

	// Screen size
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;

	// How big we want the objects in the screen to be.
	static final int UNIT_SIZE = 25;

	// Calculate how many objects we can fit on the screen.
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;

	// Delay for timer. The higher the number the slower the game is, and vice
	// versa.
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
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();

	}

	// ------- METHODS -------

	// Starts the game
	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY, this);
		timer.start();

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	// Draw different objects on the screen.
	public void draw(Graphics g) {

		// Turn the game window into a grid for better visual understanding.
		for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
			g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
			g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
		}

		// Draw the apple on screen.
		g.setColor(Color.red);
		g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

		// Draw head and body
		for (int i = 0; i < bodyParts; i++) {
			if(i==0) {
				g.setColor(Color.green); //head color.
				g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); // head fill. 
			} else {
				g.setColor(new Color(45, 180, 0)); // body part color.
				g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE); // body part fill.
			}
		}

	}

	// Generate the coordinates for a new apple when method is called (game begins,
	// apple eaten)
	public void newApple() {
		appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;

	}

	// Movement of the snake
	public void move() {
		// Shifting the coordinates in the array with one spot at the time.
		for (int i = bodyParts; i > 0; i++) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}

		// Direction for the bodyparts of the snake (R, L, U, D)
		switch (direction) {
		case 'U':
			y[0] = y[0 - UNIT_SIZE];
			break;
		case 'D':
			y[0] = y[0 + UNIT_SIZE];
			break;
		case 'L':
			x[0] = x[0 - UNIT_SIZE];
			break;
		case 'R':
			x[0] = x[0 + UNIT_SIZE];
			break;
		}

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
