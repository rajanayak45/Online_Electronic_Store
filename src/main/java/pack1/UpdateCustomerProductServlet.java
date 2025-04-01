package pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/buyProduct")
public class UpdateCustomerProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession session=req.getSession(false);
		
		if (session==null) {
			req.setAttribute("msg", "Session Expired!! :(");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			rd.forward(req, res);
		} 
		else {
			String pCode=req.getParameter("pCode");
			String pQty=req.getParameter("pQty");
			String pPrice=req.getParameter("pPrice");
			String pName=req.getParameter("pName");
			
			System.out.println("Hello");
			String reqNo=req.getParameter("reqNo");
			
				int pQty1=Integer.parseInt(pQty.trim());
				int reqNo1=Integer.parseInt(reqNo.trim());
				int pPrice1=Integer.parseInt(pPrice.trim());
				System.out.println(pQty+" "+reqNo);
				
				String pPrice2=Integer.toString(reqNo1*pPrice1);
				pQty1=pQty1-reqNo1;
				String pQty2=Integer.toString(pQty1);
				
				if(pQty1>reqNo1) {
					int rowCount=new UpdateCustomerProductServletDAO().purchase(pCode, pQty2);
					
					System.out.println(rowCount);
					if (rowCount>0) {
						System.out.println("DATA updated");
						req.setAttribute("Purchased", "Selected Product  Purchased!!");
						req.setAttribute("pPrice", pPrice2);
						req.setAttribute("pName", pName);
						RequestDispatcher rd=req.getRequestDispatcher("OrderConfirmed.jsp");
						rd.forward(req, res);
					} 
				}
			
//				else {
//					req.setAttribute("invalid", "Choose the number less than or equal to quantity!!");
//					RequestDispatcher rd= req.getRequestDispatcher("Invalid.jsp");
//					rd.forward(req, res);
				
			
		}
	}
}
