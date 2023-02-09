package 제어문문제;



import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class 인기투표시스템2 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(350, 800);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel title = new JLabel();
		title.setText("k-pop 인기 투표");
		JLabel s1 = new JLabel();
		s1.setText("1. 윤하 - 사건의 지평선");
		JLabel s2 = new JLabel();
		s2.setText("2. 아이유 - 라일락");
		JLabel s3 = new JLabel();
		s3.setText("3. OMG - NewJeans");
		
		JLabel s4 = new JLabel();//윤하 투표수 
		JLabel s5 = new JLabel();//아이유 투표수
		JLabel s6 = new JLabel();//뉴진스 투표수
		
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		
		Font titlef = new Font("D2Coding", 1, 30);
		title.setFont(titlef);
		Font font1 = new Font("D2Coding", 1, 15);
		s1.setFont(font1);
		s2.setFont(font1);
		s3.setFont(font1);
		
		Font font2 = new Font("D2Coding", 1, 20);
		s4.setFont(font2);
		s5.setFont(font2);
		s6.setFont(font2);
		s4.setForeground(Color.red);
		s5.setForeground(Color.red);
		s6.setForeground(Color.red);
		
		ImageIcon img1 = new ImageIcon("2.jpg");
		ImageIcon img2 = new ImageIcon("3.jpg");
		ImageIcon img3 = new ImageIcon("4.jpg");
		b1.setIcon(img1);
		b2.setIcon(img2);
		b3.setIcon(img3);
		
		
		f.add(title);
		f.add(b1);
		f.add(s1);
		f.add(s4);
		f.add(b2);
		f.add(s2);
		f.add(s5);
		f.add(b3);
		f.add(s3);
		f.add(s6);
		
		b1.addActionListener(new ActionListener() {
			int yh = 0; 
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 입력
				yh++;
				s4.setText(yh + "표");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			int iu = 0; 
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 입력
				iu++;
				s5.setText(iu + "표");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			int njs = 0; 
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼 클릭할 때마다 처리할 내용을 입력
				njs++;
				s6.setText(njs + "표");
			}
		});
		
		
		f.setVisible(true);

	}
}
