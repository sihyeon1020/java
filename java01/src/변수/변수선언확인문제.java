package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		int age = 30;
		double eye = 0.6;
		char gender = '여';
		boolean food = true;
		
		//기본데이타 X ==> 너무 많이 쓰기 때문에 기본형처럼 쓸 수 있는 유일한 기본형 데이터
		String name = "홍길동"; //여러글자를 쓸 때는 ""
		//스트링, 실, 문자열
		
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 시력은 " + eye);
		System.out.println("나의 성별은 " + gender);
		System.out.println("나는 밥을 먹었다 " + food);
	}

}
