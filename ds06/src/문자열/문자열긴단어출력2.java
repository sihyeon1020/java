package 문자열;

public class 문자열긴단어출력2 {
	public static void main(String[] args) {
		String t = "my favorite fruit is watermelon"; 
		
		String[] t2 = t.split(" ");
		
		int max = t2[0].length();
		String maxString = t2[0];
		
		for (String x : t2) {
			if(x.length() > max) {
				max = x.length();
				maxString = x;
			}
		}
		
		System.out.println(maxString);
		
	}
}
