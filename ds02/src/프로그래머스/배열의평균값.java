package 프로그래머스;
import java.util.Scanner;

public class 배열의평균값 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double answer = sol.solution(numbers); //int
		System.out.println(answer);
	}
}

class Solution5 {
    public double solution(int[] numbers) {
    	System.out.println(numbers.length);
    	int size = numbers.length;
    	int sum = 0 ;
    	for (int x : numbers) {
			sum = sum + x;
		}
    	//System.out.println((double)sum/size);
        double answer = ((double)sum/size);//가능
        double answer2 = (double)(sum/size);//불가능
        
        //자바에서는 int, int 계산의 결과는 무조건 int
        //					   하나라도 실수(double, float)이면 무조건 실수
        return answer;
    }
}
