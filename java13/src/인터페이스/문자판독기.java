package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 문자판독기 {
	public static void main(String[] args) {
		JFrame f = new JFrame("문자판독기");
		f.setSize(400, 500);
		//
		f.setLayout(new FlowLayout());

		JLabel label = new JLabel("★문장을 넣으세요★");
		Font font = new Font("D2Coidng", 1, 30);
		Font font2 = new Font("D2Coidng", 1, 15);
		JTextArea area = new JTextArea(13, 30);
		JButton b1 = new JButton("click");
		JButton b2 = new JButton("pad color");
		JButton b3 = new JButton("text color");

		label.setFont(font);
		area.setFont(font2);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);

		area.setBackground(Color.DARK_GRAY);
		area.setForeground(Color.white);
		b1.setBackground(Color.orange);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.pink);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);

		f.add(label);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		// 1.text.length()를 구해줌
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText();// 입력한 문장
				JOptionPane.showMessageDialog(f, "글자수는 " + text.length());

			}
		});

		// 2.text.length()를 구해줌
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.yellow);
				area.setForeground(Color.blue);;

			}
		});

		f.setVisible(true);
	}
}
