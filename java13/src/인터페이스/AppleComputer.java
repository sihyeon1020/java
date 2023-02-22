package 인터페이스;

public class AppleComputer implements ComputerInterface{

	@Override
	public void 속도를측정하다() {
		System.out.println("속도가 빠르다.");
		
	}

	@Override
	public void 포맷을하다() {
		System.out.println("포맷을 했다.");
		
	}

	@Override
	public void 사용을하다() {
		System.out.println("개발 프로그램을 사용하다.");
		
	}
	
}
