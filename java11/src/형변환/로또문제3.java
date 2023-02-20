package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제3 {

	public static void main(String[] args) {
		Random r = new Random(); //중복 제거해서 값이 나옴
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add(r.nextInt(45) + 1); // 0~46
		}
		System.out.println(lotto.size());
		System.out.println(lotto);
	}
}
