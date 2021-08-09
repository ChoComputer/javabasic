package kr.co.ictedu;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletBasic2
 */
@WebServlet("/mango")
public class ServletBasic2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBasic2() {
        super();
        System.out.println("망고 생성");
        // TODO Auto-generated constructor stub
    }
    public void destroy() {
		// 소멸자 메서드 , 서블릿 객체가 메모리에서 삭제될 떄 호출(소멸시 1회만)
		System.out.println("망고 소멸");
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("망고 시작");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("post방식으로만 접속할수 있습니다.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet,dopost 시리즈는 해당 메서드 내부에서
		// 파라미터로 선언한 request, response 내장 객체를 기본으로 쓸수있고,
		// 추가로 내부에 세션이나 쿠키등을 선언해서 쓸 수도 있습니다.
		// HttpSession session; 세션도 사용가능
		
		// 폼에서 넘겨준 데이터 UTF-8로 인코딩
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		// request.getParameter를 이용해 폼에서 날린 데이터 받기
		//폼에서 날려준 데이터 콘솔에 찍기
		System.out.println("이름 : " +request.getParameter("id"));
		System.out.println("비번 : " +request.getParameter("pw"));
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
