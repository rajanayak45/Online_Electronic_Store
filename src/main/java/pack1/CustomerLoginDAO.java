package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO {
	public CustomerBean checkCustomerLogin(String cUname, String cPwd) {
		CustomerBean cb=null;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select * from customer where uname=? and pword=?");
			pstmt.setString(1, cUname);
			pstmt.setString(2, cPwd);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				cb=new CustomerBean();
				
				cb.setcUname(rs.getString(1));
				cb.setcPwd(rs.getString(2));
				cb.setcFname(rs.getString(3));
				cb.setcLname(rs.getString(4));
				cb.setcAddrs(rs.getString(5));
				cb.setcMail(rs.getString(6));
				cb.setcMobile(rs.getString(7));
			}
		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return cb;
	}
}
