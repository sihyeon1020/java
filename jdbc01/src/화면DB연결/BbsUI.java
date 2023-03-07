package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI {
	 public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(500,500);
		
		JLabel l1 = new JLabel("<<<<<<나의 게시판>>>>>>");
		JLabel l6 = new JLabel("---------------------------------------------");
		
		JLabel l2 = new JLabel("게시판 ID");
		JLabel l3 = new JLabel("게시판 제  목");
		JLabel l4 = new JLabel("게시판 내  용");
		JLabel l5 = new JLabel("게시판 작성자");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물 글쓰기 처리");
		JButton b2 = new JButton("게시물 지우기 처리");
		JButton b3 = new JButton("게시물 수   정 처리");
		JButton b4 = new JButton("게시물 검   색 처리");
		
		//f에 위에 있는 요소들을 add로 붙여줘야하는데,
		//붙이는 순서대로 물 흐르듯이 붙여주고 싶음.
		//물 흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		
		//폰트를 설정하기 위해 font부품 필요
		Font font = new Font("D2Coding",Font.BOLD ,40);
		Font font2 = new Font("D2Coding",Font.BOLD ,30);
		Font font3 = new Font("D2Coding",Font.BOLD ,20);
		
		/////////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ////////////////
		//조립을 시작해보자//
f.setLayout(flow);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		l1.setFont(font);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);
		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);
		b4.setFont(font3);
		
		
		l1.setForeground(Color.blue);
	
		t1.setForeground(Color.white);
		t1.setBackground(Color.DARK_GRAY);
		t1.setForeground(Color.white);
		t2.setBackground(Color.DARK_GRAY);
		t2.setForeground(Color.white);
		t3.setBackground(Color.DARK_GRAY);
		t3.setForeground(Color.white);
		t4.setBackground(Color.DARK_GRAY);
		t4.setForeground(Color.white);
		
		
		b1.setBackground(Color.blue); //배경색
		b1.setForeground(Color.white); //글자색
		b2.setBackground(Color.blue); 
		b2.setForeground(Color.white); 
		b3.setBackground(Color.blue); 
		b3.setForeground(Color.white); 
		b4.setBackground(Color.blue); 
		b4.setForeground(Color.white); 
		
		f.getContentPane().setBackground(Color.pink);
		//맨 끝으로
		f.setVisible(true);
	}
}
