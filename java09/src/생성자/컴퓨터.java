package 생성자;

public class 컴퓨터 {
	int price; //가격
	String offic; //회사
	int size; //크기
	
	
	public 컴퓨터(int price, String offic, int size) {
		this.price = price;
		this.offic = offic;
		this.size = size;
	}


	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", offic=" + offic + ", size=" + size + "]";
	}
	
	

}
