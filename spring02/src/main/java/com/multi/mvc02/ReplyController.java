package com.multi.mvc02;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {

	@Autowired
	ReplyDAO dao; //100번 주소
	

	
	@RequestMapping("insert4")
	public void insert(ReplyVO vo) {
		System.out.println(vo);
		dao.insert(vo);
	}
	
	
	//ajax - 해당 bbs번호의 리플 가지고 오기
	@RequestMapping("list6")
	public void list6(int bbsno, Model model) {
		System.out.println(bbsno);
		ArrayList<ReplyVO> list = dao.list(bbsno);
		model.addAttribute("list", list);
	}
	

}