package com.multi.mvc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//테이블 하나당 DAO하나! ==> CUD를 완성!! 
@Component
public class BbsDAO {
	
	//mybatis 싱글톤 객체 찾아서 주소를 넣어주세요!
	@Autowired
	SqlSessionTemplate my;

//	public ArrayList<BbsVO> list() {
//
//		return list;
//
//	}
//
//	
//	public BbsVO one(int no) {
//
//		return bag;
//
//	}
//
//	public void delete(int no) {
//
//	}
//
//	public void update(BbsVO bag) {
//
//	}

	// public void add2() {
	public int insert(BbsVO bag) {
		int result = my.insert("bbs.bbscreate",bag);
		return result;
	}
}
