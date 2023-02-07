package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(800, 150);
		
		// 물 흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓음
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		
		// f에 물 흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("버튼입니다");
		
		JButton b2 = new JButton();
		b2.setText("버튼2입니다");
		
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		
		//글자 넣는 곳
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		//import가 안된 경우 Font 위에 마우스 올리면 import Font~를 클릭
		//단축키로는 컨트롤 + 쉬프트 + o
		Font font = new Font("굴림", 1, 20);
		
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.red); // 배경색
		b1.setForeground(Color.white); //버튼의 위색, 글자색
		b2.setBackground(Color.red); // 배경색
		b2.setForeground(Color.white); //버튼의 위색, 글자색
		input1.setBackground(Color.black); // 배경색
		input1.setForeground(Color.white); //버튼의 위색, 글자색
		input2.setBackground(Color.black); // 배경색
		input2.setForeground(Color.white); //버튼의 위색, 글자색
		
		//1.jpg 파일명을 쓰면 java02 프로젝트 바로 아래 있는 것으로 인식
		ImageIcon icon = new ImageIcon("1.jpg");
		ImageIcon icon2 = new ImageIcon("2.jpg");

		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		//보여주는 것은 맨 끝으로
		f.setVisible(true);
		}

}
