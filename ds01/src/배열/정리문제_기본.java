package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제_기본 {
	public static void main(String[] args) {
		//1.int값 5개 55,66,77,22,33 입력받아서, 최소값을 구해 프린트 해보세요.
		//1)배열 사용해야함
		//2)Scanner 사용해야함
		Scanner sc = new Scanner(System.in);
		int[] s = new int[5];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(s);
		System.out.println("1)최소값은 " + s[0]);
			
	}
}
