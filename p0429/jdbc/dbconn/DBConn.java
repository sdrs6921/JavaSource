package p0429.jdbc.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	//Singleton Class
	private static DBConn db = new DBConn();
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private DBConn(){}
	
	public static DBConn getInstance() {
		return db;
	}

	public Connection getConnect() {
		//DB System에 연결
		Connection conn = null;
		try {
			Class.forName(driver);//Oracle Driver Load
			//서버의 주소, 계정, 비밀번호를 이용해서 세션수립
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
