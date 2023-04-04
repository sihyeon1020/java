package com.multi.mvc02;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록! dependency
public class MemberController {
	
	@Autowired//3)자동으로 가지고 오기 
	//MemberDAO의 싱글톤 객체  ram의 어디에 있는지 찾아서 그 주소를 아래 변수에 넣어주세요. 
	MemberDAO dao;//전역변수(글로벌 변수) //2)싱글톤 가지고오기 
	
	// 컨트롤 하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보 검색

	@RequestMapping("login")//jsp의 form 값과 동일하면 아래의 메서드를 실행시킨다
	public String login(MemberVO bag, HttpSession session) {
		System.out.println(bag);
		//dao를 이용해서 db처리를 할 예정 
		//views 아래로 넘어가게 되어있다.
		//views 아래 login.jsp를 호출하게 됨
		int result  = dao.login(bag);
		if(result == 1 ) {
			//로그인 성공하면, 세션을 잡아두자
			session.setAttribute("id", bag.getId());//★세션잡아둔것
			return "ok"; //views 아래 파일 이름.jsp 
		} else {
			//views아래가 아니고, webapp아래
			//member.jsp로 가고 싶은 경우!
			return "redirect:member.jsp"; //redirect : 방향을 다시 바꾸다 
		}
	}
	
	
	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버메서드(기능처리 담당)
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼 호출당 하나의 함수 연결!
	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서드가 호출이 될 지를 써주어야한다.
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		// 메서드의 입력변수(파라메터)로 변수를 선언해두면,
		// 컨트롤러의 메서드 내에서는
		// 1) bag을 만들어서
		// 2)클라이언트로부터 전달된 데이터도 다 넣어줌.
		// 3)bag에 데이터 다 넣어줌
		System.out.println("insert요청됨");
		System.out.println(bag);
		System.out.println(dao);
		// dao에게 insert요청!
		dao.insert(bag);
	}

	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨");
		System.out.println(bag);
		dao.update(bag);
	}

	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete  요청됨 ");
		System.out.println(id);
		dao.delete(id);
	}

	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one 요청됨");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		//bag에 검색결과 다 들어있음.
		//views 아래 one.jsp로 쓸 수 있도록 설정해주어야 함
		model.addAttribute("bag",bag);
		//views까지 전달할 속성으로 추가해주세요.
	}
	
	//ajax id 검색 결과 1개 들고오기
	@RequestMapping("one5")
	public void one5(String id, Model model) {
		System.out.println("one 요청됨");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		//bag에 검색결과 다 들어있음.
		//views 아래 one.jsp로 쓸 수 있도록 설정해주어야 함
		model.addAttribute("bag",bag);
		//views까지 전달할 속성으로 추가해주세요.
	}

	@RequestMapping("list")
	public void list(Model model) {
		//Model은 컨트롤러의 list를 view/list.jsp까지만 전달할 수 있는 객체
		 ArrayList<MemberVO> list = dao.list();
		 model.addAttribute("list", list);
	}
}
