package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10]; // length: 10
		// index는 0부터 시작, 마지막 위치의 index는 length(10)보다 작을 것이다.
		// 0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;

		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}

//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);

		System.out.println();
		// 우리가족의 성별을 char[]로 저장 후 프린트
		char[] gender = { '남', '여', '여', '여' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}

		System.out.println();
		// System.out.println(gender[]);
		// 우리가족의 이름을 String[]로 저장 후 프린트
		String[] name = { "철수", "영희", "영철", "미희" };
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}

		System.out.println();
		// 우리가족의 시력을 double[]로 저장 후 프린트
		double[] eye = { 0.6, 1.5, 0.8, 1.0 };
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}

		System.out.println();
		// 우리가족이 점심을 먹었는지 boolean[]로 저장 후 프린트
		boolean[] lunch = { true, true, false, false };
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
	}

}
