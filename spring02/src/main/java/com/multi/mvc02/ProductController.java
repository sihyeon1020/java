package com.multi.mvc02;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO dao;
	
	
	@RequestMapping("list7")
	public void list5(Model model) {
		ArrayList<ProductVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("one7")
	public void one7(String id, Model model) {
		System.out.println("one요청됨.");
		ProductVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
}
