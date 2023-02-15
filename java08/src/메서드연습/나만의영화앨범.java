package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나만의영화앨범 {

	static int index = 2; // 현재 2부터 시작

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "고장난 론", "해리포터", "타이타닉", "겟 아웃" };
		String[] img = { "movie1.jpg", "movie2.jpg", "movie3.jpg", "movie4.jpg", "movie5.jpg" };
		double[] jumsu = { 9.28, 8.47, 9.40, 9.72, 8.44 };

		JFrame f = new JFrame();
		f.setSize(516, 530);
		f.getContentPane().setBackground(Color.orange);

		Font font = new Font("D2Coding", 1, 40);
		Font font2 = new Font("D2Coding", 1, 25);

		JLabel top = new JLabel(title[2]);
		top.setHorizontalAlignment(0);// 가운데 지정
		top.setForeground(Color.black);
		top.setFont(font);
		f.add(top, BorderLayout.NORTH); // 보더 레이아웃 위치 지정해주는 값

		ImageIcon icon = new ImageIcon(img[2]);
		JLabel center = new JLabel(icon);
		center.setFont(font);
		f.add(center, BorderLayout.CENTER);

		// String.valueOf() : int, double, ... => string
		JLabel under = new JLabel("영화평점 : " + String.valueOf(jumsu[2]));
		under.setHorizontalAlignment(0);
		under.setFont(font);
		f.add(under, BorderLayout.SOUTH);

		JButton left = new JButton("<<");
		left.setBackground(Color.black);
		left.setFont(font2);
		f.add(left, BorderLayout.WEST);

		// 액션처리 하는 방법
		// 1)액션기능을 add
		// 2)클릭액션이 있을 때 처리할 부품을 만들어주세요.
		// 3)클릭액션이 있을 때 어떻게 처리할지 내용을 코딩해주세요.
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--; // index = index - 1; , index-= 1;
				}else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
			}
		});

		JButton right = new JButton(">>");
		right.setBackground(Color.black);
		right.setFont(font2);
		f.add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					// 현재 인덱스보다 하나 적은 값들로 top, center, under를 setting
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++; // index = index - 1; , index-= 1;
				}else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
			}
		});

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}
}
