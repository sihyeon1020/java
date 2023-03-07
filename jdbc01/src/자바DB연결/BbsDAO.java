package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//테이블 하나당 DAO 하나! => CUD를 완성!
public class BbsDAO {
	//★no를 int로 받을 사람들은 nextInt로 받기
	public void delete(String no) { 
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			
			//public void insert(String id, String pw, String name, String tel)
			String sql = "delete from hr.BBS where \"no\" = ?";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement

			ps.setString(1, no); 
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			ps.executeUpdate(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void update(String no, String CONTENT) {
	
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			
			//public void insert(String id, String pw, String name, String tel)
			String sql = "update hr.BBS set CONTENT = ? where \"no\" = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement

			ps.setString(1, CONTENT); 
			ps.setString(2, no); 
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			ps.executeUpdate(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	//public void add2() {
	public void insert(String no, String TITLE, String CONTENT, String WRITER) {
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			String sql = "insert into hr.BBS values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement

			ps.setString(1, no); 
			ps.setString(2, TITLE);
			ps.setString(3, CONTENT);
			ps.setString(4, WRITER);
			
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			ps.executeUpdate(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}