package 부품응용하기;

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

public class 로그인화면 {
	public static void main(String[] args) {
		// font, flowlayout
		// jframe, imageicon, imagelabel
		// idlabel, pwlabel, id입력값, pw입력값
		// 로그인, reset버튼

		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setTitle("내 일기장 로그인");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2Coding", 1, 30);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아 이 디  : ");
		JLabel pw = new JLabel("패스워드: ");
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("in.png");
		ImageIcon icon3 = new ImageIcon("out.png");
		top.setIcon(icon1);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);
		login.setBackground(Color.LIGHT_GRAY);
		reset.setBackground(Color.LIGHT_GRAY);


		// 1) 버튼에 액션기능을 add
		// 2) 클릭했을 때 "어떤 부품"이 처리를 담당할 지 new로 만들어주세요.
		// 3) 클릭했을 때 "어떻게 처리할지를" 써주세요.
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을 때 idText, pwText에 공백을 넣어라.
				idText.setText("");
				pwText.setText("");
			}	
		});// reset add end
		
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// idText, pwText에 getText()
				String id2 = idText.getText(); //"root"
				String pw2 = pwText.getText(); // "1234"
				//root/1234 인지 비교해서 로그인 성공/실패 joptionpane으로 출력!
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					//일기장쓰기 부품의 open()기능 쓰자!
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});//login add end

		
		login.setBorder(null);
		reset.setBorder(null);
		
		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);
		f.setVisible(true);
	}
}
