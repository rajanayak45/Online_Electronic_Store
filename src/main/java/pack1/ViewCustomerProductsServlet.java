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

@WebServlet("/view2")
public class ViewCustomerProductsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession session=req.getSession(false);
		if(session==null) {
			req.setAttribute("msg", "Session Expired! :(");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			rd.forward(req, res);
		
		}
		else {
			ArrayList<ProductBean> al=new ViewCustomerProductDAO().reteriveProducts();
			session.setAttribute("al", al);
			RequestDispatcher rd=req.getRequestDispatcher("ViewProduct2.jsp");
			rd.forward(req, res);
		
		
		}
		
	
	}
}
