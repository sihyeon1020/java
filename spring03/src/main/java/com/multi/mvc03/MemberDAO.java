package com.multi.mvc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//import 화면 DB연결.MemberVO;
//스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게! 라고 설정해야함
//2가지 방법을 할 수 있음
//어노테이션(표시)방법, XML방법

@Component // 1)싱글톤 만들기
public class MemberDAO {
	
	//mybatis 싱글톤 객체 찾아서 주소를 넣어주세요!
	@Autowired
	SqlSessionTemplate my;
	
//특정한 방법으로 실행하는 클래스 (model, 방법)
//	
//	public ArrayList<MemberVO> list() {
//		
//
//		return list;
//	}
//	
//	public int login(MemberVO bag) {
//	
//		return result;
//	}
//
//	public MemberVO one(String id) {
//
//
//		return bag;
//	}
//
public int delete(String id) {
	int result = my.delete("member.del",id);
	return result;
}

	
	public int update(MemberVO bag) {
	int result = my.update("member.up",bag);
		return result;
	}

	
	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		//												namespace.id
		return result;
	}

	public MemberVO one(String id) {
		MemberVO bag = my.selectOne("member.one", id);
		return bag;
	}
	



}