package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *  ��¥ : 2020/05/26
 *  �̸� : �躸��
 *  ���� : JDBC UPDATE �ǽ��ϱ�
 */
public class UpdateTest {
	public static void main(String[] args) {
		
		//DB����
		String host = "jdbc:mysql://192.168.44.7:3306/kbm";
		String user = "kbm";
		String pass = "1234";
		
		//Connection conn = null;
		
		//1�ܰ� - JDBC ����̹� �ε�
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host,user,pass);
		
		//3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		//4�ܰ� - SQL ����
		String sql = "UPDATE `USER2` SET `hp`='010-1111-1111' "; 
			   sql += "WHERE `uid` = 'J101'";
		stmt.executeUpdate(sql);
		
		//5�ܰ� - ����� ó�� (SELECT�� ���)
		//6�ܰ� - �����ͺ��̽� ����
				stmt.close();
				conn.close();
				
		}catch (Exception e) {
			System.out.println("������ ���࿡ ������ �߻��߽��ϴ�.");
		}
						
		 /*}catch(ClassNotFoundException e) {
			 //e.printStackTrace();
			 System.out.println("����̹� �ε忡 �����߽��ϴ�.");
		 }catch(SQLException e) {
			 //e.printStackTrace();
			 System.out.println("���������ӿ� �����߽��ϴ�.");
		 }*/
		 System.out.println("UPDATE �Ϸ�...");
	}
}
