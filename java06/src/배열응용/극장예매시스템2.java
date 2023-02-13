package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 극장예매시스템2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(480, 800);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel title = new JLabel("영화예매 프로그램");
		JLabel result = new JLabel("결과 값 보이는 곳");

		Font font1 = new Font("D2Coding", 1, 50);
		Font font2 = new Font("D2Coding", 1, 15);
		title.setFont(font1);

		f.add(title);

		JButton[] btn = new JButton[50]; // 좌석버튼
		int[] seat = new int[btn.length]; // ★예매 내역을 넣기 위한 배열 사용

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + ""); // ★복습
			btn[i].setFont(font2);
			f.add(btn[i]); // 좌석버튼 숫자만큼 생성

			btn[i].addActionListener(new ActionListener() { //버튼 눌렀을 때 나오는 반응 넣기 

				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);

					if (seat[no] == 1) {
						result.setText("이미 예약된 좌석입니다.");
					} else {
						seat[no] = 1;// 예약좌석은 1로 변경!
						result.setText(text + " 예약 완료");
						btn[no].setBackground(Color.black);
						btn[no].setEnabled(false);
						;
					}//if
				}
			}); // action
		}//for
		
		
		
		
		f.add(result);

		f.setVisible(true);
	}
}
