package 배열응용;

import java.util.Random;

public class 많은양만들어보기2 {
	public static void main(String[] args) {
		int[] jumsu2 = new int[1000];

		Random r = new Random(42);

		// 1. 2부터 20까지 임의로 만들어서 배열에 넣어보기
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2; // 0~18
		}

		// 2. 전체 프린트
		for (int x : jumsu2) {
			System.out.println(x);
		}

		// 3. 3이상인 숫자 몇 개인지 프린트
		// 배열은 전체를 가지고 와서, 3이상인 체크 갯수를 세어주기
		int count = 0;
		int sum = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i] >= 15) {
				count++; // count = count + 1;
				sum = sum + jumsu2[i]; // ★ 이해안가는 부분 복습하기 (15이상의 총합 구하는 방법)
			}
		} // for

		System.out.println("15이상의 갯수: " + count);
		System.out.println("15이상의 총합: " + sum);

	}
}
