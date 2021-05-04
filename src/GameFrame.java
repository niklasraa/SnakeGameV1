import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GameFrame() {
		this.add(new GamePanel());
		// Title for this frame
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Frame resizable by user.
		this.setResizable(false);
		this.pack();
		// Show or hide the window
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
