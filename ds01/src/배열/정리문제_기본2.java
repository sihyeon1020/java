package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제_기본2 {
	public static void main(String[] args) {
	
		//2.랜덤한 값 20개를 발생시켜, 값의 범위 0 ~ 899를 빈 배열에 넣은 후, 최대값을 구해 프린트 해보세요.
		Random r = new Random();
		int[] numbers = new int[20];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(900);//0~899
		}
		Arrays.sort(numbers);
		System.out.println("2) 최대값은 " + numbers[19]);
	}

}
