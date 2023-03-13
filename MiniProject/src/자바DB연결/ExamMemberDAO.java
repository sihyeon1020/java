package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.ExamMemberVO;

public class ExamMemberDAO {
	// +++++++++++++++++회원가입+++++++++++++++++++++
	public int insert(ExamMemberVO bag) {

		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "insert into hr.EXAM_MEMBER values (?, ?, ?, ?, ?)"; // sql문 값들 들고오기
			PreparedStatement ps = con.prepareStatement(sql); // sql 실행 역할
			ps.setString(1, bag.getId()); // id
			ps.setString(2, bag.getPw()); // pw
			ps.setString(3, bag.getName()); // name
			ps.setString(4, bag.getTel()); // tel
			ps.setString(5, bag.getRrn()); // rrn

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // insert,delete,update 구문에서 반영된 레코드의 건수를 반환
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 되었습니다.");
			}

			// System.out.println(result);
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}// insert

	// +++++++++++++++++로그인+++++++++++++++++++++
	public int login(ExamMemberVO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select * from hr.EXAM_MEMBER where id = ? and pw = ? "; // sql문 값들 들고오기
			PreparedStatement ps = con.prepareStatement(sql); // sql 실행 역할
			ps.setString(1, bag.getId()); // id
			ps.setString(2, bag.getPw()); // pw

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("검색결과 있음 ");
				result = 1;
			}

			ps.close();
			con.close();
			rs.close();
			// System.out.println(result);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return result;
	}// login

	// +++++++++++++++++중복체크+++++++++++++++++++++
	public int check(ExamMemberVO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select * from hr.EXAM_MEMBER where id = ?"; // sql문 값들 들고오기
			PreparedStatement ps = con.prepareStatement(sql); // sql 실행 역할
			ps.setString(1, bag.getId()); // id

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("중복 아이디임");
				result = 1;
			}

			ps.close();
			con.close();
			rs.close();
			// System.out.println(result);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return result;

	} //id check
	
	// +++++++++++++++++회원정보 수정+++++++++++++++++++++
	public int update(ExamMemberVO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. 오라클 연결 성공.");

			String sql = "update hr.EXAM_MEMBER set pw = ? and hr.EXAM_MEMBER set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getPw());
			ps.setString(2, bag.getTel());
			ps.setString(3, bag.getId());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

			if (result == 1) {
				System.out.println("수정 성공!");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}//회원정보 수정
}
