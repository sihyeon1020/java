package 배열;

import java.util.*; //Date, Random, Collections, Arrays
//import java.lang.*; 기본적으로 이미 import 되어있는 상황 =>System. Integer, String

public class 배열두배로 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		Solution1 sol = new Solution1();
		int[] answer = sol.solution(numbers);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution1 {
	public int[] solution(int[] numbers) {
		// 답안을 작성해서 집어넣을 배열을 만들었음.
		int[] answer = new int[numbers.length]; // {1,2,3}} ==> {2,4,6}
		// 1. 반복문을 이용해서
		for (int i = 0; i < numbers.length; i++) {
			// 2. numbers 배열 인덱스 0부터 하나씩 꺼내와서
			// 3. 2배로 곱한 후,
			// 4. answer 배열에 같은 위치에 넣어줌
			answer[i] = numbers[i] * 2;
		}

		return answer;
	}
}