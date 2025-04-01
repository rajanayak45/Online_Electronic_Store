package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cls")
public class CustomerLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
	{
		CustomerLoginDAO cldao=new CustomerLoginDAO();
		CustomerBean cb=cldao.checkCustomerLogin(req.getParameter("cname"), req.getParameter("cpwd"));
		
		if(cb==null) {
			System.out.println("wrong Credentials");
			req.setAttribute("msg", "Wrong Credentials!");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.html");
			rd.forward(req, res);
		}
		else {
			HttpSession session=req.getSession();
			session.setAttribute("cb", cb);
			RequestDispatcher rd=req.getRequestDispatcher("CustomerHome.jsp");
			rd.forward(req, res);
		}
		
	}
}
