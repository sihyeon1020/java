package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 반복문확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(330, 350);
		f.getContentPane().setBackground(Color.black);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b = new JButton();
		b.setText("별10개");
		JButton b1 = new JButton();
		b1.setText("커피*5");
		JButton b2 = new JButton();
		b2.setText("커피*우유3");
		JButton b3 = new JButton();
		b3.setText("1:짱!");

		Font font = new Font("D2Coding", 1, 45);
		b.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		f.add(b);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		// 1)버튼에 액션기능을 추가하겠다고 설정
		// 2)클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할 지 코딩
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용을 여기에 쓰기
				System.out.println("b을 클릭했음");
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b1을 클릭했음");
				for (int i1 = 0; i1 < 5; i1++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2을 클릭했음");
				for (int i2 = 0; i2 < 3; i2++) {
					System.out.println("커피*우유");
				}
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b3을 클릭했음");
				for (int i3 = 0; i3 < 3; i3++) {
					System.out.println(i3 + 1 + " : 짱!");
				}

			}
		});

		f.setVisible(true);
	}

}
