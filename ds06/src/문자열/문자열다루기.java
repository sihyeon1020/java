package 문자열;

import java.util.Arrays;

public class 문자열다루기 {
	public static void main(String[] args) {
		String s = "a234"; //false
		//String s = "1234"; //true
		boolean answer = false;
		
		//0. 4 글자, 혹은 6글자인지 판단해서 맞으면 
		//	   1번 실행
	
		if (s.length() == 4 || s.length() == 6) { //글자수 구하기
			
			//1.글자 하나씩 떨어뜨려라.
			//    for문 돌려서 하나씩 꺼낸 다음
			//    글자하나하나가 0 ~ 9 사이인지 확인
			char[] c = s.toCharArray();
			System.out.println(Arrays.toString(c));
			
			for (char x : c) {
				if(x < '0'  || x > '9') {
					answer	= false;
					break;
				}
			}
		} else { //4글자,6글자가 아닐 때
			answer = true;
		}
		System.out.println(answer);
		System.out.println('A' + 32);
		
		//2. 숫자로 바꾸어서 에러가 생기면
		//    	문자가 포함되어 있음.
	}
}
