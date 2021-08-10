package kr.co.ictedu.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardListService implements IBoardService  {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 접속하자 마자 바로 전체 데이터만 들고오면 됨
		// 바로 DAO부터 생성
		BoardDAO dao =BoardDAO.getInstance();
		//전체리스트 가져오기
		ArrayList<BoardVO> boardList=dao.getBoardList();
		System.out.println(boardList);
		// 받아온 리스트를 .jsp에 전달하기
		// requset에 데이터를 실어놔야 합니다.
		// request.setAttribute("명칭",데이터);
		request.setAttribute("boardList", boardList);
	}

}
