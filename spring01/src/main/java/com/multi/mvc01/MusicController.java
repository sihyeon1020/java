package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicController {
	
	@Autowired
	MusicDAO dao;
	
	@RequestMapping("insert4.multi")
	public void insert(MusicVO bag) {
		dao.insert(bag);
	}
	

	@RequestMapping("delete4.multi")
	public void delete( String id) {
		System.out.println("delete2 요청되었음");
		System.out.println(id);
		dao.delete(id);
	}
	
	
	@RequestMapping("one4.multi")
	public void one(String id,Model model) {
		System.out.println("one4 요청되었음");
		System.out.println(id);
		MusicVO bag = dao.one(id);
		//bag에 검색결과 다 들어있음.
		//views 아래 one.jsp로 쓸 수 있도록 설정해주어야 함
		model.addAttribute("bag",bag);
	}
	
	@RequestMapping("list4")
	public void list(Model model) {
		//Model은 컨트롤러의 list를 view/list.jsp까지만 전달할 수 있는 객체
		 ArrayList<MusicVO> list = dao.list();
		 model.addAttribute("list", list);
	}
}
