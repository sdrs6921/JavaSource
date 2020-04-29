package p0429.jdbc.addr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import p0429.jdbc.dbconn.DBConn;

public class DaoImpl implements Dao {
	private DBConn db;
	
	public DaoImpl() {
		// TODO Auto-generated constructor stub
		db = DBConn.getInstance();
	}

	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		/*��Ÿ�� Ȯ���� ����
		String sql2 = "INSERT INTO addr VALUES (seq_addr.nextval, '" + m.getName() + "', '"
				+ m.getTel() + "', '" + m.getAddress() + "')";*/
		String sql = "INSERT INTO addr VALUES (seq_addr.nextval, ?, ?, ?)";
		//Connection ����
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//sql���� ? ����
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getTel());
			pstmt.setString(3, m.getAddress());
			
			//SQL ������ ����:executeUpdate() -> ���� ���� / executeQuery -> �б� ����
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Member> selectByName(String name) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ADDR WHERE NAME=?";
		Connection conn = db.getConnect();
		ResultSet rs = null;
		ArrayList<Member> list = new ArrayList<Member>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int num = rs.getInt(1);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				Member m = new Member(num, name, tel, address);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Member selectByNum(int num) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ADDR WHERE NUM = ?";
		Member m = new Member();
		ResultSet rs = null;
		Connection conn = db.getConnect();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				m.setNum(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setTel(rs.getString(3));
				m.setAddress(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public ArrayList<Member> selectAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM ADDR";
		ArrayList<Member> list = new ArrayList<Member>();
		ResultSet rs = null;
		Connection conn = db.getConnect();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String tel = rs.getString(3);
				String address = rs.getString(4);
				Member m = new Member(num, name, tel, address);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		//������ ����� ��ȣ, �� ��ȭ, �� �ּ�
		String sql = "UPDATE addr SET tel=?, address=? WHERE num=?";
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getTel());
			pstmt.setString(2, m.getAddress());
			pstmt.setInt(3, m.getNum());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM addr WHERE num=?";
		Connection conn = db.getConnect();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
