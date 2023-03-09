package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StartUI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("로그인 하기");
		f.setSize(300,250);
		
		JLabel title = new JLabel("로그인 화면");
		JLabel l1 = new JLabel("아이디");
		JLabel l2 = new JLabel("패스워드");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		
		JButton b1 = new JButton("로그인");
		JButton b2 = new JButton("회원가입");
		
		Font f1 = new Font("D2Coding",Font.BOLD,40);
		Font f2 = new Font("D2Coding",Font.BOLD,20);
		Font f3 = new Font("D2Coding",Font.BOLD,25);
		
		
		title.setFont(f1);
		l1.setFont(f2);
		l2.setFont(f2);
		t1.setFont(f2);
		t2.setFont(f2);
		b1.setFont(f3);
		b2.setFont(f3);
		
		b1.setBackground(Color.ORANGE);
		b2.setBackground(Color.GRAY);
		
		f.add(title);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		
		
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.setVisible(true);
	}
}
