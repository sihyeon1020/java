package com.multi.mini;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	

	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession session) {
		System.out.println(bag);
		int result  = dao.login(bag);
		if(result == 1 ) {
			//로그인 성공하면, 세션을 잡아두자
			session.setAttribute("id", bag.getId());//★세션잡아둔것
			return "redirect:mypage.jsp"; //views 아래 파일 이름.jsp 
		} else {

			return "redirect:member.jsp"; //redirect : 방향을 다시 바꾸다 
		}
	}
	
	
}
