package 배열복습;

public class 이차원배열프린트2 {
	public static void main(String[] args) {
		String[][] s = {
				{"빨강","주황","노랑"},
				{"연두","초록","하늘"},
				{"파랑","감청","보라"}
		}; // 전체를 프린트
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}
}
