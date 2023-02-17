package 상속응용;

public class PC상황표2 {
	public static void main(String[] args) {

		카운트스레드2 count2 = new 카운트스레드2();
		이미지스레드2 img2 = new 이미지스레드2();
		
		count2.start();
		img2.start();
		
	}
}
