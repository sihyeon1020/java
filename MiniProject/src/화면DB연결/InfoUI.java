package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.ExamMemberDAO;

public class InfoUI {
	public static void info() {
		JFrame f = new JFrame();
		f.setSize(380,450);
		f.setTitle("마이페이지");
		
		JLabel title = new JLabel("<<<<<마이페이지>>>>>");
		JLabel title2 = new JLabel("                                     ");
		JLabel l1 = new JLabel("아 이 디");
		JLabel l2 = new JLabel("패스워드");
		JLabel l3 = new JLabel("연 락 처");
		
		JTextField t1 = new JTextField(13);
		JTextField t2 = new JTextField(13);
		JTextField t3 = new JTextField(13);
		
		Font font1 = new Font("D2Coding", 1 , 30);
		Font font2 = new Font("D2Coding", 1 , 18);
		Font font3 = new Font("D2Coding", 1 , 30);
		
		JButton b1 = new JButton("시험일정 확인");
		JButton b2 = new JButton("합격자 발표");
		JButton b3 = new JButton("시험 후기");
		JButton b4 = new JButton("회원정보 수정");
		
		// 수정기능
				b4.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("회원수정 처리");
						String id = t1.getText(); // 조건
						String pw = t2.getText(); // 바꾸는 항목 1
						String tel = t3.getText();  // 바꾸는 항목 2

						ExamMemberDAO dao = new ExamMemberDAO();
						// 1. 가방을 만들자
						ExamMemberVO bag = new ExamMemberVO();
						// 2.가방에 값을 넣자
						bag.setId(id);
						bag.setPw(pw);
						bag.setTel(tel);
						int result = dao.update(bag);

						if (result == 1) {
							JOptionPane.showMessageDialog(f, "회원수정 성공");
						} else {
							JOptionPane.showMessageDialog(f, "회원수정 실패, 재입력해주세요.");
						}

					}// action
				});// 회원정보 수정		
		
				
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		title.setFont(font1);
		title2.setFont(font1);
		title.setForeground(Color.white);
		l1.setFont(font2);
		l2.setFont(font2);
		l3.setFont(font2);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		b4.setFont(font2);

		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);
		
		b1.setBackground(new Color(0, 130, 212));
		b2.setBackground(new Color(25, 172, 232));
		b3.setBackground(Color.white);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b4.setForeground(Color.white);
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		b3.setForeground(new Color(0, 130, 212));
		b4.setForeground(new Color(253, 0, 58));
		b1.setBorderPainted(false);
		b2.setBorderPainted(false);
		b3.setBorderPainted(false);
		b4.setBorderPainted(false);
		b1.setFocusPainted(false);
		b2.setFocusPainted(false);
		b3.setFocusPainted(false);
		b4.setFocusPainted(false);

		f.add(title);
	
		f.add(l1); f.add(t1);
		f.add(l2); f.add(t2);
		f.add(l3); f.add(t3);
		f.add(b4);
		f.add(title2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.getContentPane().setBackground(new Color(000, 051, 153));
		
		
		f.setVisible(true);
	}
}
