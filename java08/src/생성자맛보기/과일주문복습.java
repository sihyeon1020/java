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

public class 과일주문복습 {
	static int count; // 0으로 초기화, 전역변수!
	static int fruit1; // 0으로 초기화, 전역변수!
	static int fruit2; // 0으로 초기화, 전역변수!
	static int fruit3; // 0으로 초기화, 전역변수!
	static int fruit4; // 0으로 초기화, 전역변수!
	final static int PRICE1 = 4500;
	final static int PRICE2 = 3000;
	final static int PRICE3 = 2500;
	final static int PRICE4 = 6000;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(470, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setTitle("과일 구매");

		Font font1 = new Font("D2Coding", 1, 30);
		Font font2 = new Font("D2Coding", 1, 20);
		Font font3 = new Font("D2Coding", 1, 15);

		JLabel textLabel = new JLabel("과일 구매 갯수 : ");
		JLabel totalLabel = new JLabel("0개");
		JLabel imgLabel = new JLabel();
		JLabel priceLabel = new JLabel();
		JLabel totalLabel2 = new JLabel();
		

		JButton btn1 = new JButton("딸기");
		ImageIcon img1 = new ImageIcon("home2.png");
		imgLabel.setIcon(img1);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("04.png");
				imgLabel.setIcon(icon);
				count++;
				totalLabel.setText(count + "개");
				fruit1++;
				totalLabel2.setText("딸기: " + fruit1 + "개, 오렌지: " + fruit2 + "개, 포도 : " + fruit3 + "개, 메론: " + fruit4 +"개");
				int total = (fruit1 * PRICE1) + (fruit2 * PRICE2) + (fruit3 * PRICE3) + (fruit4 * PRICE4);
				priceLabel.setText("총 과일 결제금액 : " + total + "원");

			}
		});

		JButton btn2 = new JButton("오렌지");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("05.jpg");
				imgLabel.setIcon(icon);
				count++;
				totalLabel.setText(count + "개");
				fruit2++;
				totalLabel2.setText("딸기: " + fruit1 + "개, 오렌지: " + fruit2 + "개, 포도 : " + fruit3 + "개, 메론: " + fruit4 +"개");
				int total = (fruit1 * PRICE1) + (fruit2 * PRICE2) + (fruit3 * PRICE3) + (fruit4 * PRICE4);
				priceLabel.setText("총 과일 결제금액 : " + total + "원");

			}
		});

		JButton btn3 = new JButton("포도");
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("06.png");
				imgLabel.setIcon(icon);
				count++;
				totalLabel.setText(count + "개");
				fruit3++;
				totalLabel2.setText("딸기: " + fruit1 + "개, 오렌지: " + fruit2 + "개, 포도 : " + fruit3 + "개, 메론: " + fruit4 +"개");
				int total = (fruit1 * PRICE1) + (fruit2 * PRICE2) + (fruit3 * PRICE3) + (fruit4 * PRICE4);
				priceLabel.setText("총 과일 결제금액 : " + total + "원");

			}
		});

		JButton btn4 = new JButton("메론");
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("07.jpg");
				imgLabel.setIcon(icon);
				count++;
				totalLabel.setText(count + "개");
				fruit4++;
				totalLabel2.setText("딸기: " + fruit1 + "개, 오렌지: " + fruit2 + "개, 포도 : " + fruit3 + "개, 메론: " + fruit4 +"개");
				int total = (fruit1 * PRICE1) + (fruit2 * PRICE2) + (fruit3 * PRICE3) + (fruit4 * PRICE4);
				priceLabel.setText("총 과일 결제금액 : " + total + "원");

			}
		});

		btn1.setBorderPainted(false);
		btn2.setBorderPainted(false);
		btn3.setBorderPainted(false);
		btn4.setBorderPainted(false);
		btn1.setBackground(Color.red);
		btn2.setBackground(Color.orange);
		btn3.setBackground(Color.magenta);
		btn4.setBackground(Color.green);

		btn1.setFont(font1);
		btn2.setFont(font1);
		btn3.setFont(font1);
		btn4.setFont(font1);
		textLabel.setFont(font2);
		totalLabel.setFont(font2);
		priceLabel.setFont(font2);
		totalLabel2.setFont(font3);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(textLabel);
		f.add(totalLabel);
		f.add(imgLabel);
		f.add(priceLabel);
		f.add(totalLabel2);

		f.setVisible(true);

	}

}
