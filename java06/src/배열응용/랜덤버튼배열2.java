package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {
	public static void main(String[] args) {
		//1. 프레임을 만들어보세요. 실행해서 눈으로 확인
		JFrame f = new JFrame();
		f.setSize(900, 700);
		//2. 프레임을 설정해보세요. 레이아웃 부품 설정하지 않습니다.
		f.setLayout(null);
		//3. 버튼을 넣을 배열을 먼저 만들어두세요. 500개
		JButton[] button = new JButton[500];
		//4. 버튼을 500개 만들어서 배열에 넣어주세요.
	
		
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("버튼" + i); //★이 부분 헷갈리니 복습	
			
		}
		
		//5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, f에 붙여주세요.
		Random r = new Random();
		//color[r.nextInt(colors.length)]//0~3
		Color[] colors = {Color.CYAN, Color.ORANGE, Color.lightGray};
		
		for (int i = 0; i < button.length; i++) {
			int x = r.nextInt(800);
			int y = r.nextInt(600);
			
			button[i].setBounds(x, y, 80, 30);//★이 부분 헷갈리니 복습	
			button[i].setBackground(colors[r.nextInt(3)]);//★이 부분 헷갈리니 복습
			f.add(button[i]);
		}
		
		//심화-1)) 버튼 색을 몇 가지 지정해서 임의로 설정, 힌트 color 배열 
		//        colors 배열 중 아무 인덱스나 색으로 지정하면 됨.
		//        button[i].setBackgroundColor(Color.red);
		//		  Color[] colors = {Color.red, Color.blue, ...}
		
		
		//심화-2)) f에 배경색을 넣어보기
		f.getContentPane().setBackground(Color.YELLOW);
		
		
		f.setVisible(true);
	}
}
