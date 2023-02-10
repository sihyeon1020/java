package 배열응용;

import java.util.Scanner;

public class Scanner입력배열로 {

	public static void main(String[] args) {
		//1. 정수 5개 크기의 배열을 만들어서 10, 20, 30, 40, 50을 순서대로 넣는다.
		// 첫번째값과 세번째값을 더해서 프린트
		
		//정수 --> sc.nextlnt()
	
		Scanner sc = new Scanner(System.in);
		
		
		int[] num = new int[5];		
		for (int i = 0; i < num.length; i++) {
			System.out.print("정수 값을 입력하세요 >> ");
			num[i] = sc.nextInt();
		}
		System.out.println("첫번째값과 세번째값 더하기 >> " + (num[0] + num[2]));

		
		System.out.println("====================");
		//2. 스트링 3개의 크기의 배열을 만들어서 자바,스프링,JSP를 순서대로 넣는다.
		// => "자바 보다는 스프링"으로 출력
		//문자열 --> sc.next()
		String[] num2 = new String[3];
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println("스트링 3개의 크기 배열 입력 >>");
			num2[i] = sc.next();
		}
		System.out.println(num2[0] + "보다는 " + num2[1]);
	
	
		sc.close();	//끝
		
	}

}
