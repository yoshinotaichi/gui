// TestButtonLabel.java

import java.awt.*;
import javax.swing.*;

public class TestButtonLabel {
	// field
	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel label1;
	private JLabel label2;

	// method
	public TestButtonLabel() {
		prepareGUI();
	}

	public static void main(String[] args) {
		TestButtonLabel tbl = new TestButtonLabel();
		tbl.showGuiParts();
	}

	private void prepareGUI() {
		frame = new JFrame("TestButtonLabel");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocation(200, 200);
		frame.setLayout(new FlowLayout());

		// panel1
		panel1 = new JPanel();
		label1 = new JLabel();
		panel1.add(label1);

		// panel2
		panel2 = new JPanel();
		label2 = new JLabel();
		panel2.add(label2);

		frame.add(panel1);
		frame.add(panel2);
	}

	private void showGuiParts() {
		label1.setText("HELLO");
		panel1.setBackground(Color.BLUE);

		label2.setText("ALOHA");
		panel2.setBackground(Color.RED);

		frame.setVisible(true);
	}
}