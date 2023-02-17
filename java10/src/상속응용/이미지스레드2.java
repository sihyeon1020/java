package 상속응용;

public class 이미지스레드2 extends Thread{
	@Override
	public void run() {
		String[] img = {"01.jpg","02.jpg","03.jpg","04.jpg","05.jpg",
				"06.jpg","07.jpg","08.jpg","09.jpg","10.jpg",
				"11.jpg","12.jpg","13.jpg","14.jpg","15.jpg",
				"15.jpg","16.jpg","17.jpg","18.jpg","18.jpg"};
		
		for (int i = 0; i < img.length; i++) {
			System.out.println("~~~" + img[i] + " 다운로드 중 ~~~");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
