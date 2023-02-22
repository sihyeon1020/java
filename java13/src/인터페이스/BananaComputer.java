package 인터페이스;

public class BananaComputer implements ComputerInterface{

	@Override
	public void 속도를측정하다() {
		System.out.println("속도가 느리다.");
		
	}

	@Override
	public void 포맷을하다() {
		System.out.println("포맷을 하지 않았다.");
		
	}

	@Override
	public void 사용을하다() {
		System.out.println("디자인 프로그램을 사용하다.");
		
	}
	
}
