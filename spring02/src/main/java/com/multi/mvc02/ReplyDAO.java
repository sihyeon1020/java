package com.multi.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Component;

//테이블 하나당 DAO하나! ==> CUD를 완성!! 
@Component
public class ReplyDAO {

	public ArrayList<ReplyVO> list(int bbsno) {
		ResultSet rs = null; // 항목명 + 결과 데이터를 담고 있는 테이블

		ArrayList<ReplyVO> list = new ArrayList<>();

		ReplyVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			//댓글은 특정 하나의 게시물에 대한 리스트이므로 
			//특정 게시물을 가지고 댓글 리스트를 가지고 와야 함.
			String sql = "select * from  reply where bbsno =? "; //★
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, bbsno);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색결과가 있으면,
				// System.out.println("검색결과 있음. 성공.");
				int no2 = rs.getInt(1);
				int bbsno2 = rs.getInt(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				// 4. list에 bag을 추가해주자.
				bag = new ReplyVO();
				bag.setNo(no2);
				bag.setBbsno(bbsno2);
				bag.setContent(content);
				bag.setWriter(writer);
				
				list.add(bag);
			}
			// System.out.println(result);
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 XXXXX!
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함.
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? null
		return list;

	}

	

	// public void add2() {
		public void insert(ReplyVO bag) {
			try {
				// 1.오라클 11g와 연결한 부품 설정
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("1.mySQL과 자바 연결할 부품 설정 성공.");
				Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

				// 2.오라클 11g에 연결해보자.(java --- oracle)
				// String url = "jdbc:mysql://localhost:3306/multi";
				String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
				String user = "root";
				String password = "1234";
				Connection con = DriverManager.getConnection(url, user, password); // Connection
				// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
				System.out.println("2. mySQL 연결 성공.");

				String sql = "insert into reply(bbsno, content, writer) values (?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
				ps.setInt(1, bag.getBbsno());
				ps.setString(2, bag.getContent());
				ps.setString(3, bag.getWriter());
				System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

				ps.executeUpdate();
				System.out.println("4. SQL문 오라클로 보내기 성공.");

				// System.out.println(result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}