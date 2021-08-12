package kr.co.ictedu.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;
import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

// 구현 클래스 이기 때문에 implements를 합니다
public class BoardWriteService implements IBoardService {
	

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// getParameter로 폼에서 쏜 데이터를 들고오게 해주세요.
		try {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String bWriter=request.getParameter("writer");
		String bTitle=request.getParameter("title");
		String bContent=request.getParameter("content");
		//dao생성
		BoardDAO Bdao = BoardDAO.getInstance();
		//VO 생성
		BoardVO board= new BoardVO();
		board.setbName(bWriter);
		board.setbTitle(bTitle);
		board.setbContent(bContent);
		
		int resultCode = Bdao.write(board);
		if(resultCode ==1) {
			System.out.println("DB에 글이 잘입력되엇습니다.");
		}else if(resultCode==0) {
			System.out.println("에러발생으로 글이 입력되지 않았습니다.");
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			// 폼에서 날린 데이터 받기
			String uId=request.getParameter("uId");
			String uPw=request.getParameter("uPw");
			// 세션쓰는법
			HttpSession session=null;
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
