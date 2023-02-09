package 배열;

public class 배열기본확인문제 {

	public static void main(String[] args) {

		// 1. int 크기 5인 배열을 생성
		int[] basic = new int[5]; //전체 만들어지는 변수의 개수는 7개

		// 2. 배열 크기를 프린트
		System.out.println("배열 크기 : " + basic.length); //배열의 크기,길이,사이즈

		// 3. 배열의 첫번째 위치에 100 넣어서 프린트
		basic[0] = 100;
		System.out.println("첫번째 위치 : " + basic[0]);

		// 4. 배열의 마지막 위치에 500 넣어서 프린트
		basic[4] = 500;
		System.out.println("마지막 위치 : " + basic[4]);

		// 5. 배열의 3번째 위치에 200 넣어서 프린트
		basic[2] = 200;
		System.out.println("세번째 위치 : " + basic[2]);

		// 6. 배열의 전체 데이터를 프린트
		for (int i = 0; i < basic.length; i++) {
			System.out.print(basic[i] + " ");
		}
		
		System.out.println();
		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트 
		// i가 인덱스니까 같이 값을 찍으면 됨
		for (int i = 0; i < basic.length; i++) {
			System.out.print(i + ": " + basic[i] + " ");
		}
		
		// 8. 그림으로 그려보세요.
		
		
		
	}
}
