// TestTextOnLabel.java
//   labelとテキストのテスト. 属性変更など.

import java.awt.*;
import javax.swing.*;

public class TestTextOnLabel {
	public static void main(String[] args) {
		JFrame frame;
		JPanel panel;
		JLabel label;

		frame = new JFrame("TextOnLabel");
		// panel = new JPanel();
		label = new JLabel("HELLO");

		// frame config
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// label config: frame.add()では無効？
		// label.setBackground(new Color(200, 0 ,0));
		label.setBackground(Color.BLUE);
		// ↓colorは反映されないが、右寄せは成功
		label.setHorizontalAlignment(JLabel.LEFT);
		label.setVerticalAlignment(JLabel.BOTTOM);
		// 水平・垂直位置の設定を取得するテスト
		//   h.right: 4, center: 0,  left: 2
		//   v.none: 0, top: 1,  bottom: 3
		int horiz = label.getHorizontalAlignment();
		int vert = label.getVerticalAlignment();

		System.out.println("horiz"+horiz);
		System.out.println("vert"+vert);

		// panel.add(label);
		// frame.add(panel);
		frame.add(label);

		frame.setVisible(true);
	}
}