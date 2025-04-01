package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerRegistrationDAO {
	public int insertData(CustomerBean cb) {
		int rowCount=0;
		
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			pstmt.setString(1, cb.getcUname());
			pstmt.setString(2, cb.getcPwd());
			pstmt.setString(3, cb.getcFname());
			pstmt.setString(4, cb.getcLname());
			pstmt.setString(5, cb.getcAddrs());
			pstmt.setString(6, cb.getcMail());
			pstmt.setString(7, cb.getcMobile());
			
			rowCount=pstmt.executeUpdate();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
