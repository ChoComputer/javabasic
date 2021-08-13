package kr.co.ictedu.board.service;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;
import kr.co.ictedu.user.model.BoardPageDTO;

public class BoardPagingService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
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
				// page 파라미터에 있던값 가져오기
				// hint : ?page=페이지번호
				// page 파라미터가 없다면 strPage에 null이 저장됨
				String strPage=request.getParameter("page");
				// null이 저장된 상황에서는 int로 바꿀수가 없다.
				// 파라미터가 없을때 들어갈 기본페이지는 1페이지임
				int page =1;
				if (strPage!=null) {
					page=Integer.parseInt(strPage);
				}
				//DAO 생성
				BoardDAO Bdao =BoardDAO.getInstance();
				// 현재 보고 있는 페이지 전체글 가져오기
				// 페이지를 그냥 넘기지 않고, 시작번호를 계산하여 넘김
				List<BoardVO> boardList=Bdao.getPageList((page-1)*10);  // 다오에서 처리하거나 서비스에서 처리하거나
				System.out.println("페이징 글들 : "+ boardList);
				
				// 얻어온 글 전체 갯수와 현재 조회중인 page 정보를 DTO에 넘겨줌 
				int countNum=Bdao.getBoardCount();
				System.out.println("글전체 갯수 : "+ countNum);
				
				// DTO의 역활은 페이지 하단에 링크 만들 정보를 계산 하는것
				BoardPageDTO pageDTO = new BoardPageDTO(countNum, page, boardList);// BoardPageDTO에 넣는거
				System.out.println("링크버튼 정보: "+pageDTO);
				
				// 포워딩하기위해 적재
				request.setAttribute("boardList", boardList);
				request.setAttribute("pageDTO", pageDTO);
	}

}
