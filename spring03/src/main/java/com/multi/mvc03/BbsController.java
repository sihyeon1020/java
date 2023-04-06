package com.multi.mvc03;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {

	//@Autowired
	//ReplyDAO dao2;
	
	@Autowired
	BbsDAO dao;

	@RequestMapping("insert2")
	public void insert(BbsVO bag, BbsDAO dao) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		dao.insert(bag);
	}
	
	//bbs 수정
	@RequestMapping("update2.multi")
	public void update(BbsVO bag, BbsDAO dao) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
	//	dao.update(bag);
	}
	
	//bbs 삭제
	@RequestMapping("delete2.multi")
	public void delete(int no, BbsDAO dao) {
		System.out.println("delete요청됨.");
		System.out.println(no);
	//	dao.delete(no);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
	//	BbsVO bag = dao.one(no);
		//검색결과가 있는지 프린트!
		//System.out.println(bag);
		
	//	ArrayList<ReplyVO> list = dao2.list(no);
	//	model.addAttribute("list", list);

	//	model.addAttribute("bag", bag);
	}
	
	//json 연습
//	@RequestMapping("one22")
//	@ResponseBody//views로 넘어가지않고, return 값인 bag 데이터를 json으로 만들어서 클라이언트로 전송
	//클라이언트 브라우저에는 success:function(x)
	//결과가 함수의 입력변수의 x로 쏙 들어간다.
	//public BbsVO one22(int no) {
	//	System.out.println("one요청됨.");
	//	System.out.println(no);
	//	BbsVO bag = dao.one(no);
		//검색결과가 있는지 프린트!
	//	System.out.println(bag);
	//	return bag;
//	}
	
	@RequestMapping("list2")
	public void list(Model model) {
	//	ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size()); //사이즈를 찍어보세요.
	//	model.addAttribute("list", list);
	}
	
	
	//ajax -  bbs 리스트 가지고 오기
	@RequestMapping("list5")
	public void list5(Model model) {
	//	ArrayList<BbsVO> list = dao.list();
	//	System.out.println(list.size()); //사이즈를 찍어보세요.
	//	model.addAttribute("list", list);
	}
	
	//json 연습
//	@RequestMapping("list55")
//	@ResponseBody
//	public ArrayList<BbsVO> list55() {
	//	ArrayList<BbsVO> list = dao.list();
	//	System.out.println(list.size()); //사이즈를 찍어보세요.
	//	return list;
//	}
	
	
	@RequestMapping("one6")
	public void one6(int no, Model model) {
		System.out.println("one요청됨.");
	//	BbsVO bag = dao.one(no);
	//	model.addAttribute("bag", bag);
	}
	

	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	

	
}