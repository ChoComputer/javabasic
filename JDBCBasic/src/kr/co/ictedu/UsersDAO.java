package kr.co.ictedu;

import java.sql.*;

// DAO클래스는DB연동을 전담해 처리합니다.
public class UsersDAO {
	
	//DB 주소 아이디 패스워드 미리저장
	private static final String URL ="jdbc:mysql://localhost/ict03";
	private static final String DBID="root";
	private static final String DBPW="mysql";
	
	// 메서드 결과에 따른 리턴값 상수로 표기
	private static final int ID_DELETE_SUCCESS=1;
	private static final int ID_DELETE_FAIL=0;
	private static final int LOGIN_SUCCESS =1;
	private static final int LOGIN_FAIL =0;
	

	/*
	 * DAO 클래스는 하나의 객체만으로도 DB연동을 수행할 수 있기 때문에
	 * 메모리 관리 차원에서 클래스의 객체를 단 1개만 생성하도록
	 * 싱글톤 패턴을 적용하여 클래스를 디자인 합니다.
	 */
	
	// 싱글 톤 패턴 클래스 디자인 방법
	// 1. 외부에서 객체를 new 키워드로 만들어 쓸 수 없도록 생성자에 private을 붙여줍니다.
	private UsersDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 2. 외부에서 객체 생성을 못하기 때문에 자기 클래스 내부에서 그냥
	// 스스로 자기자신을 1개 생성합니다. 참조형 변수 생성
	private static UsersDAO dao =new UsersDAO();
	
	// 3. 외부에서 객체 생성이 필요할 때 public 선언으로 처리한 
	// getter를 이용해 2에서 만든 객체를 리턴만 해줍니다.
	// 이러면 UserDAO는 참조형 변수 이기 때문에 주소값만 전달함
	public static UsersDAO getInstance() {
		return dao;
	}
	
	// 회원가입을 처리하는 메스드 선언
	// DB에 들어가는 데이터, 혹은 DB에서 출력되어 나오는 데이터
	// 모두가 UsersVO 내부자료 형식을 벗어날 수 없으므로
	// 대다수 입출력은 전부 VO를 매개로 진행합니다.
	public int joinUsers(UsersVO user) {
		// users_join.jsp에서 가져온 코드를 이곳에 붙여넣기를 합니다.

		// Connection 객체 생성
		Connection con = null;
		//쿼리문 실행을 위한 Preparedstatement객체생성
		PreparedStatement pstmt = null;

		try {
			
			// 접속 주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다.
			con = DriverManager.getConnection(URL,DBID,DBPW);
			
			// 1. INSERT 쿼리문을 작성합니다.
			String sql="INSERT INTO users VALUES (?,?,?,?)";
			
			// 2. 만든 쿼리문의 ? 자리에 적용할 자바 변수를 집어 넣는다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getUpw());
			pstmt.setString(3, user.getUname());
			pstmt.setString(4, user.getEmail());
					
			// 3. 만든 쿼리문 실행하기
			pstmt.executeUpdate();
					
		}  catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				// con 닫기
				if (con != null && !con.isClosed()) {
			con.close();
				}
				// pstmt 닫기
				if (pstmt !=null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}// end joinUser
	
	public int loginUser(UsersVO user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 구문이라 반드시 필요
		
	

	// DB 연결 로직을 집어넣어 주세요
	try {
		con = DriverManager.getConnection(URL, DBID, DBPW); //검색만 할거라 select 권한만 가지고 있는 계정을 넣음 (회사는)

		// 1.SELECT 쿼리문을 작성합니다.
		// 입력받은 id가 실제로 DB에 존재하는지 조회하는 쿼리문을 작성해주세요
		String sql = "SELECT * FROM users WHERE uid=?"; // 로그인창에 적은 아이디가 ? 표에 넣어서 users에 그id가있는지 서치해보는 거임

		// 2. 쿼리문의 ? 자리에 적용할 변수를 집어넣습니다.
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUid());

		// 3. 쿼리문 실행 및 데이터 받아오기
		rs = pstmt.executeQuery(); // 안들어오거나 1개가들어옴 (uid)

		// rs.next()를 통해 데이터가 들어왔는지 안들어왔는지 확인 true false로 
		// rs.next() 가 db에 내가친 아이디가 있나 없나 확인하는용도임 있으면 true 없으면 false
		if (rs.next()) {

			// 들어왔다면 DB쪽 데이터 받기
			String dbId = rs.getString("uid");
			String dbPw = rs.getString("upw");

			// 얻어온 DB내 정보를 콘솔에 찍어봅니다.
			/* System.out.println("조회된 아이디 : "+dbId);
			System.out.println("조회된 비밀번호 : "+dbPw);
			out.println("조회된 아이디 : "+dbId);
			out.println("조회된 비밀번호 : "+dbPw);
			 */

			// 폼에서 보낸 데이터와 DB쪽 데이터간 아이디(위의where에서 걸려지긴해서 여기선 비교 안해도되지만..)  
			// 비밀번호 일치여부 비교해서 아이디와 비밀번호 모두 일치시 세션 발급 및 body 태그에 id 출력
			// 비밀번호가 틀린경우 역시 user_login_fail.jsp로 보내줌.
			// 여기서 이해를 위해 id도 비교한거임 원래는 필요없음 이유는 여기 까지 온다는 것 자체가 아이디가 동일할때
			// 만 여기까지 와지니까
			if ((user.getUid()).equals(dbId) && (user.getUpw()).equals(dbPw)) {
				return LOGIN_SUCCESS;
				} else {
					// 비밀번호가 틀린경우
				return LOGIN_FAIL;
				}
		}else{ 
			// DB데이터가 들어오지 않는 경우
			  return LOGIN_FAIL;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		// 연결 끊기
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
	return 0;

		
	}// end loginUser
	
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
		if((user.getUpw()).equals(dpw)) {
			// 접속 주소, 계정, 비밀번호를 이용해 접속요청을 넣습니다.
			con = DriverManager.getConnection(URL, DBID, DBPW);
			
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
	return 0;
}// end usersDelete	



// getUserInfo 메서드
// 수정 로직을 사용하기전에 수정할 타겟 아이디의 정보를 얻어오기위해
// 사용하는 메스드로 아이디,비밀번호,이름,이메일을 UsersVO에 넣어서 
// 리던합니다.
	public UsersVO getUserInfo(UsersVO user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 구문이라 반드시 필요
		
		// 비어있는 UsersVO도 같이 선언 리턴을 UsersVO로 하니까 결과 데이터임
		UsersVO resultData=new UsersVO();  // 트라이 캐치하고 리턴하니까 여기 위치해야함
		
		// DB 연결로직
		try {
		
			con = DriverManager.getConnection(URL, DBID, DBPW); 

			//  DB연결 후 입력받은 user의 .getUid()를 이용해 조회 구문완성
			String sql = "SELECT * FROM users WHERE uid=?"; 

			// 2. 쿼리문의 ? 자리에 적용할 변수를 집어넣습니다.
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUid());

			// 3. 쿼리문 실행 및 데이터 받아오기
			rs = pstmt.executeQuery(); 

		if(rs.next()) {
		// 이후 ResultSet 에 담겨 있는 자료를 다시꺼내서
		// 새로 선언 한 UsersVO 변수에 입력해 준 후
		resultData.setUid(rs.getString("uid"));
		resultData.setUpw(rs.getString("upw"));
		resultData.setUname(rs.getString("uname"));
		resultData.setEmail(rs.getString("email"));
			
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
		// ResultSet입력 받은 UsersVO를 리턴
		return resultData;

	}

}