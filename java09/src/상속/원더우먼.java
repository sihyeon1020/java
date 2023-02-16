package 상속;

public class 원더우먼 extends 우먼{

	public void skill() {
		System.out.println("이름은 " + name);
		System.out.println("빔을 쏘다.");
	}



	
	@Override
	public String toString() {
		return "원더우먼 [mind=" + mind + ", name=" + name + ", age=" + age + "]";
	}
	

	
}
