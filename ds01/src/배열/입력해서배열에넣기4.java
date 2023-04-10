package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numbers = new double[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble(); // String --> double
		}
		sc.close();// stream close

		int count = 0; // 22.2가 몇개인지 프린트 해보자!

		for (int i = 0; i < numbers.length; i++) { // int i < 이건 index 위치라 double로 바꾸는 거 아님
			if (numbers[i] == 22.2) {
				count++;
			}
		}
		System.out.println("22.22의 갯수는 " + count);
	}
}
