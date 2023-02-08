package 조건문;

import java.util.Scanner;

public class 콘솔입력3 {

	public static void main(String[] args) {

		// 1번
		Scanner sc = new Scanner(System.in);

		System.out.print("ID를 입력하세요. >> ");
		String id = sc.next();
		System.out.print("PW를 입력하세요. >> ");
		int pw = sc.nextInt();
		if (id.equals("root") && pw == 1234) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}

		sc.close();
	}

		// 2번
//		Scanner sc = new Scanner(System.in);
//		System.out.println("사과 구매 갯수를 입력해주세요. >> ");
//		int apple = sc.nextInt();
//		
//		System.out.println("딸기 구매 갯수를 입력해주세요. >> ");
//		int berry = sc.nextInt();
//		
//	
//		
//		System.out.println("====================");
//		System.out.println("사과 구매 가격은 " + (apple*5500));
//		System.out.println("딸기 구매 가격은 " + (berry*4500));
//		
//		int result = 0;
//		int result2 = sc.nextInt(apple + berry);
//		System.out.println("전체 구매 가격은 " + result);
//	}
}
