package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제_기본3 {
	public static void main(String[] args) {

		// 3. String s1="참좋다", String s2 ="진짜좋다" 두 문자열이 동일한지 프린트, s1 s2 글자수를 비교하여 누가 더 큰지 프린트
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		System.out.println(s1.equals(s2));
		int n1 = s1.length();
		int n2 = s2.length();
		if (n1>n2) {
			System.out.println("s1이 더 크다.");
		} else {
			System.out.println("s2가 더 크다.");
		}

		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//4. String s3="나는 진짜 java programmer가 되었어"에서 "java programmer"만 추출하여 모두 대문자로 변경후 프린트
		String s3="나는 진짜 java programmer가 되었어";
		String result = s3.substring(6, 21);
		System.out.println(result);
		System.out.println(result.toUpperCase());
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//5. String s4="2056521"에서 2를 추출하여 1인 경우 남자, 2인 경우 여자로 프린트
		String s4="2056521";
		char result2 = s4.charAt(0);
		if (result2 == '2') {
			System.out.println("여자임");
		 } else {
			 System.out.println("남자임");
		 }
		
	}
}
