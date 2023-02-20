package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 콜렉션확인문제 {
	public static void main(String[] args) {
		//1.중복제거문제 ==> set
		HashSet travel = new HashSet();
		travel.add("스페인");
		travel.add("일본");
		travel.add("이탈리아");
		travel.add("홍콩");
		travel.add("괌");
		System.out.println("1. 가고 싶은 여행지:  " + travel);
		
		System.out.println("===============================================");
		
		//2. 키+값으로 쌍으로 넣을 때 ==> map
		HashMap product = new HashMap();
		product.put("안방", "TV");
		product.put("거실", "쇼파");
		product.put("부엌", "냉장고");
		product.put("현관", "신발");
		System.out.println("2-1." + product);
		System.out.println("2-2.현관에는 무엇이 있나요?: " + product.get("현관"));
		product.put("거실", "책상");
		System.out.println("2-3." + product);
		
		System.out.println("===============================================");
		
		//3. 할 일 우선순서(순위) ===> list
		ArrayList list = new ArrayList();
		list.add("수업듣기");
		list.add("가게보기");
		list.add("고양이 간식주기");
		list.add("복습하기");
		list.add("산책하기");
		System.out.println("3-1: " + list);
		System.out.println("3-2: " + list.get(0));
		System.out.println("3-2: " + list.get(list.size()-1));//이 코드가 list.get(4)보다 좋음
		list.set(1, "청소하기");
		System.out.println("3-3: " + list);
		
		
	}
}
