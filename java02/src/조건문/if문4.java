package 조건문;

import java.util.Date;

public class if문4 {

	public static void main(String[] args) {
		//Date - 년월일시분초, java.util.Date
		Date date = new Date();
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		System.out.println(date.getYear() + 1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		
		System.out.println(date.getDay());//요일. 0부터 시작, 일요일!
		
		int hour = date.getHours();
		
	
		
		//int hour = 15;
		
		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 14) {
			System.out.println("굿애프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
		
		
		int month = date.getMonth();
		//int month = 2;
		switch (month) {
		case 3: case 4: case 5: //여러개의 조건을 넣을 수 있음,도중에 브레이크가 없어서
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11: 
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
		
	}

}
