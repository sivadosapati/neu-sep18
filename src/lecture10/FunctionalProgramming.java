package lecture10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FunctionalProgramming extends JFrame {
	private JButton close, backgroundColor;

	public FunctionalProgramming() {
		create();
		add();
		addListeners();
		setVisible(true);
		setSize(400, 500);
		// pack();
	}

	interface Perform {
		public void doWork(Object a, Object b);
	}

	public void execute(Perform p) {

	}

	private void addListeners() {

		execute((a, b) -> {
			System.out.println("Object a -> " + a);
		});
		// close.addActionListener(new CloseListener());
		close.addActionListener(ae -> {
			changeBackgroundColor();
			System.out.println("I'm changing backgroiund");
		});
		// backgroundColor.addActionListener(new BackgroundListener());/*Version 1*/

		/* Version 2 */
		backgroundColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				changeBackgroundColor();
			}
		});

	}

	/*
	 * class CloseListener implements ActionListener {
	 * 
	 * @Override public void actionPerformed(ActionEvent e) { closeWindow();
	 * 
	 * }
	 * 
	 * }
	 */

	class BackgroundListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			changeBackgroundColor();

		}

	}

	private void closeWindow() {
		System.exit(0);
	}

	private void changeBackgroundColor() {
		Container con = this.getContentPane();
		Color c = con.getBackground();
		if (c == Color.BLUE) {
			con.setBackground(Color.RED);
		} else {
			con.setBackground(Color.BLUE);
		}
	}

	private void create() {
		close = new JButton("Close");
		backgroundColor = new JButton("Change Background");
	}

	public void add() {
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(close);
		con.add(backgroundColor);
	}

	public static void main(String[] args) {
		new FunctionalProgramming();
	}

}
