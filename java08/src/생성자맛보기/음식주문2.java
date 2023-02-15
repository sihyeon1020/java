package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 음식주문2 {

	static int count; // 0으로 초기화, 전역변수!
	static int food1; // 짬뽕
	static int food2; // 우동
	static int food3; // 짜장
	final static int PRICE1 = 3500; // final은 변경 불가, 상수
	final static int PRICE2 = 3000; // final은 변경 불가, 상수
	final static int PRICE3 = 4000; // final은 변경 불가, 상수
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로! 권장

	public static void main(String[] args) {

		// 이미지
		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.setTitle("음식주문");
		f.getContentPane().setBackground(Color.lightGray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", 1, 30);
		Font font2 = new Font("D2Coding", 1, 20);

		JLabel textLabel = new JLabel("개수 : ");
		textLabel.setFont(font2);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font2);

		JLabel imgLabel = new JLabel();
		JLabel result = new JLabel("결제금액 : ");
		ImageIcon img1 = new ImageIcon("home.png");
		imgLabel.setIcon(img1);
		result.setFont(font);

		// 버튼 클릭시 액션
		JButton btn1 = new JButton("짬뽕");
		btn1.setBorderPainted(false);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("03.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				food1++;

				f.setTitle("짬뽕: " + food1 + "개, 우동: " + food2 + "개, 짜장 : " + food3 + "개");
				int total = (food1 * PRICE1) + (food2 * PRICE2) + (food3 * PRICE3);
				result.setText("결제금액 : " + total + "원");

			}
		});

		JButton btn2 = new JButton("우동");
		btn2.setBorderPainted(false);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("02.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				food2++;

				f.setTitle("짬뽕: " + food1 + "개, 우동: " + food2 + "개, 짜장 : " + food3 + "개");
				int total = (food1 * PRICE1) + (food2 * PRICE2) + (food3 * PRICE3);
				result.setText("결제금액 : " + total + "원");

			}
		});

		JButton btn3 = new JButton("짜장");
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("01.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				food3++;

				f.setTitle("짬뽕: " + food1 + "개, 우동: " + food2 + "개, 짜장 : " + food3 + "개");
				int total = (food1 * PRICE1) + (food2 * PRICE2) + (food3 * PRICE3);
				result.setText("결제금액 : " + total + "원");
			}
		});

		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);
		btn1.setBackground(Color.magenta);
		btn2.setBackground(Color.green);
		btn3.setBackground(Color.yellow);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);

		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);

		f.setVisible(true);

	}
}
