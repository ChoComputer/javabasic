package kr.co.ictedu.user.model;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/// 지금 보시면 import를 javax.naming이 아닌 context로 하고 이썽서 그렇습니다.
//다시 제대로 import했으니 돌려보세요 넵


//DAO클래스는 DB연동을 전담해 처리합니다.
public class UsersDAO {
	
	// DB주소 아이디 패스워드 미리 저장
	
	// 일반 DAO 상요시 사용하는것
//	private static final String URL = 
//						"jdbc:mysql://localhost/ict03";
//	private static final String DBID = "root";
//	private static final String DBPW = "mysql";
//	커넥트 풀로 인해 위에 주소 저장 필요없음
	
	// 커넥트 풀 성정 후 사용하는것
	// javax.sql의 DataSource를 임포트 해주세요
	private DataSource ds;
	
	// 메서드 결과에 따른 리턴값 상수로 표기
	private static final int ID_DELETE_SUCCESS = 1;
	private static final int ID_DELETE_FAIL = 0;

	private static final int ID_LOGIN_SUCCESS = 1;
	private static final int ID_LOGIN_FAIL = 0;
	private static final int ID_UPDATE_SUCCESS=1;
	private static final int ID_UPDATE_FAIL=0;
	
	
	/*
	 * DAO 클래스는 하나의 객체만으로도 DB연동을 수행할 수 있기 때문에
	 * 메모리 관리 차원에서 클래스의 객체를 단 1개만 생성하도록
	 * 싱글톤 패턴을 적용하여 클래스를 디자인합니다.
	 */
	
