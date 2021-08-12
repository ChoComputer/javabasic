package kr.co.ictedu.board.service;

import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardUpdateService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 세션쓰는법
		HttpSession session = null;
		session = request.getSession();
		String idSession = (String) session.getAttribute("i_s");
		if (idSession == null) {
			try {
				// 서비스 내부에 포워딩 시키면 리다이렉트가 아니기때문에 실행됨
				String ui = "/users/user_login.jsp";
				RequestDispatcher dp = request.getRequestDispatcher(ui);
				dp.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

		// 1. 파라미터 6개 받아오기
		response.setCharacterEncoding("utf-8");

		String bId = (String) request.getParameter("bId");
		String bName = (String) request.getParameter("bName");
		String bTitle = (String) request.getParameter("bTitle");
		String bContent = (String) request.getParameter("bContent");
		String bDate = (String) request.getParameter("bDate");
		String bHit = (String) request.getParameter("bHit");

		// 2. VO 생성해서 세터로 저장하기
		BoardVO board = new BoardVO();

		int bid = Integer.parseInt(bId);
		int bhit = Integer.parseInt(bHit);
		Timestamp bdate = Timestamp.valueOf(bDate);

		board.setbId(bid);
		board.setbContent(bContent);
		board.setbDate(bdate);
		board.setbHit(bhit);
		board.setbName(bName);
		board.setbTitle(bTitle);

		// 3. DAO 생성 및 update 로직 호출 ( update로직은 직접 작성하기)
		BoardDAO dao = BoardDAO.getInstance();
		dao.updateBoard(board);
	}

}
