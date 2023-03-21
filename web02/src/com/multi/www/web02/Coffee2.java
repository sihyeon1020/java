package com.multi.www.web02;

public class Coffee2 {
	int price = 5000; 
	String name = "핸드드립";
	
	public static Coffee2 co2; //null
	
	public static Coffee2 getInstance() {
		if (co2 == null) {
			co2 = new Coffee2();
		}
		return co2;
	}
	
	//더 생성하지 못하게 private로 막아준다.
	private Coffee2() {
	}
	
	
}
