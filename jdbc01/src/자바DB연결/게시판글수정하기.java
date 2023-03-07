package 자바DB연결;

import java.util.Scanner;

public class 게시판글수정하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no/content 순으로 글을 쓰세요");
		
		//int no = sc.nextInt(); //"10" -> 10
		String no = sc.next();
		String CONTENT = sc.next();
		
		
		BbsDAO dao = new BbsDAO();
		dao.update(no, CONTENT);
		
	}
}
