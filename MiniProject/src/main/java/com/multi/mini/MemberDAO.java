package com.multi.mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class MemberDAO {
		
	@Autowired
	SqlSessionTemplate my;
	
	//회원가입
	public int insert(MemberVO bag) {
		int result = my.insert("member.create",bag);
		return result;
	}
	
	//로그인
	public int login(MemberVO bag) {
		int result = 0; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			String url = "jdbc:mysql://localhost:3306/popcorn?serverTimezone=UTC";
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
			
			if (rs.next()) {
				System.out.println("검색결과 있음 성공!");
				result = 1;
			}
			System.out.println("검색 결과 없음.");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
