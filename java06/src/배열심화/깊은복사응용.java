package 배열심화;

public class 깊은복사응용 {
	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] 학기1성적 = { 44, 66, 22, 99, 100 };
		int[] 학기2성적 = 학기1성적.clone(); // (깊은복사)

		System.out.println(학기1성적 == 학기2성적); // 주소 비교 (깊은복사)
		학기2성적[0] = 22;
		학기2성적[2] = 88;

		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기1성적[i] + "");
		}

		System.out.println();

		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + "");
		}

		System.out.println("--------------------------");
		
		// 1) 1학기, 2학기 성적 중 동일한 성적 과목수
		int count = 0;
		int upcount = 0;
		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				count++;
			} else if (학기1성적[i] < 학기2성적[i]) { // 2) 1학기, 2학기 성적 중 오른 과목수
				upcount++;
				System.out.println("2학기 성적이 오른 과목은 " + 과목명[i]);
			}
		} // for

		System.out.println("1학기,2학기 동일 성적 과목수 : " + count);
		System.out.println("2학기 성적이 오른 과목 수 : " + upcount);

		// 3) 1학기, 2학기 성적 중 오른 과목명
	}
}
