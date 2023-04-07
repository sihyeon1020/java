package com.multi.mvc700;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MovieController {
	
	@Autowired
	MovieDAO dao;

	@RequestMapping("insert")
	public void insert(MovieVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MovieVO bag) {
		System.out.println("update 요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(int id) {
		System.out.println("delete 요청됨.");
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(int id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MovieVO bag  = dao.one(id);
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("list")
	public void list(Model model) {
		List<MovieVO> list = dao.list();
		model.addAttribute("list",list);
	}
	
}
