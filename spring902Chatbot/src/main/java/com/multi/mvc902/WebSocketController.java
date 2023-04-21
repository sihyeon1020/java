package com.multi.mvc902;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController{
	
	@MessageMapping("/chat2") //채팅 내용 받을 때 사용하는 주소
	@SendTo("/topic/messages2") //가입한 주소 브라우저에 return message를 json으로 변환해서 보내줌.
	public OutputMessage2 send2(Message message) { //from : guest, text: 1
		System.out.println("받은 데이터 >> " + message);
		OutputMessage2 out = new OutputMessage2();
		String menu = "";
        switch (message.getText()) {
        case "1":
            menu = "챗 봇>> 1) 판타지      2) 액션          3) 애니메이션";
            break;
        case "11":
            menu = "챗 봇>> 해리포터 , 아바타, 반지의 제왕";
            break;
        case "12":
            menu = "챗 봇>> 존윅, 탑건, 아메리칸 스나이퍼";
            break;
        case "13":
            menu = "챗 봇>>슬램덩크, 엔칸토, 스즈메의 문단속";
            break;
        case "2":
            menu = "챗 봇>> 21) 국내   22) 일본  23)미국  24)유럽  25)아시아";
            break;
        case "21":
            menu = "챗 봇>> 리바운드 , 한산 , 킬링 로맨스";
            break;
        case "22":
            menu = "챗 봇>> 하울의 움직이는 성, 나는 내일 어제의 너와 만난다, 썸머 필름을 타고";
            break;
        case "23":
            menu = "챗 봇>> 토르:러브 앤 썬더 , 인셉션 , 분노의 질주:라이드 오어 다이";
            break;
        case "24":
            menu = "챗 봇>> 이미테이션 게임, 이니세린의 밴시, 시네마 천국";
            break;
        case "25":
            menu = "챗 봇>> 세 얼간이, 반교, 나의 소녀시대, 엽문";
            break;
        case "3":
            menu = "챗 봇>> 31) 회원정보 조회   32) 회원정보 수정  33)회원 탈퇴";
            break;
        case "31":
            menu = "챗 봇>> 회원정보 조회 페이지로 이동";
            break;
        case "32":
            menu = "챗 봇>> 회원정보 수정 페이지로 이동";
            break;
        case "33":
            menu = "챗 봇>>  회원정보 탈퇴 페이지로 이동";
            break;
            
        default:
            menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
            break;
        }
		out.setMenu(menu);
		return out;
	}
	
	@MessageMapping("/chat") //채팅 내용 받을 때 사용하는 주소
	@SendTo("/topic/messages") //가입한 주소 브라우저에 return message를 json으로 변환해서 보내줌.
	public OutputMessage send(Message message) {
		System.out.println("받은 데이터 >> " + message);
		OutputMessage out = new OutputMessage();
		out.setFrom(message.getFrom());
		out.setText(message.getText());
		Date date = new Date();
		out.setTime(date.getHours() + ":" + date.getMinutes());
		return out;
	}	
}