package com.multi.mvc03;

import java.util.ArrayList;
import java.util.List;

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
	
	@RequestMapping("update3.multi")
	public void update(BookVO bag) {
		System.out.println("update 요청 확인");
		System.out.println(bag);
	    dao.update(bag);
	}
	
	@RequestMapping("delete3.multi")
	public void delete(int id) {
		System.out.println("delete 요청 확인");
		System.out.println(id);
	    dao.delete(id);
	}
	
	@RequestMapping("one3.multi")
	public void one(int id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		BookVO bag  = dao.one(id);
		model.addAttribute("bag",bag);
	}

	@RequestMapping("list3")
	public void list(Model model) {
		List<BookVO> list = dao.list();
		model.addAttribute("list",list);
	}
	
	
}
