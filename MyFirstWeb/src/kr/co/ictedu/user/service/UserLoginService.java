package kr.co.ictedu.user.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

// 인터페이스 구현하기
public class UserLoginService implements IUserService {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = null;
		session = request.getSession();
		String idSession= (String)session.getAttribute("s_id");
		if (idSession != null) {
			try {
				// 서비스 내부에 포워딩 시키면 리다이렉트가 아니기때문에 실행됨
				String ui = "/boardselect.do";
				RequestDispatcher dp = request.getRequestDispatcher(ui);
				dp.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 폼에서 날린 데이터 받기
		String uId=request.getParameter("uId");
		String uPw=request.getParameter("uPw");
		// 세션쓰는법
		session=request.getSession();
		
		// VO 생성 및 데이터 입력
		UsersVO user=new UsersVO();
		user.setUid(uId);
		user.setUpw(uPw);
		// 받은 데이터 넣어서 dao호출
		UsersDAO dao = UsersDAO.getInstance();
		int resultCode = dao.usersLogin(user);
		
		if(resultCode==1) {
		
		// 통과시 세션발급을 해주기
		session.setAttribute("i_s",uId);
		session.setAttribute("p_s",uPw);
		}else if(resultCode==0) {
			session.setAttribute("login", "fail");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
