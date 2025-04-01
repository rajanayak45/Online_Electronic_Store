package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/buy")
public class BuyProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession session=req.getSession(false);
//		ProductBean pb=new ProductBean();
		
		if (session==null) {
			req.setAttribute("msg", "Session Expired!! :(");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			rd.forward(req, res);
		} 
		else {
			String pcode=req.getParameter("pcode");
			System.out.println(pcode);
			ArrayList<ProductBean> al=new BuyProductServletDAO().buyProduct(pcode);
			
			ProductBean pb=null;
			Iterator<ProductBean> i=al.iterator();
			while(i.hasNext()) {
				pb=i.next();
				if(pcode.equals(pb.getpCode()))
				{
					System.out.println("If bloc ");
					break;
				}
			}
			System.out.println(pb.getpCompany());
			req.setAttribute("al", al);
			req.setAttribute("pbean", pb);
			RequestDispatcher rd=req.getRequestDispatcher("BuyProduct.jsp");
			rd.forward(req, res);
		
		}
	}
}
