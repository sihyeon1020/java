package 배열문제;

import java.util.*;
public class 좌표위치구하기 {

	public static void main(String[] args) {
		int[] dot = {-3,-2};
		Solution2 sol = new Solution2();
		int answer = sol.solution(dot);
		System.out.println(answer);
	}
}

class Solution2{
	 public int solution(int[] dot) {
		 // {3,2} ==> dot[0] -> x, dot[1] -> y
	        int answer = 0; //몇사분면?
	        if(dot[0] > 0  && dot[1] > 0) {
	        	answer=1;
	        }else if(dot[0] < 0 && dot[1] > 0) {
	        	answer = 2;
	        } else if (dot[0] < 0 && dot[1]<0) {
	        	answer = 3;
	        } else {
	        	answer = 4;
	        }
	        return answer;
	    }
}