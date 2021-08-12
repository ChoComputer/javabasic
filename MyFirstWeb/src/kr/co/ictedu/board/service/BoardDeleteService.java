package kr.co.ictedu.board.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardDeleteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// url에 묻어온 글 번호를 getParameter를 이용해 얻습니다.
		String bId = (String) request.getParameter("bId"); // hidden의 "bId"를 받아줌 디테일페이지에서의
		System.out.println(bId);
		// DAO를 생성합니다.
		BoardDAO dao = BoardDAO.getInstance();
		 dao.deleteBoard(bId);
		// 세션쓰는법
			HttpSession session=null;
			session=request.getSession();
			String idSession=(String)session.getAttribute("i_s");
			if(idSession==null) {
				try {
					// 서비스 내부에 포워딩 시키면 리다이렉트가 아니기때문에 실행됨
					String ui="/users/user_login.jsp";
					RequestDispatcher dp = request.getRequestDispatcher(ui);
					dp.forward(request, response);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
	}

}
