package 배열응용;

public class 여러개배열사용하기2 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 }; // 1학기 성적
		int[] term2 = { 99, 100, 88, 80, 70 }; // 2학기 성적

		int count = 0; // 2학기 성적이 오른 값
		int count2 = 0; // 1,2학기 성적과 동일한 값

		// 1. 2학기 성적이 오른 학생은 몇명?
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			} else if (term1[i] == term2[i]) {
				count2++;
			}
		} // for

		System.out.println("2학기 성적이 오른 학생은 몇명 ? >> " + count + "명");
		// 2. 1학기, 2학기 성적이 동일한 학생은 몇명?
		System.out.println("1,2학기 성적이 동일한 학생은 몇명 ? >> " + count2 + "명");

		// 3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는 ?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 성적이 100점인 학생은? >> " + i + "번 " + names[i]);
			}
		}

		// 4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요?
		int sum1 = 0; // 1학기 성적 합
		int sum2 = 0; // 2학기 성적 합

		for (int i = 0; i < term2.length; i++) {
			sum1 += term1[i];
			sum2 += term2[i];
		}

// 			값이 나오지만 for each 는 하나밖에 값을 못 낸다.	
//			for (int x : term2) {
//				sum1 += x;
//			}
//			
//			for (int x2 : term2) {
//				sum2 += x2;
//			}

		double avg1 = (double) sum1 / term1.length;// 1학기 평균 값
		double avg2 = (double) sum2 / term2.length;// 2학기 평균 값

		if (avg1 < avg2) {
			System.out.println("2학기 평균이 더 높았습니다.");
		} else if (avg1 > avg2) {
			System.out.println("1학기 평균이 더 높았습니다.");
		} else {
			System.out.println("1, 2학기 평균이 동일합니다.");
		}

		// 5. 심화) 뉴진스의 1학기 성적, 2학기 성적은? ★다시보기
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 번호는 " + i);
				System.out.println("뉴진스의 1학기 성적은 " + term1[i]);
				System.out.println("뉴진스의 2학기 성적은 " + term2[i]);
			}
		} // for

	}
}
