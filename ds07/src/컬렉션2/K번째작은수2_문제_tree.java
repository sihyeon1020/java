package 컬렉션2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째작은수2_문제_tree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // k번째 작은 수
		TreeSet<Integer> tree = new TreeSet<Integer>();

		while (true) {
			int data = sc.nextInt();
			if (data == 0) {
				break;
			} else {
				tree.add(data);
			}
		}
		System.out.println(tree);
		
		Object[] arr = tree.toArray(); //배열로 바꿔주기
		System.out.println("1번째 작은 수: " + arr[0]);
		System.out.println("2번째 작은 수: " +arr[1]);
		System.out.println(k + "번째 작은 수: " + arr[k - 1]);

	}
}
