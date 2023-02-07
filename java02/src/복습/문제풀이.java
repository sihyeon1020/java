package 복습;

import javax.swing.JOptionPane;

public class 문제풀이 {

	public static void main(String[] args) {
		// 1번
		String pw = JOptionPane.showInputDialog("암호를 대시오");

		if (pw.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}

		// 2번
		String menu = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는?(자장면, 라면, 회에서 선택)");

		if (menu.equals("자장면")) {
			System.out.println("중국집으로 가요.");
		} else if (menu.equals("라면")) {
			System.out.println("분식집으로 가요.");
		} else if (menu.equals("회")) {
			System.out.println("횟집으로 가요.");
		} else {
			System.out.println("그냥 안먹어요.");
		}

		// 3번
		String data1 = JOptionPane.showInputDialog("정수를 입력하세요.1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하세요.2");

		int data11 = Integer.parseInt(data1);
		int data22 = Integer.parseInt(data2);

		if (data11 > data22) {
			System.out.println(data11);
		} else if (data11 < data22) {
			System.out.println(data22);
		} else {
			System.out.println("두 정수가 동일함");
		}

		
		// 4번
		String no = "A100EX";
		char no2 = no.charAt(0);

		switch (no2) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서 없음");
		}
		
		
	}

}
