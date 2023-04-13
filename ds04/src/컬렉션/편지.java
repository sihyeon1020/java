package 컬렉션;

import java.util.*; 

public class 편지 {	
	public static void main(String[] args) {
		String message = "happy birthday!";
		Solution6 sol = new Solution6();
		int answer = sol.solution(message);
		System.out.println(answer);
	}
}

class Solution6 {
	   public int solution(String message) {
	        int answer = 0;
	        System.out.println(message.length());
	        
	        return answer = message.length() * 2;
	    }
}