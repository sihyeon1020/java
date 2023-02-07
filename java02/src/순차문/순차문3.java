package 순차문;

//부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		// 기본 순차문 입력 ==> 입력 -> 처리 -> 출력
		// 입력
		String tall = JOptionPane.showInputDialog("키는?");
		String weight = JOptionPane.showInputDialog("몸무게는?");
		
		//처리
		double tall2 = Double.parseDouble(tall);
		double weight2 = Double.parseDouble(weight);
		
		double result = (tall2 - weight2) * 0.9; 
		
		//출력
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
		

	}

}
