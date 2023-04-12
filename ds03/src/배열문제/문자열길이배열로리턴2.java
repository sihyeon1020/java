package 배열문제;

import java.util.*;

public class 문자열길이배열로리턴2 {

	public static void main(String[] args) {
		String[] strlist = { "I", "Love", "Programmers." };

		Solution4 sol = new Solution4();
		int[] answer = sol.solution(strlist);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution4 {
	public int[] solution(String[] strlist) {
		//{ "I", "Love", "Programmers." };
		
		int[] answer = new int [strlist.length];
		//반복문을 돌면서
		for (int i = 0; i < strlist.length; i++) {
		//하나씩 꺼내온다.
			answer[i] = strlist[i].length(); //"I" String 값을 꺼내오는 것이기 때문에  length() < 함수로 써줘야함 / length X
		}
		return answer;
	}
}