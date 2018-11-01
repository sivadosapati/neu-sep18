package lecture8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstUI {

	public static void main(String[] args) {

		// 1. Create the Container
		JFrame frame = new JFrame();

		frame.setTitle("North Eastern University");

		// 2. Create the Component

		JButton clickMe = new JButton("Click Me");
		JTextField tf = new JTextField(10);

		// 3. Create the Layout

		FlowLayout fl = new FlowLayout();

		Container container = frame.getContentPane();

		// 4. Set the Layout to Container's content Pane
		container.setLayout(fl);

		// 5. Add the Components to Container's content pane
		container.add(clickMe);
		container.add(tf);

		ButtonClick bc = new ButtonClick();
		clickMe.addActionListener(bc);

		// 7. Display the container
		frame.setSize(400, 600);

		frame.setVisible(true);

	}

	static class ButtonClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button is Clicked");

		}

	}

}
