package com.multi.mvc02;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@RequestMapping("movie")
	public void movie(MovieVO vo, Model model) {
		System.out.println(vo);
		model.addAttribute("vo",vo);
	}
	
	@RequestMapping("fruit")
	public void fruit( Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("오렌지");
		list.add("딸기");
		list.add("메론");
		list.add("참외");
		list.add("복숭아");
		list.add("포도");
		model.addAttribute("list",list);
	}
	
	@RequestMapping("tour")
	public void tour(Model model) {
	//	model.addAttribute("vo",vo);
		ArrayList<String> list = new ArrayList<String>();
		list.add("일본");
		list.add("스페인");
		list.add("영국");
		list.add("호주");
		list.add("발리");
		model.addAttribute("list",list);
	}
	
	
}
