package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기3 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(300, 600);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("비밀번호");
		
		JLabel text3 = new JLabel();
		text3.setText("이름");
		
		JLabel text4 = new JLabel();
		text4.setText("전화번호");
		
	
		
		//input
		JTextField id = new JTextField(15);
		JTextField pw = new JTextField(15);
		JTextField name = new JTextField(15);
		JTextField call = new JTextField(15);
		
		//버튼
		JButton result = new JButton();
		
		//폰트
		Font font = new Font("D2Coding", 1, 20);
		
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		id.setFont(font);
		pw.setFont(font);
		name.setFont(font);
		call.setFont(font);
		
		f.add(text1);
		f.add(id);
		
		f.add(text2);
		f.add(pw);
		
		f.add(text3);
		f.add(name);
		
		f.add(text4);
		f.add(call);
		
		f.add(result);
		
		f.setVisible(true);
		}

}
