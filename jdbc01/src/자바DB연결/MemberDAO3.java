package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.MemberVO;

public class MemberDAO3 {
	
	//로그인 화면 연동시키기 StartUI
	public MemberVO login(String id, String pw) {

		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		//기본형 정수/실수/문자/논리만 값으로 초기화
		//나머지 데이터형(참조형) 주소가 들어가있다.
		//참조형 변수를 초기화 할 때는 null(주소가 없다라는 의미)

		MemberVO bag = null;
		
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

			String sql = "select * from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			ps.setString(2, pw);
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); //select문 전송시 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { //검색 결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("로그인 성공.");
				String id2 = rs.getString(1); //id
				String pw2 = rs.getString(2); //pw
		
				System.out.println(id2 + " " + pw2);
				//검색 결과를 검색화면 ui부분을 주어야 함.
				//1.가방을 만듭시다.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw2);

			} else {
				System.out.println("로그인 실패.");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//return id, pw, name, tel은 xxxx
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 한다.
		//검색 결과가 있을 때는 bag에 데이터가 들어있음.
		//검색 결과가 없을 때는 bag에 무엇이 들어있나? ==> null
		return bag;
	}
	
	public MemberVO one(String id) {

		ResultSet rs = null; //항목명 + 결과 데이터를 담고 있는 테이블 
		//기본형 정수/실수/문자/논리만 값으로 초기화
		//나머지 데이터형(참조형) 주소가 들어가있다.
		//참조형 변수를 초기화 할 때는 null(주소가 없다라는 의미)

		MemberVO bag = null;
		
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

			String sql = "select * from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); //select문 전송시 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { //검색 결과가 있는지 여부는 rs.next()
				//true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음 성공.");
				String id2 = rs.getString(1); //id
				String pw = rs.getString(2); //pw
				String name = rs.getString(3); //name
				String tel = rs.getString(4); //tel
				System.out.println(id2 + " " + pw + " " + name + " " + tel);
				//검색 결과를 검색화면 ui부분을 주어야 함.
				//1.가방을 만듭시다.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setName(name);
				bag.setPw(pw);
				bag.setTel(tel);
			} else {
				System.out.println("검색결과 없음 실패.");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//return id, pw, name, tel은 xxxx
		//return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 한다.
		//검색 결과가 있을 때는 bag에 데이터가 들어있음.
		//검색 결과가 없을 때는 bag에 무엇이 들어있나? ==> null
		return bag;
	}
	
	

	public int delete(MemberVO bag) {

		int result = 0; // 결과값 저장하는 변수 만들어주기

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

			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getId());
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) { // 조건에 따라서는 여러개가 될 수 있어서 >= 도 생각
				System.out.println("탈퇴 성공.");
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public int update(MemberVO bag) {
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

			String sql = "update hr.MEMBER set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());

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
	}

	// public void add2() {
	public int insert(MemberVO bag) {

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

			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// R빼고, 인덱스 0부터 시작!!
			// 유일하게 db는 인덱스가 1부터 시작!!
			// 2. 가방에서 값들을 하나씩 꺼내쓰세요.
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}

			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라 판단
			// catch가 실행
			// 실행된 Row수가 없으므로 result에 0을 넣어주자!
			// result = 0;

			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

}