
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.getContentPane().add(new JButton("Click Me"));

		frame.setSize(400, 600);
		frame.setTitle("North Eastern University");

		JButton clickMe = new JButton("Click Me");

		FlowLayout fl = new FlowLayout();
		
		

		frame.pack();

		frame.setVisible(true);

	}

}