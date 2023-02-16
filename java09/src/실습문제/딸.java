package 실습문제;

public class 딸 {
	String name;
	String gender;
	static int daddy = 10000;
	static int count; //딸의 총 수

	public static void TV보다() {
		System.out.println("TV를 보다.");
	}
	

	public 딸(String name, String gender) {
		this.name = name;
		this.gender = gender;
		count++;
		daddy = daddy - 1000;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}
