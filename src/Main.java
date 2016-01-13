
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	
	private final String NAME = "Hello-User";
	
	private String fname;
	private JFrame frame;
	private JPanel panel;
	
	/**
	 * Main class constructor.
	 */
	public Main() {
		frame = new JFrame(NAME);
		panel = new JPanel();
		
		frame.add(panel);
		frame.setPreferredSize(new Dimension(200, 200));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
		
		init();
	}

	/**
	 * Prompts the user to enter his or her first name.
	 * Which in turn will return "Hello FirstName."
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();
	}
	
	/**
	 * Initializer method.
	 */
	public void init() {
		fname = JOptionPane.showInputDialog("What's your first name?");
		panel.add(new JLabel("Hello " + fname + "."));
		
		panel.validate();
	}
}
