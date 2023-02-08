package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기부품만들기 {

	public static void main(String[] args) {
		// 필요한 부품 10개 => RAM에 부품을 만들어 넣어놓자.
		// JFrame, ImageIcon, JLabel 3개
		JFrame f = new JFrame();
		f.setSize(280, 600);

		ImageIcon icon = new ImageIcon("3.jpg");

		JLabel label1 = new JLabel();
		label1.setIcon(icon);

		JLabel label2 = new JLabel();
		label2.setText("숫자1");

		JLabel label3 = new JLabel();
		label3.setText("숫자2");

		// JTextField 2개
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);

		// Font, FlowLayout
		Font font = new Font("굴림", 1, 20);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// JButton
		JButton b = new JButton();
		b.setText("+");
		JButton b1 = new JButton();
		b1.setText("-");
		JButton b2 = new JButton();
		b2.setText("*");
		JButton b3 = new JButton();
		b3.setText("/");

		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		b.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		f.add(label1);
		f.add(label2);
		f.add(text1);
		f.add(label3);
		f.add(text2);
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		label2.setForeground(Color.black);
		label3.setForeground(Color.black);
		text1.setForeground(Color.white);
		text1.setBackground(Color.black);
		text2.setForeground(Color.white);
		text2.setBackground(Color.black);
		b.setForeground(Color.white);
		b.setBackground(Color.orange);
		b1.setForeground(Color.white);
		b1.setBackground(Color.orange);
		b2.setForeground(Color.white);
		b2.setBackground(Color.orange);
		b3.setForeground(Color.white);
		b3.setBackground(Color.orange);

		//더하기
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				// text1, text2에 있는 글자를 가지고 온다.
				String s1 = text1.getText(); // "333"
				String s2 = text2.getText(); // "222"

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 + n2;
				JOptionPane.showInputDialog(f, result);
			}
		});

		
		//빼기
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				// text1, text2에 있는 글자를 가지고 온다.
				String s1 = text1.getText(); // "333"
				String s2 = text2.getText(); // "222"

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 - n2;
				JOptionPane.showInputDialog(f, result);
			}
		});

		
		//곱하기
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				// text1, text2에 있는 글자를 가지고 온다.
				String s1 = text1.getText(); // "333"
				String s2 = text2.getText(); // "222"

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				int result = n1 * n2;
				JOptionPane.showInputDialog(f, result);
			}
		});

		
		//나누기
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용
				// text1, text2에 있는 글자를 가지고 온다.
				String s1 = text1.getText(); // "333"
				String s2 = text2.getText(); // "222"

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				double result = n1 / (double)n2;
				JOptionPane.showInputDialog(f, String.format("%.3f", result));
			}
		});

		// 위에 있는 설정그대로 frame을 보여주라!! 맨 아래에 써야함.
		f.setVisible(true);
	}

}
