package kr.co.ictedu.board.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.naming.*;
import javax.sql.DataSource;

public class BoardDAO {

	// 싱글턴 패턴과 커넥션풀을 적용하여
	// DAO의 연결부(생성자, getInstance())까지 작성해주세요
	private static BoardDAO dao = new BoardDAO();

	private DataSource ds;

	private BoardDAO() {

		try {
			Context ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static BoardDAO getInstance() {
		if (dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}

	// write 시작
	public int write(BoardVO board) {
		// Connection , preparedStatement 객체 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode;
		// 구문 작성시 bId는 auto_increment가 붙어서 입력안해도 된다.
		// bName,bTitle,bContent는 폼에서 날려준걸 넣는다
		// bDate는 자동으로 현재 서버시간을 입력함
		// bHit는 자동으로 0을 입력함
		String sql = "INSERT INTO jspboard(bname,btitle,bcontent,bdate,bhit) " + "VALUES(?,?,?,now(),0)";

		try {
			// 커넥션 생성및 pstmt에 쿼리문을 넣고 완성시켜서 실행까지하고
			// close()로 메모리 회수까지 하기
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getbName());
			pstmt.setString(2, board.getbTitle());
			pstmt.setString(3, board.getbContent());

			pstmt.executeUpdate();
			resultCode = 1;

		} catch (Exception e) {
			e.printStackTrace();
			resultCode = 0;
		} finally {
			try {
				// con 닫기
				if (con != null && !con.isClosed()) {
					con.close();
				}
				// pstmt 닫기
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	} // write 끝

	// 모든게시글의 정보를 DB로부터 얻어올 메서드
	public List<BoardVO> getBoardList() {
		// 내부에서 사용할 변수 선언
		List<BoardVO> boardList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// SQL문 작성
		String sql = "SELECT * FROM jspboard ORDER BY bId DESC";

		try {
			// 커넥션 연결후 DB에 쿼리 쏴주시고
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			// boardList에 DB내 모든글 저장
			while (rs.next()) {
				BoardVO board = new BoardVO();
				board.setbId(rs.getInt("bid"));
				board.setbName(rs.getString("bname"));
				board.setbTitle(rs.getString("btitle"));
				board.setbContent(rs.getString("bcontent"));
				board.setbDate(rs.getTimestamp("bdate"));
				board.setbHit(rs.getInt("bhit"));

				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if (rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return boardList;
	}// end getBoardList

	public BoardVO getBoardDetail(String bId) {
		// bId에 해당하는 글정보를 가져와서 리턴하도록 로직을 작성해주기
		BoardVO board = new BoardVO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM jspboard WHERE bId=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				board.setbId(rs.getInt("bid"));
				board.setbName(rs.getString("bname"));
				board.setbTitle(rs.getString("btitle"));
				board.setbContent(rs.getString("bcontent"));
				board.setbDate(rs.getTimestamp("bdate"));
				board.setbHit(rs.getInt("bhit"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if (rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return board;
	}// end getdetail

	// 글삭제 로직

	public int deleteBoard(String bId) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int re;

		String sql = "DELETE FROM jspboard WHERE bid=?";

		try {

			con = ds.getConnection();

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bId);

			pstmt.executeUpdate();
			return re = 1;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return re = 0;
	} // delete end

	// 글 수정 로직
	public int updateBoard(BoardVO board) {
		// Connection , preparedStatement 객체 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultCode;
		// 구문 작성시 bId는 auto_increment가 붙어서 입력안해도 된다.
		// bName,bTitle,bContent는 폼에서 날려준걸 넣는다
		// bDate는 자동으로 현재 서버시간을 입력함
		// bHit는 자동으로 0을 입력함
		String sql = "UPDATE jspboard " + "SET bname=?,btitle=?,bcontent=?,bdate=?,bhit=? WHERE bId=?";

		try {
			// 커넥션 생성및 pstmt에 쿼리문을 넣고 완성시켜서 실행까지하고
			// close()로 메모리 회수까지 하기
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getbName()); // 연습으로 넣은거임 원래는 수정할 필요없어서 없어도됨
			pstmt.setString(2, board.getbTitle());
			pstmt.setString(3, board.getbContent());
			pstmt.setTimestamp(4, board.getbDate()); // 연습으로 넣은 거 원래 필요없다
			pstmt.setInt(5, board.getbHit()); // 이하동문 수정할필요가 없엇으니
			pstmt.setInt(6, board.getbId());

			pstmt.executeUpdate();
			resultCode = 1;

		} catch (Exception e) {
			e.printStackTrace();
			resultCode = 0;
		} finally {
			try {
				// con 닫기
				if (con != null && !con.isClosed()) {
					con.close();
				}
				// pstmt 닫기
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	} // update 끝

	// 글 조회수를 상승시키는 메서드
	public void upHit(String bId) {
		// 필요한 변수들을 생성해 주세요
		Connection con = null;
		PreparedStatement pstmt = null;
		// 특정 글의 조회수를 1올리는 쿼리문
		String sql = "UPDATE jspboard SET bHit = bHit + 1 WHERE bId=?";
		// DB연결 후 코드를 실행해 주세요
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bId);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// con 닫기
				if (con != null && !con.isClosed()) {
					con.close();
				}
				// pstmt 닫기
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // end upHit

	// 페이지 번호에 맞는 게시물 가져오기 BoardVO 는 글 한개를 의미함
	// SELECT 햇을때의 보이row1개의 정보임
	public List<BoardVO> getPageList(int pageNum) {
		// 내부에서 사용할 변수 선언
		List<BoardVO> boardList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 쿼리문 (SELECT 구문 , 역순, 10개씩 pageNum에 맞춰서
		String sql = "SELECT * FROM jspboard  ORDER BY bId DESC LIMIT ? , 10";
		try{
			// 연결구문 작성
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, pageNum);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO board = new BoardVO();

				board.setbId(rs.getInt("bid"));
				board.setbName(rs.getString("bname"));
				board.setbTitle(rs.getString("btitle"));
				board.setbContent(rs.getString("bcontent"));
				board.setbDate(rs.getTimestamp("bdate"));
				board.setbHit(rs.getInt("bhit"));

				boardList.add(board);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {// con 닫기
				if (con != null && !con.isClosed()) {
					con.close();
				}
				// pstmt 닫기
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return boardList;
	}// end getPageList
	
	public int getBoardCount(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		int countNum=0;
		String sql = "SELECT COUNT(*) FROM jspboard";
		try{
			// 연결구문 작성
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				countNum=rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {// con 닫기
				if (con != null && !con.isClosed()) {
					con.close();
				}
				// pstmt 닫기
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return countNum;
	}// end getBoardCount
	}
	
