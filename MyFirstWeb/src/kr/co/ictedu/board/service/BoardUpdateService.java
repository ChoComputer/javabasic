package kr.co.ictedu.board.service;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;


public class BoardUpdateService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		// 1. 파라미터 6개 받아오기
		response.setCharacterEncoding("utf-8");
		
		
		String bId=(String)request.getParameter("bId");
		String bName=(String)request.getParameter("bName");
		String bTitle=(String)request.getParameter("bTitle");
		String bContent=(String)request.getParameter("bContent");
		String bDate=(String)request.getParameter("bDate");
		String bHit=(String)request.getParameter("bHit");
		
		
		// 2. VO 생성해서 세터로 저장하기
		BoardVO board = new BoardVO(); 

		int bid=Integer.parseInt(bId);
		int bhit=Integer.parseInt(bHit);
		Timestamp bdate=Timestamp.valueOf(bDate);
		
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
