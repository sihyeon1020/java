package 화면DB연결;

import javax.swing.JOptionPane;

import 자바DB연결.ExamMemberDAO;

public class test {
	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디입력");
		String pw = JOptionPane.showInputDialog("비번입력");
		
		ExamMemberDAO dao = new ExamMemberDAO();
		
		//1.가방만들기
		ExamMemberVO bag = new ExamMemberVO();
		
		//2.가방에 값 넣기
		bag.setId(id);
		bag.setPw(pw);
		
		int result = dao.login(bag);
		if (result == 0) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
	}
}
