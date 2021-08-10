package kr.co.ictedu.board.model;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

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
	public ArrayList<BoardVO> getBoardList() {
		// 내부에서 사용할 변수 선언
		ArrayList<BoardVO> boardList = new ArrayList<>();
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
			
			if(rs.next()){
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

}
