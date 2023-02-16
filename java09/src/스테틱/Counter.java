package 스테틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 230);
		f.setTitle("나의 카운터 프로그램");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel result = new JLabel("0");

		JButton btn1 = new JButton("1더하기");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				result.setText(count + "");
			}
		});

		JButton btn2 = new JButton("0으로 초기화");
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				result.setText(count + "");
			}
		});

		JButton btn3 = new JButton("1빼기");
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				result.setText(count + "");
			}
		});

		Font font1 = new Font("D2Coding", 1, 15);
		Font font2 = new Font("D2Coding", 1, 100);
		btn1.setFont(font1);
		btn2.setFont(font1);
		btn3.setFont(font1);
		result.setFont(font2);
		btn1.setBackground(Color.orange);
		btn2.setBackground(Color.black);
		btn2.setForeground(Color.white);
		btn3.setBackground(Color.orange);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(result);
		f.setVisible(true);
	}
}
