package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clog")
public class CustomerRegistrationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		CustomerBean cb=new CustomerBean();
		cb.setcUname(req.getParameter("cname"));
		cb.setcPwd(req.getParameter("cpwd"));
		cb.setcFname(req.getParameter("cfname"));
		cb.setcLname(req.getParameter("clname"));
		cb.setcAddrs(req.getParameter("caddr"));
		cb.setcMail(req.getParameter("cmail"));
		cb.setcMobile(req.getParameter("cmobile"));
		
		int rowCount=new CustomerRegistrationDAO().insertData(cb);
	
		if(rowCount>0) {
			req.setAttribute("msg", "Customer Registration Successfull!! :)");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.jsp");
			rd.forward(req, res);
		
		}
		else {
			req.setAttribute("msg", "Customer Registration Not Successfull!! :(");
			RequestDispatcher rd=req.getRequestDispatcher("CustomerLogin.jsp");
			rd.forward(req, res);
		}
	
	
	}
}
