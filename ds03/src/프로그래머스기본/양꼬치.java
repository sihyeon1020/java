package 프로그래머스기본;

public class 양꼬치 {

	public static void main(String[] args) {
		int  n = 10; //양꼬치 주문 수 
		 int k = 3; // 음료수 주문
		Solution2 sol = new Solution2();
		int answer = sol.solution(n , k);
		System.out.println(answer);
	}
}

class Solution2 {
    public int solution(int n, int k) {
    	//10 * 12000 + 3 * 2000 - 1 * 2000 = 124,000원
    	int free = n / 10; // 무료로 주는 음료수 수
    	//64 * 12000 + 6 * 2000 - 6 * 2000 =768,000원
    	int answer = n * 12000 + k * 2000 - free * 2000;
        return answer;
    }
}