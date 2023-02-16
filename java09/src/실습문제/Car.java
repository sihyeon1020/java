package 실습문제;

public class Car{
	String color;
	
	public void run() {
		System.out.println("차가 달린다.");
	}
	
	public void move() {
		System.out.println("차가 이동하다.");		
	}

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
	
	
}
