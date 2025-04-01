package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BuyProductServletDAO {
	
	ArrayList<ProductBean> al=new ArrayList<ProductBean>();
	
	public ArrayList<ProductBean> buyProduct(String pCode) {
		int rowCount=0;
		
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstmt=con.prepareStatement("select * from product where pcode=?");
			pstmt.setString(1, pCode);
//			rowCount=pstmt.executeUpdate();
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				ProductBean pbean=new ProductBean();
				pbean.setpCode(rs.getString(1));
				pbean.setpName(rs.getString(2));
				pbean.setpCompany(rs.getString(3));
				pbean.setpPrice(rs.getString(4));
				pbean.setpQuantity(rs.getString(5));
				
				al.add(pbean);
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return al;
	}
}
