package 인터페이스;

public class 컴퓨터사용 {
	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		BananaComputer banana = new BananaComputer();
		apple.사용을하다();
		apple.속도를측정하다();
		apple.포맷을하다();
		banana.사용을하다();
		banana.속도를측정하다();
		banana.포맷을하다();
	}
}
