package preserve.src;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import userData.sys.userDAO;
import userData.sys.userModel;

@WebServlet("/account")
public class AccountServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    userDAO dao=new userDAO();
    public AccountServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			userModel user = (userModel) request.getSession().getAttribute("user");
			request.getRequestDispatcher("Account.jsp").include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
