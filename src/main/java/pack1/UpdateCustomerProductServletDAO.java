package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateCustomerProductServletDAO {
	public int purchase(String pCode,String  pQty) {
		int rowCount=0;
		ProductBean pb=null;
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("update product set pqty=? where pcode=? ");
			pstmt.setString(1,pQty);
			pstmt.setString(2, pCode);
			rowCount=pstmt.executeUpdate();
			
			
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}
}
