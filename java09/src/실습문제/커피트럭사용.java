package 실습문제;

public class 커피트럭사용 {
	public static void main(String[] args) {
		CoffeeTruck co = new CoffeeTruck();
		co.color = "브라운";
		co.price = 2500;
		co.weight = 1;
		co.carry();
		co.move();
		co.run();
		co.sell();
	}
}
