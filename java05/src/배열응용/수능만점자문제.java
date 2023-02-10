package 배열응용;

import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		Random r = new Random(42);

		int count = 0;
		int count2 = 0;
		int sum = 0;

		// 1. 만점자가 몇명인지?
		// 2. 0점이 몇 명인지?
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);// 0~450

			if (jumsu[i] == 450) {
				count++;
				System.out.println(i + "번째  학생(만점자) ");
			} else if (jumsu[i] == 0) {
				count2++;
			}
		}

		System.out.println("만점자의 수 : " + count);
		System.out.println("0점인 사람의 수 : " + count2);

		// 3. 평균은 어떻게 되는지? 합계를 먼저 구해야함
		for (int x : jumsu) {
			sum += x;
		}
		System.out.println("전체합계: " + sum); // 전체 점수 합

		double avg = (double) sum / jumsu.length;
		System.out.println("전체평균: " + avg);// 전체 평균

		
		
		// 4. 심화)) 평균보다 +-50점인 학생 카운트
		
		
		
	}

}
