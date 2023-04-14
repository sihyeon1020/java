package 문자열;

public class String에서Char배열에옮기기 {
	public static void main(String[] args) {
		String s = "s205621"; //String도 index를 이용해서 추출할 수 있음
		char c = s.charAt(0);
		String answer = "개발부서가 아닙니다.";
		if(c == 's') {
			answer = "개발 부서 입니다.";
		}
		System.out.println(answer);
	}
}
