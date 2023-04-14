package 문자열;

public class 문자열포함인덱스테스트 {
	 public static void main(String[] args) {
		String s = "aaabbccadda";
		System.out.println(s.contains("a"));
		System.out.println(s.contains("aaa"));
		System.out.println(s.contains("bc"));
		
		System.out.println(s.indexOf("a")); //a가 많지만 첫번째 위치의 a를 가지고 옴
		System.out.println(s.lastIndexOf("a")); //a가 들어가있는 마지막 위치 
		System.out.println(s.lastIndexOf("a",3)); // index 2위치에서 제일 마지막 위치 0~2
		System.out.println(s.lastIndexOf("a",8)); // index 8위치에서 제일 마지막 위치 0~7
		System.out.println(s.indexOf("f")); //없는 것의 index를 찾을 때 -1이 리턴된다
		
	}
}
