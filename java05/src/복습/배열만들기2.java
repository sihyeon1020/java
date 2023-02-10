package 복습;

public class 배열만들기2 {
	public static void main(String[] args) {
		String[] travel = { "일본", "홍콩", "호주", "스위스", "스페인" };
		char[] color = { 'r', 'b', 'p', 's', 'g' };
		double[] height = {181.8, 185.2, 183.4, 181.5, 180.5};
		
		for (int i = 0; i < travel.length; i++) {
			System.out.println("좋아하는 여행지" + i + ": " + travel[i]);
		}
		
		
		for (int i = 0; i < color.length; i++) {
			System.out.println("좋아하는 색깔" + i + ": " + color[i]);
		}
		
		for (int i = 0; i < height.length; i++) {
			System.out.println("좋아하는 연예인 키 " + i + ": " + height[i]);
		}
		
		
		for (String x : travel) {
			System.out.println(x);
		}
		
		
		for (char x : color) {
			System.out.println(x);
		}
		
		
		
		for (double x : height) {
			System.out.println(x);
		}
		
		
	}
}
