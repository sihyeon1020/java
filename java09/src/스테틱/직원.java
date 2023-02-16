package 스테틱;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count; // 총 인원수
	static int sum;

	//객체생성하지 않고 클래스 이름으로 바로 접근해서 아무때나 원할 때 평균을 구하고 싶다.
	//static 메서드로 만들어주세요. 
	public static void getAvg() {
		//static 메서드에서 전역변수를 접근할 때는
		//같은 성격을 가진 static 변수만 접근이 가능!
		
		//System.out.println(name);
		System.out.println(sum / count);
	}

	public 직원(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		sum += age;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
