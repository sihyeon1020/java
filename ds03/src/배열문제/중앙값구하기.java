package 배열문제;
import java.util.*;

public class 중앙값구하기 {
	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17};
		//배열에 들어간 하나의 값  : element
		//홀수개
		String s2 = Arrays.toString(s);
		System.out.println(s2);
		//가운데 값 구하는 방법
		//배열의 길이 3 / 2 = 1
		//                  	5 / 2 = 2
		
		//1.정렬을 먼저 하기
		Arrays.sort(s); //파괴!
		System.out.println(Arrays.toString(s));
		//2. 중앙위치를 구하기
		int center = s.length / 2;
		//3. 배열의 중앙위치값을 get
		int answer = s[center];
		System.out.println(answer);
	}
}
