package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check
 */
@WebServlet("/check.do")
public class Check extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Check 서블릿 객체가 하나 만들어진다.");
	}
	
	@Override
	public void destroy() {
		System.out.println("Check 서블릿 소멸됨.");
	}
	
	// get요청, 클라이언트로 부터 전달되는 데이터는 주소와 함께 도착
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String today = request.getParameter("today");
		String result = "그냥 있자";
		
		if (today.equals("맑음")) {
			result="날씨가 맑다. 나가자!";
		} else if (today.equals("흐림")){
			result="날씨가 흐리다. 코딩하자";
		} else if (today.equals("비옴")) {
			result="비온다. 쇼핑하자";
		}
		out.print(result);
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");	
		
		PrintWriter out = response.getWriter();
		String pass = request.getParameter("pass");
		String result = "나가세요. <img src='no.png'>";
		
		if (pass.equals("나는왕이다")) {
			result=("들어오세요 <img src='yes.png'>");
		}
		out.print(result);
		out.close();
	}

}
