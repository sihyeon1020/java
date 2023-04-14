package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String에서Char배열에옮기기4 {
	public static void main(String[] args) {
		String sno = "2056521";

		String[]  stringArray = sno.split("");
	
		//배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
		Arrays.fill(stringArray, 0, 3,  "hoho");
		//System.out.println(Arrays.toString(stringArray));
		print(stringArray);
		
		
		//배열의 순서를 다 뒤집어라.
		Arrays.sort(stringArray); //정렬
		//Arrays로 내림차순을 할 수는 있으나 너무 복잡
		//==>컬렉션으로 변환해서 하면 더 간단
		//System.out.println(Arrays.toString(stringArray));
		print(stringArray); //아래에 함수를 추가해서 쓰면 더 편리하다 
		
		List<String> list = Arrays.asList(stringArray); // list collection으로 변경
		Collections.sort(list); //정렬(오름차순)
		Collections.reverse(list);//정렬(내림차순
		System.out.println(list);
		
		//배열안에 데이터의 빈도수(횟수) 구하는 방법(함수)
		int count3 = Collections.frequency(list, "hoho"); //list안에 hoho의 횟수 넣는 중 
		System.out.println(count3);
	}

	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}
}
