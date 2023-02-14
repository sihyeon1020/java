package 부품사용하기;

import 부품만들기.고양이;

public class 고양이사용하기 {
	public static void main(String[] args) {
		//고양이 클래스를 이용하여 2마리 만들어보기
		고양이 cat1 = new 고양이();
		cat1.weight = 5;
		cat1.type = "아메리칸숏헤어";
		cat1.먹다();
		System.out.println("cat1의 몸무게: " + cat1.weight );
		System.out.println("cat1의 종: " + cat1.type );
		
		System.out.println();
		
		고양이 cat2 = new 고양이();
		cat2.weight = 5;
		cat2.type = "샴";
		cat2.놀다();
		System.out.println("cat2의 몸무게 : " + cat2.weight);
		System.out.println("cat2의 종 : " + cat2.type);
	}
}
