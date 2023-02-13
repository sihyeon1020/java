package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(700, 800);
		f.getContentPane().setBackground(Color.black);

		// 배치해주는 부품 - flowlayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // 추가한 순서대로 f에 붙는다.

		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		JButton[] btn = new JButton[100];
		// 반복해서 배열에 버튼 만들어넣기
		// 반복해서 f에 add해주세요.
		Font font = new Font("D2Coding", Font.BOLD, 15);
		Font font2 = new Font("D2Coding", Font.BOLD, 25);

		JLabel result = new JLabel("결과 보이는 곳");

		result.setFont(font);
		result.setForeground(Color.red);

		// 예약 여부를 저장하는 배열을 만들어줍시다
		int[] seat = new int[btn.length]; // {0,0,0,0,0,0,....}//★여기 헷갈리니 다시 복습
		// 각 자리에 저장된 값이 0이면 아직 예약 안되었음. 예약되면 1로 바꿈.

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + ""); // i + "" 하나라도 문자열이면 문자열이 된다.
			btn[i].setFont(font);
			f.add(btn[i]);

			// 버튼에 액선기능 add 해보자.
			// 1. 액션 기능 추가
			// 2. 클릭했을 때 어떤 부품이 담당할지 부품 생성
			// 3. 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌
					String text = e.getActionCommand();// "0"
					System.out.println(text);

					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고, 1이 아니면 예약가능
					int no = Integer.parseInt(text); //"0" -> 0 ★여기 헷갈리니 다시 복습

					if (seat[no] == 1) {
						result.setText("이미 예약된 좌석입니다.");
					} else { // 아직 예약이 안되어서 0이 들어있음.
						seat[no] = 1;// 예약좌석은 1로 변경!
						result.setText(text + "번 예약 완료");
						btn[no].setBackground(Color.red);
						btn[no].setEnabled(false);;
					}

				}
			});

		}

		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font2);

		f.add(result);
		f.add(total);

		// ★여기 헷갈리니 다시 복습
		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열안에 저장된 값이 1인지 체크해서 카운트
				int count = 0;
				for (int x : seat) {
					if (x == 1) {
						count++;
					} // if
				} // for
				JOptionPane.showConfirmDialog(f, (count * 10000) + "원 결제 하시면 됩니다.");
				// 영화예매비 1장당 1만원, 결제금액 출력
			}
		});

		f.setVisible(true);
	}
}
