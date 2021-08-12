package kr.co.ictedu.board.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardDetailService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
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
		// url에 묻어온 글 번호를 getParameter를 이용해 얻습니다.
		String bId=(String)request.getParameter("bId");	
		
		// DAO를 생성합니다.
		BoardDAO dao = BoardDAO.getInstance();

		// 먼저 조회수를 올리고 가져와야 최신 조회수를 표시 할 수 있다.
		dao.upHit(bId);
		
		// DAO에 글 번호를 넘겨서 detail페이지 데이터를 얻어옵니다.
		BoardVO board =dao.getBoardDetail(bId);
		System.out.println("페이지 조회전 upHit 실행 : " + board);
		
		// 포워딩을 위해 setAttribute()로 데이터를 실어 줍니다.
		request.setAttribute("board", board);
	}// "board"는 ${board.bDate} 의 board임

}
