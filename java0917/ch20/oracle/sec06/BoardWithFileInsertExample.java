package ch20.oracle.sec06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFileInsertExample {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/orcl",
					"java",
					"oracle"
			);
			
			String sql = "" + "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledate) "+"values (SEQ_BNO.NEXTVAL, ?,?,?, SYSDATE,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno"});
			pstmt.setString(1, "눈 오는날");
			pstmt.setString(2, "함박눈이 내려요.");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
			pstmt.setBlob(5, BoardWithFileInsertExample.class.getResourceAsStream("snow.jpg"));
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수 :"+rows);
			
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno : "+bno);
				}
				rs.close();
				pstmt.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
					//연결 끊기
				}catch(SQLException e) {}
			}
		}
	}

}
