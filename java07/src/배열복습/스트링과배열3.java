package 배열복습;

public class 스트링과배열3 {
	public static void main(String[] args) {
		String num = "   011-123-4567  ";
//		1)양쪽 공백을 제거
		String num2 = num.trim();//공백제거
		System.out.println(num2.length());
		
		
//		2)-을 기준으로 분리하기(String[])
		String[] num3 = num2.split("-"); // {"011", "123", "4567"}
		System.out.println(num3[0]);
		System.out.println(num3[1]);
		System.out.println(num3[2]);
		
		
//		3)첫번째 문자열이 011이면 sk, 019이면 LG, 나머지는 APPLE
		if (num3[0].equals("011")) {
			System.out.println("sk");
		} else if (num3[0].equals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		
		
//		4)두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
		if (num3[1].length() > 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
	
		
//		5)전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유효하지 않은 전화번호
		int total = num3[0].length() + num3[1].length() + num3[2].length(); 
		
		if (total >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		
		//2번째 방법
		int total2 = 0;
		for (int i = 0; i < num3.length; i++) {
			total2 = total2 + num3[i].length();
		}
		System.out.println(total2);
		
		
		
		//3번째방법
		System.out.println(num2);
		String num222 = num2.replace("-","");
		System.out.println(num222);
				
	}
}
