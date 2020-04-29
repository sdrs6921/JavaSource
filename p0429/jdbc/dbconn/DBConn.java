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
		//DB System�� ����
		Connection conn = null;
		try {
			Class.forName(driver);//Oracle Driver Load
			//������ �ּ�, ����, ��й�ȣ�� �̿��ؼ� ���Ǽ���
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
