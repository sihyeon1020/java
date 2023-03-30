package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;
	
	@RequestMapping("insert3.multi")
	public void insert(BookVO bag) {
		System.out.println("insert 요청 확인");
		System.out.println(bag);
		dao.insert(bag);
	}
	
	@RequestMapping("delete3.multi")
	public void delete(int id) {
		System.out.println("delete 요청 확인");
		dao.delete(id);
	}
	
	@RequestMapping("update3.multi")
	public void update(BookVO bag) {
		System.out.println("update 요청 확인");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("one3.multi")
	public void one(String id, Model model) {
		System.out.println("one 요청 확인");
		BookVO bag = dao.one(id); //bag에 검색결과가 들어있을 것이다.
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("list3")
	public void list(Model model) {
		ArrayList<BookVO> list = dao.list();
		model.addAttribute("list",list);
	}
	
}
