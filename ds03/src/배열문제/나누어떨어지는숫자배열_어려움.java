package 배열문제;

import java.util.*;

public class 나누어떨어지는숫자배열_어려움 {

	public static void main(String[] args) {
		int[] arr = { 1, 9, 7, 8 };
		int divisor = 5;
		Solution5 sol = new Solution5();
		int[] answer = sol.solution(arr, divisor);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution5 {
	public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        //수도코드(가짜코드)
        //1. 결과를 넣을 수 있는 list를 만들어준다.
        //2. 반복문 이용해서 배열에 있는 것 하나씩 꺼내기
        //3. divisor로 나누었을 때 나머지가 없는지 체크해서 
        //     나머지가 없으면 list에 모으자
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] % divisor == 0 ) {
				list.add(arr[i]);
			}
		}
        
        System.out.println(list.size() + " " + list);
        int[] answer;
        	if (list.size() != 0) {
				answer = new int[list.size()];
				//int 값 list를 배열에 자동으로 넣어주는 함수 xxx! 
				for (int i = 0; i < list.size(); i++) {
					//배열 <--list.get(i)
					answer[i] = list.get(i);
					//{5,0} <--[5,10]
					//{5,10} <--[5,10]
				} 
				Arrays.sort(answer);
			} else {
				answer = new int[1];
				answer[0] = -1;
			}
		return answer;
    }
}