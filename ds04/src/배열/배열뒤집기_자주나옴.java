package 배열;

import java.util.*;

public class 배열뒤집기_자주나옴 {

	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5};
		Solution2 sol = new Solution2();
		int[] answer = sol.solution(num_list);
		System.out.println(Arrays.toString(answer));
	}

}

	class Solution2 {
	    public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length];
	        //수도코드(모의코드)
	        //1.반복문을 이용해서
	        //2.num_list 에서 0부터 하나씩 꺼내주고 --> i변수 이용
	        //3. answer배열의 뒤에서부터 하나씩 넣어준다 --> 뒤에서부터 카운트 해줄 별도의 변수가 필요! --> j변수 이용
	        //-->j변수의 시작은 맨뒤에서부터 시작을 해야함 --> num_list.length - 1
	        // { 1,2,3,4,5} ==> {5,4,3,2,1}
	        int j = num_list.length - 1; //마지막 index부터 시작
	        for(int i = 0; i < num_list.length; i++) {
	        	answer[j] = num_list[i];
	        	j--;
	        }
	        return answer;
	    }
	}