	// 싱글톤 패턴 클래스 디자인 방법
	// 1. 외부에서 객체를 new 키워드로 만들어 쓸 수 없도록 생성자에
	// private을 붙여줍니다. JDBC
	private UsersDAO() {
		// 일반 JDBC에서 활용하던 드라이버 설정 코드
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	try {	
		Context ct = new InitialContext();
		ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	// 2. 외부에서 객체생성을 못 하기 때문에 자기 클래스 내부에서 그냥
	// 스스로 자기 자신을 1개 생성합니다.
	private static UsersDAO dao = new UsersDAO();
	
	// 3. 외부에서 객체 생성이 필요할 때 public 선언으로 처리한
	// getter를 이용해 2에서 만든 객체를 리턴만 해줍니다.
	// 이러면 UsersDAO는 참조형 변수이기 때문에 주소값만 전달합니다.
	public static UsersDAO getInstance() {
		return dao;
	}
	
	// 회원가입을 처리하는 메서드 선언
	// DB에 들어가는 데이터, 혹은 DB에서 출력되어 나오는 데이터
	// 모두가 UsersVO 내부 자료 형식을 벗어날 수 없으므로
	// 대다수 입출력은 전부 VO를 매개로 진행합니다.
	public int joinUsers(UsersVO user) {
		// users_join.jsp에서 가져온 코드를 이곳에 붙여넣기를 합니다
		//DB연동을 위한 Connector 설정
		// Connection 객체 생성
		Connection con = null;
		// 쿼리문 실행을 위한 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;
		try{
			
			// 접속 주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다.
			// JDBC기준 DB접속 코드
//			con = DriverManager.getConnection(URL, DBID, DBPW);
			
			// 커넥션 풀 기준 DB 접속코드
			con = ds.getConnection();
			
			// 1. INSERT 쿼리문을 작성합니다.
			String sql = "INSERT INTO users VALUES(?, ?, ?, ?)";
			
			// 2. 만든 쿼리문의 ? 자리에 적용할 자바 변수를 집어넣습니다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getUpw());
			pstmt.setString(3, user.getUname());
			pstmt.setString(4, user.getEmail());
			
			// 3. 만든 쿼리문 실행하기
			pstmt.executeUpdate();
			
		} catch(SQLException e){
			System.out.println("에러 : " + e);
		} finally {
			try {
				// con 닫기
				if(con!=null && !con.isClosed()){
					con.close();
				}
				// pstmt 닫기
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return 1;
	}// end joinUser
	
			
			
	// usersDelete
	// 원래 대다수 DAO는 UsersVO 하나로 모든 처리를 해결할 수 있습니다.
	// 다만 삭제로직은 폼에서 날린 비밀번호와 원래 DB에 저장되어있던 비밀번호를
	// 비교해야 하기 때문에 폼에서 날린 비밀번호를 추가로 입력받습니다.
	public int usersDelete(UsersVO user, String dpw) {
		// Connection 객체 생성
		Connection con = null;
		// 쿼리문 실행을 위한 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;
		
		try{
			// UsersVO에 입력된 비밀번호와 폼에서 날린 dpw를 비교
			if(user.getUpw().equals(dpw)) {
				// 접속 주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다.
//				con = DriverManager.getConnection(URL, DBID, DBPW);
				con = ds.getConnection();
				// 1. DELETE 쿼리문을 작성합니다.
				String sql = "DELETE FROM users WHERE uid=?";
				
				// 2. 만든 쿼리문의 ? 자리에 적용할 자바 변수를 집어넣습니다.
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getUid());
				
				// 3. 만든 쿼리문 실행하기
				pstmt.executeUpdate();
				
				// DAO내부적으로 session, response 등 내장 객체에 대한
				// 처리를 할 수 없으므로, 결과 정보만 리턴
				return ID_DELETE_SUCCESS;
			} else {
				//비밀번호를 틀리게 입력한 경우
				return ID_DELETE_FAIL;
			}
			
		} catch(SQLException e){
			System.out.println("에러 : " + e);
		} finally {
			try {
				// con 닫기
				if(con!=null && !con.isClosed()){
					con.close();
				}
				// pstmt 닫기
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		// 상단 try블럭 내에서 로직이 처리가 안 되어서 여기까지 코드가
		// 도달 했다는 자체로 이미 뭔가 실행이 누락되었다는 이야기이므로
		// 0을 리턴
		return ID_DELETE_FAIL;
	}// end usersDelete	
	
	// user로그인 로직
	public int usersLogin(UsersVO user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// DB연결로직을 집어넣어주세요.
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();
			// 1. SELECT 쿼리문을 작성합니다.
			// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문을 작성해주세요.
			String sql = "SELECT * FROM users WHERE uid=?";
			
			// 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
	
			// 3. 쿼리문 실행 및 데이터 받아오기.
			rs = pstmt.executeQuery();
			
			// rs.next()를 통해 DB데이터가 들어왔는지 안 들어왔는지 확인
			if(rs.next()){
			
				// 들어왔다면 DB쪽 데이터 받기
				String dbId = rs.getString("uid");
				String dbPw = rs.getString("upw");
			
				// 사용자가 보내준 user
				if(user.getUid().equals(dbId) && 
					user.getUpw().equals(dbPw)){
						return ID_LOGIN_SUCCESS;
				} else {
						// 로그인 실패
						return ID_LOGIN_FAIL;
				}
			}else{
				// 로그인 실패
				return ID_LOGIN_FAIL;
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		} finally{
			// 연결 끊기
			try {
				if(con!=null && !con.isClosed()){
					con.close();
				}
				if(pstmt!=null && !pstmt.isClosed()){
					pstmt.close();
				}
				if(rs!=null && !rs.isClosed()){
					rs.close();
				}
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		return ID_LOGIN_FAIL;
	}// usersLogin END

	
	// getUserInfo 메서드
	// 수정 로직을 사용하기 전에 수정할 타겟 아이디의 정보를 얻어오기 위해
	// 사용하는 메서드로 아이디, 비밀번호, 이름, 이메일을 UsersVO에 넣어서
	// 리턴합니다.
	public UsersVO getUserInfo(UsersVO user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 비어있는 UsersVO도 같이 선언
		UsersVO resultData = new UsersVO();
		
		// DB연결로직을 집어넣어주세요.
		try{
//			con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();
			// 1. SELECT 쿼리문을 작성합니다.
			// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문을 작성해주세요.
			String sql = "SELECT * FROM users WHERE uid=?";
			// 2. 쿼리문의 ?자리에 적용할 변수를 집어넣습니다.
			// DB연결 후 입력받은 user의 .getUid()를 이용해 조회구문 완성
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			// 3. 쿼리문 실행 및 데이터 받아오기.
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				// 이후 ResultSet에 담겨있는 자료를 다시 다 꺼내서
				// 새로 선언한 UsersVO 변수에 입력해준 후
				resultData.setUid(rs.getString("uid"));
				resultData.setUpw(rs.getString("upw"));
				resultData.setUname(rs.getString("uname"));
				resultData.setEmail(rs.getString("email"));
			}
			System.out.println("DB내부 세팅 데이터 : " + resultData);
		} catch (SQLException e){
			e.printStackTrace();
		} finally{
			// 연결 끊기
			try {
				if(con!=null && !con.isClosed()){
					con.close();
				}
				if(pstmt!=null && !pstmt.isClosed()){
					pstmt.close();
				}
				if(rs!=null && !rs.isClosed()){
					rs.close();
				}
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		// ResultSet에 있던 자료를 입력받은 UsersVO를 리턴
		return resultData;		
	}//end getUserInfo
	
	
	// usersUpdate
	// 회원정보 수정시 실행될 메서드
	public int usersUpdate(UsersVO user) {
		//DB연동을 위한 Connector 설정
		// Connection 객체 생성
		Connection con = null;
		// 쿼리문 실행을 위한 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;
		
		try{
			
			// 접속 주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다.
//			con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();
			// 1. INSERT 쿼리문을 작성합니다.
			String sql = "UPDATE users SET upw=?, uname=?, email=? WHERE uid=?";
			
			// 2. 만든 쿼리문의 ? 자리에 적용할 자바 변수를 집어넣습니다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUpw());
			pstmt.setString(2, user.getUname());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getUid());
			//왼쪽 물음표부터 1, 2, 3, 4 입력해주셔야 합니다.
			// pw = pw(1)
			// name = name(2)
			// email = email(3)
			// uid = uid(4)
			// 숫자 잘못넣어서 실수함 숫자 중요!!! 생각 치도 못함 디버깅 중요
			
			// 3. 만든 쿼리문 실행하기
			pstmt.executeUpdate();
			
			return ID_UPDATE_SUCCESS;
			
		} catch(SQLException e){
			System.out.println("에러 : " + e);
		} finally {
			try {
				// con 닫기
				if(con!=null && !con.isClosed()){
					con.close();
				}
				// pstmt 닫기
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
				}
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return ID_UPDATE_FAIL;
	}// end usersUpdate
	
	//전체데이터를 다가져오는getAllUser()
	// 파라미터 불필요(조건없이 전체 가져올거임)
	// UsersVO 1개는 SELECT구문의 row 한 줄을 의미합니다.
	// 전체 데이터는 회원가입 상황에 따라 유동적이므로
	// 길이를 정해놓고 로직을 짜면 안된다.
	public ArrayList<UsersVO> getAllUser() {// getAllUser(UserVO user) 로 선언했엇음
		// 350번 라인에 usersvO 필요없는데 선언하셔서 파라미터 불일치로 호출 안되던겁니다.
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 비어있는 ArrayList<UsersVO>도 같이 선언
		ArrayList<UsersVO> userList=new ArrayList<>();
		
		// DB연결로직을 집어넣어주세요.
		try{
//			con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();
			// 1. SELECT 쿼리문을 작성합니다.
			// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문을 작성해주세요.
			String sql = "SELECT * FROM users" ;
			
			pstmt = con.prepareStatement(sql);
			
			// 3. 쿼리문 실행 및 데이터 받아오기.
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				// ArrayList에 넣어줄 빈 UsersVO생성
				UsersVO user =new UsersVO();
				// ResultSet 에 든 컬럼별 값을 꺼냅니다.
					String uid= rs.getString("uid");
					String upw= rs.getString("upw");
					String uname= rs.getString("uname");
					String email= rs.getString("email");
					
					//UsersVO에 !!!setter!!!로 저장       !! setter에 대해 다시보기
					user.setUid(uid);// 여기; 문자열로 저장하시면 원 데이터가 안들어갑니다.
					user.setUpw(upw);//uid라는 변수, upw라는 변수
					user.setUname(uname);// uname이라는 변수, email이라는 변수에
					user.setEmail(email);// 저장된값을 세터로 넣어주는건데 지금 저렇게
					// 문자열로 선언하면 ( "email" 로 했엇음) <-생각해보기
					// ArrayList에 그 UsersVo저장함
					userList.add(user);
			}
		} catch (SQLException e){
			e.printStackTrace();
		} finally{
			// 연결 끊기
			try {
				if(con!=null && !con.isClosed()){
					con.close();
				}
				if(pstmt!=null && !pstmt.isClosed()){
					pstmt.close();
				}
				if(rs!=null && !rs.isClosed()){
					rs.close();
				}
			} catch (SQLException e){
				e.printStackTrace();
			}
		}
		// 테이블에 있던 모든 자료를 가지고 있는 userList를 리턴
		return userList;		
	}//end getAllUser
	
}
	
	


