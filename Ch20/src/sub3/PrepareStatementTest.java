package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/*
 *  날짜 : 2020/05/26
 *  이름 : 김보미
 *  내용 : PrepareStatement 실습하기
 */
public class PrepareStatementTest {
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("사용자 등록(종료:0, 등록:1)");
			System.out.println("선택 : ");
			
			int choice = sc.nextInt();
			
			if(choice == 0) {
				break;
			}
			System.out.print("아이디 입력 : ");
			String uid = sc.next();
			
			
			System.out.print("이름 입력 : ");
			String name = sc.next();
			
			
			System.out.print("휴대폰 입력 : ");
			String hp = sc.next();
			
			
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			
			insertUser(uid,name,hp,age);
			
			
			
			
		}while(true);
		
		System.out.println("프로그램 종료...");
		
		
	}//main end
	
	public static void insertUser(String uid,String name,String hp, int age) throws Exception {
		//DB정보
				String host = "jdbc:mysql://192.168.44.7:3306/kbm";
				String user = "kbm";
				String pass = "1234";
				
				//1단계 - JDBC 드라이버 로드
				Class.forName("com.mysql.jdbc.Driver");
				//2단계 - 데이터베이스 접속
				Connection conn =  DriverManager.getConnection(host,user,pass);
				
				
				//3단계 - SQL 실행객체 생성 및 데이터 맵핑
				String sql = "INSERT INTO `USER2` VALUES(?,?,?,?)";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, uid);
				psmt.setString(2, name);
				psmt.setString(3, hp);
				psmt.setInt(4, age);
				
				//4단계 - SQL 실행
				//String sql = "INSERT INTO `USER2` VALUES('"+uid+"','"+name+"','"+hp+"',"+age+")";
				psmt.executeUpdate(sql);
				
				//5단계 -결과셋처리(SELECT일경우)
				
				//6단계 -데이터베이스 종료
				psmt.close();
				conn.close();
				System.out.println("INSERT 완료...");
	}
}
