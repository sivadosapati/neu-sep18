package lecture8;

import java.awt.CheckboxGroup;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ItemChangeTest extends JFrame {

	private JComboBox genderComboBox;
	private JLabel genderLabel;

	private JCheckBox male, female;

	private JRadioButton maleRB, femaleRB;
	private CheckboxGroup cbg;

	public ItemChangeTest() {
		genderComboBox = new JComboBox();
		genderComboBox.addItem("Male");
		genderComboBox.addItem("Female");
		genderComboBox.addItem("Close Window");

		genderLabel = new JLabel("Select Gender");
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(genderLabel);
		con.add(genderComboBox);
		cbg = new CheckboxGroup();
		male = new JCheckBox("Male");
		female = new JCheckBox("Female");
		male.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(male.isSelected());

			}

		});

		
		maleRB = new JRadioButton("Male");
		femaleRB = new JRadioButton("Female");
		con.add(maleRB);
		con.add(femaleRB);

		con.add(male);
		con.add(female);

		genderComboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String s = genderComboBox.getSelectedItem().toString();
				if (s.equals("Close Window")) {
					ItemChangeTest.this.dispose();
					return;
				}
				JOptionPane.showMessageDialog(null, "Selected -> " + s, "Gender", 1);

			}

		});

		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ItemChangeTest();

	}

}
