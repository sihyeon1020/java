package 화면DB연결;

import java.awt.BorderLayout;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import oracle.net.ns.AcceptPacket;
import 자바DB연결.ExamMemberDAO;

public class JoinUI {
	
	public static int result;//아이디 입력 값 
	public static int flag;//중복체크 했는지? 값 

	public static void join() {
		JFrame f = new JFrame();
		f.setSize(380, 400);
		f.setTitle("회원가입");

		JLabel title = new JLabel("    회원가입    ");
		JLabel l1 = new JLabel("아 이 디");
		JLabel l2 = new JLabel("패 스 워 드");
		JLabel l3 = new JLabel("이         름");
		JLabel l4 = new JLabel("연   락   처");
		JLabel l5 = new JLabel("주 민 번 호");

		JTextField t1 = new JTextField(8);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);

		Font font1 = new Font("D2Coding", 1, 50);
		Font font2 = new Font("D2Coding", 1, 20);
		Font font3 = new Font("D2Coding", 1, 25);
		Font font4 = new Font("D2Coding", 1, 15);

		JButton b1 = new JButton("가입하기");
		JButton b2 = new JButton("중복 체크");
		

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println("회원가입 처리");
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				String rrn = t5.getText();

				ExamMemberDAO dao = new ExamMemberDAO();
				ExamMemberVO bag = new ExamMemberVO();// 가방 만들기
				
				if (flag != 1) {
					JOptionPane.showMessageDialog(f, "아이디 중복체크를 해주세요.");
				} else {

					if (result == 0) {

						if (id.equals("")) {
							JOptionPane.showMessageDialog(f, "아이디를 입력해주세요.");
						} else if (pw.equals("")) {
							JOptionPane.showMessageDialog(f, "패스워드를 입력해주세요.");
						} else if (name.equals("")) {
							JOptionPane.showMessageDialog(f, "이름을 입력해주세요.");
						} else if (tel.equals("")) {
							JOptionPane.showMessageDialog(f, "전화번호를 입력해주세요.");
						} else if (rrn.equals("")) {
							JOptionPane.showMessageDialog(f, "주민번호를 입력해주세요.");
						} else {
							// 가방에 값 넣기
							bag.setId(id);
							bag.setPw(pw);
							bag.setName(name);
							bag.setTel(tel);
							bag.setRrn(rrn);

							int result2 = dao.insert(bag);
							JOptionPane.showMessageDialog(f, "회원가입이 완료되었습니다.");
							f.dispose(); // 창 끄기
						}

					}
				}

			}
		}); 

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id = t1.getText();

				ExamMemberDAO dao = new ExamMemberDAO();

				ExamMemberVO bag = new ExamMemberVO();// 1.가방 만들기
				// 2.가방에 값 넣기
				bag.setId(id);

				result = dao.check(bag);

				if (result == 1) {
					JOptionPane.showMessageDialog(f, "중복된 아이디 입니다. 다시 확인해주세요.");
				} else {
					JOptionPane.showMessageDialog(f, "사용 가능한 아이디 입니다.");
				}
				
				flag = 1;
			}
		});// 아이디 중복 체크

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		title.setFont(font1); title.setForeground(new Color(153, 204, 255));
		l1.setFont(font2); l1.setForeground(Color.white);
		l2.setFont(font2); l2.setForeground(Color.white);
		l3.setFont(font2); l3.setForeground(Color.white);
		l4.setFont(font2); l4.setForeground(Color.white);
		l5.setFont(font2); l5.setForeground(Color.white);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);
		t5.setFont(font2);
		b1.setFont(font3);
		b2.setFont(font4);
		b1.setBorderPainted(false);
		b2.setBorderPainted(false);
		b1.setFocusPainted(false);
		b2.setFocusPainted(false);
		
		b1.setBackground(new Color(25, 172, 232));
		b2.setBackground(new Color(225, 230, 234));
		b1.setForeground(Color.white);
		b2.setForeground(new Color(253, 0, 58));

		f.add(title);
		f.add(l1);
		f.add(t1);
		f.add(b2);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		f.add(b1);

		f.getContentPane().setBackground(new Color(25, 40, 81));
		
		f.setVisible(true);
	}
}
