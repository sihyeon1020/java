package 상속응용;

public class 동시프로그램실행2 {
	public static void main(String[] args) {
		스레드1 t1 = new 스레드1();
		스레드2 t2 = new 스레드2();
		스레드3 t3 = new 스레드3();
		
		t1.start();
		t2.start();
		t3.start();
	}
}
