package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주써서 RAM에 언제든 사용할 수 있도록 준비되어 있음
		//    부품명. 기능()
		// 2. 쓸때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어  RAM에
		//    저장해두고 사용
		//    벽돌 b1 = new 벽돌();
		//    벽돌 b2 = new 벽돌();
		//    벽돌 b3 = new 벽돌();
		
		JFrame f = new JFrame();
		f.setSize(400, 300);
		
		//jframe 배경
		f.getContentPane().setBackground(Color.white);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요.");
		
		JTextField text = new JTextField(10);
		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2CodingBold", 1, 15);
		Font font2 = new Font("D2CodingBold", 1, 30);
		

		
		l.setFont(font);
		l.setForeground(Color.orange);
		
		b.setBackground(Color.orange);
		b.setForeground(Color.white);
		b.setFont(font2);
		b.setText("Number Game");
		
		//JFram에 배치를 물흐르듯이 순서대로 붙여주는 부품 설정
		f.setLayout(flow);
		
		text.setBackground(Color.black);
		text.setForeground(Color.white);
		text.setFont(font2);
		
		f.add(l);//f라는 부품 위에 조립해서 올려놔라.
		f.add(text);
		f.add(b);
		
		//맨 아래에
		f.setVisible(true);
	}

}
