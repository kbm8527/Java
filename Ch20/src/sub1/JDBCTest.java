package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜 : 2020/05/26
 * 이름 : 김보미
 * 내용 : JDBC 프로그래밍
 */
public class JDBCTest {
	public static void main(String[] args) throws Exception {
		
		//DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/kbm";
		String user = "kbm";
		String pass = "1234";
		
		//1단계 - JDBC 드라이버 동적로드
		Class.forName("com.mysql.jdbc.Driver");//driver클래스 생성(메모리에 올리는것)
		
		//2단계 -데이터베이스 접속
	Connection conn = DriverManager.getConnection(host,user,pass);
		
		if(conn !=null) {
			System.out.println("데이터베이스 접속 성공!");
		}
	
		//3단계 
		//4단계
		//5단계
		
		//6단계 - 데이터베이스 종료
		conn.close();
		
	}
}
