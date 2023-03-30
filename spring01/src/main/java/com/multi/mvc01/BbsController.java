package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	@Autowired
	BbsDAO dao;

	@RequestMapping("insert2.multi")
	public void insert( BbsVO bag) {
		System.out.println("insert2 요청되었음");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete( int no) {
		System.out.println("delete2 요청되었음");
		System.out.println(no);
		dao.delete(no);
	}
	
	@RequestMapping("update2.multi")
	public void update( BbsVO bag) {
		System.out.println("update2 요청되었음");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one2 요청되었음");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		//bag에 검색결과 다 들어있음.
		//views 아래 one.jsp로 쓸 수 있도록 설정해주어야 함
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("list2")
	public void list(Model model) {
		//Model은 컨트롤러의 list를 view/list.jsp까지만 전달할 수 있는 객체
		 ArrayList<BbsVO> list = dao.list();
		 model.addAttribute("list", list);
	}

}
