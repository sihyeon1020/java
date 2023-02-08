package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명2 {

	public static void main(String[] args) {
		//인기투표해봅시다!
		//1)아이유 2)뉴진스 3)BTS
		int iu = 0;
		int nj = 0;
		int bts = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표 해봅시다. 1)아이유  2)뉴진스  3)BTS");
			if (data.equals("1")) {
				iu++;
			} else if(data.equals("2")) {
				nj++;
			} else if (data.equals("3")) {
				bts++;;
			}
		}
		
		System.out.println("아이유 좋2하는 사람 몇명? " + iu + "명");
		System.out.println("뉴진스 좋아하는 사람 몇명? " + nj + "명");
		System.out.println("BTS 좋아하는 사람 몇명? " + bts + "명");
		
		
	}

}
