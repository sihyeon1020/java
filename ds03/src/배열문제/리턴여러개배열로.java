package 배열문제;

import java.util.Arrays;

public class 리턴여러개배열로 {

	public static void main(String[] args) {
		int money = 15000;
		
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(money);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution3 {
	public int[] solution(int money) {
		int[] answer = {0 ,0}; //{ 몇잔, 나머지돈}
		//int[] answer = new int[2];
		int price = 5500;
		answer[0] = money / price;
		answer[1] = money % price ;
		
		
		return answer;
	}
}