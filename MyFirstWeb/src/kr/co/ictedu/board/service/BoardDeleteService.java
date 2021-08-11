package kr.co.ictedu.board.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	}

}
