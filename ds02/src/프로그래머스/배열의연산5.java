package 프로그래머스;

import java.util.Arrays;

public class 배열의연산5 {
	//{4, 3, 2, 7, 5, 10, 8, 9}
	//두 수를 곱했을 때 가장 큰 숫자를 구해보세요.
	//배열이 오름차순으로 정렬이 되어 있는 상태!
	
	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		//int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//int[] numbers = {1, 2, 3, 4, 5, 9, 10};
		int[] numbers = {1, 2, -3, 4, -5};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution9 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers); //파괴형 정렬
		System.out.println(numbers[0]);
		int post = numbers[numbers.length - 1 ] * numbers[numbers.length - 2 ];
		int pre = numbers[0 ] * numbers[1];
		
		int answer = 0;

		if(post > pre) {
			answer = post;
		}else {
			answer=pre;
		}
		
		return answer;
	}
}