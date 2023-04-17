package 문자열;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		String answer = "";
		int findIndex = 0 ;
		
		for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				findIndex = 1 ;
			}
		}
		answer = "김서방은 " + findIndex + "에 있다.";
		System.out.println(answer);
	}
}

