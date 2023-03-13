package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import oracle.net.ns.AcceptPacket;
import 자바DB연결.ExamMemberDAO;

public class StartUI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("자격증 원서 접수");
		f.setSize(300, 450);

		JLabel title = new JLabel("자격증 원서 접수 사이트");
		JLabel l1 = new JLabel("아이디");
		JLabel l2 = new JLabel("패스워드");
		JLabel imgLabel = new JLabel();
		
		JTextField t1 = new JTextField(15);
		JTextField t2 = new JTextField(15);

		JButton b1 = new JButton("로그인");
		JButton b2 = new JButton("회원가입");
		

		ImageIcon img = new ImageIcon("main.png");
		imgLabel.setIcon(img);

		Font f1 = new Font("D2Coding", Font.BOLD, 15);
		Font f2 = new Font("D2Coding", Font.BOLD, 20);
		Font f3 = new Font("D2Coding", Font.BOLD, 20);

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();

				ExamMemberDAO dao = new ExamMemberDAO();
				// 1.가방만들기
				ExamMemberVO bag = new ExamMemberVO();
				// 2.가방에 값 넣기
				bag.setId(id);
				bag.setPw(pw);

				int result = dao.login(bag);

				if (result == 0) {
					JOptionPane.showMessageDialog(f, "로그인에 실패하였습니다. 다시 입력해주세요.");
					
				} else {
					JOptionPane.showMessageDialog(f, "로그인하였습니다.");
					f.dispose(); //창 끄기
					InfoUI.info();
				}
			}
		}); // 로그인 버튼
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JoinUI.join();
			}
		}); //회원가입 버튼

		title.setFont(f1);
		l1.setFont(f2);
		l2.setFont(f2);
		t1.setFont(f2);
		t2.setFont(f2);
		b1.setFont(f3);
		b2.setFont(f3);

		b1.setBackground(new Color(25, 172, 232));
		b2.setBackground(Color.GRAY);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b1.setBorderPainted(false);
		b2.setBorderPainted(false);
		b1.setFocusPainted(false);
		b2.setFocusPainted(false);

		f.add(title);

		f.add(imgLabel);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.getContentPane().setBackground(new Color(000, 051, 153));
		
		title.setForeground(Color.white);
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.setVisible(true);
	}
}
