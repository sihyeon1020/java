package 문자열;

public class 함수만들기연습2 {
	
	public static void 세수하다() {
		System.out.println("세수1)세수하기");
		System.out.println("세수2)양치하기");
	}
	
	public static void 밥먹다(String food){
		System.out.println(food + "을 밥먹기" );
	}
	
	public static void 운동하다(String exer) {
		System.out.println( exer + "에서 운동하기");
	}
	
	public static void 잠자다(String sleep) {
		System.out.println(sleep + "을 자다");
	}
	
	public static void 화장하다() {
		System.out.println("화장1)스킨로션 바르기");
		System.out.println("화장2)화장하기");
	}
	
	
	public static void main(String[] args) {
		//내가 일어나서 하는 일
		//1. 세수하기
		세수하다();
		//2. 밥먹기(아침)
		밥먹다("아침밥");
		//3. 운동하기(운동장)
		운동하다("운동장");
		//4. 잠자기(낮잠)
		잠자다("낮잠");
		//5. 밥먹기(점심)
		밥먹다("점심밥");
		//6. 세수하기(외출준비)
		세수하다();
		//7. 화장하기
		화장하다();
		//8. 밥먹기(저녁)
		밥먹다("저녁밥");
		//9.  운동하기(공원)
		운동하다("공원");
		//10. 잠자기(저녁)
		잠자다("밤잠");
	}
}
