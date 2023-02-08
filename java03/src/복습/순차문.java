package 복습;

//JOptionPane이 javax폴더 아래 swing폴더 아래에 있음을 알려줌.
//위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 두 개의 숫자를 입력을 받아서 처리해 출력
		// 프로그래밍은 손으로 치는 값은 모두 다 스트링으로 취급(문자로 취급/문자열)
		// 램에 저장공간을 만드는 것 => 선언
		// 선언할 때 램에 저장공간인 변수가 만들어진다.
		// 데이터타입 변수명 
		//입력
		String n1 = JOptionPane.showInputDialog("숫자1입력");
		String n2 = JOptionPane.showInputDialog("숫자2입력");

		//처리
		//정수로 바꾸어서 처리를 하고 싶으면, 프로그래머가 정수로 바꾸어주는 부품을 써서 처리
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		
		//출력
		//자바언어는 정수와 정수의 연산의 결과는 무조건 정수
		//자바언어는 하나라도 실수이면 결과는 무조건 실수
		System.out.println((double)n11 / n22);
		System.out.printf("%.3f", (double)n11 / n22);
	}

}
