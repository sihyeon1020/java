package com.multi.mvc400;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;


//import 화면 DB연결.MemberVO;
//스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게! 라고 설정해야함
//2가지 방법을 할 수 있음
//어노테이션(표시)방법, XML방법

@Component // 1)싱글톤 만들기
public class MemberDAO {
//특정한 방법으로 실행하는 클래스 (model, 방법)
	public int login(MemberVO bag) {
		int result = 0; // 항목명이랑 결과를 담고 있는 테이블이다.
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// 2. 오라클 11g에 연결해보자. JAVA ------ Oracle
			// String url = "jdbc:mysql://localhost:3306:multi";
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. mySQL 연결 성공.");
			
			String sql = "select * from member where id=? and pw=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			ResultSet rs = ps.executeQuery();
			
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			if (rs.next()) { // 검색결과가 있으면 TRUE 없으면 false
				System.out.println("검색결과 있음 성공!");
				result = 1;
			}
			System.out.println("검색 결과 없음.");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public MemberVO one(String id) {

		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형) 주소가 들어가있다.
		// 참조형 변수를 초기화 할 때는 null(주소가 없다라는 의미)

		MemberVO bag = null;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from member where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			// con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색 결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				System.out.println("검색결과 있음 성공.");
				String id2 = rs.getString(1); // id
				String pw = rs.getString(2); // pw
				String name = rs.getString(3); // name
				String tel = rs.getString(4); // tel
				// 검색 결과를 검색화면 ui부분을 주어야 함.
				// 1.가방을 만듭시다.
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

		// return id, pw, name, tel은 xxxx
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 한다.
		// 검색 결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색 결과가 없을 때는 bag에 무엇이 들어있나? ==> null
		return bag;
	}

	public int delete(String id) {

		int result = 0; // 결과값 저장하는 변수 만들어주기

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "delete from member where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
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
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "update member set tel = ? where id = ? ";
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
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into member values (?, ?, ?, ?)";
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

	
	
	public ArrayList<MemberVO> list() {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요!
		// ArrayList
		ArrayList<MemberVO> list = new ArrayList<>();

		MemberVO bag = null;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from member"; // row 정보 다 들고 올 거니까 조건 없음
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색 결과가 있는지 여부는 rs.next()
				// 여러정보를 받을 거라 반복문 while로 변경
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1.검색 결과가 있으면
				// System.out.println("검색 결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 꺼내오자.
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				// System.out.println(id2 + " " + pw + " " + name + " " + tel);

				// 검색 결과를 검색화면 ui부분을 주어야 함.
				// 3.가방을 만듭시다.
				bag = new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);

				// 4.list에 bag을 추가하자.
				list.add(bag);

				// ps.close();
				// rs.close();
				// con.close();
			}

			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}


}