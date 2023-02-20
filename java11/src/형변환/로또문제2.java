package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제2 {

	public static void main(String[] args) {
		Random r = new Random(42); //중복 제거해서 값이 나옴
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; i < 1000; i++) {
			lotto.add(r.nextInt(1000));
		}
		System.out.println(lotto.size());
		System.out.println(1000-lotto.size()); //중복된 숫자 갯수
		System.out.println(lotto);
	}
}
