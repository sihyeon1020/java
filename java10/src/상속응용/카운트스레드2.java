package 상속응용;

public class 카운트스레드2 extends Thread{
	@Override
	public void run() {
		for (int i = 60; i >= 0; i--) {
			System.out.println("한정 이미지 다운로드 카운트 시간 : " + i);
			
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김");
			}
		}
		
	}
}
