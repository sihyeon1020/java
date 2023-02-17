package 상속기본;

public class 볼펜Main {
	public static void main(String[] args) {
		볼펜 pen = new 볼펜();
		pen.가격 = 1800;
		pen.두께 = 1;
		pen.회사 = "모나미";
		pen.글을쓰다();
		pen.사다();
		
		System.out.println(pen);
	}
}
