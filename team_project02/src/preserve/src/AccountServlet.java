package preserve.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

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
		try
		{
//			userModel user=dao.selectUser("usertest");
			HttpSession session=request.getSession();
			userModel user=(userModel)session.getAttribute("user");
			PrintWriter writer=response.getWriter();
			writer.write(user.getId()+"<br>");
			writer.write(user.getUsername()+"<br>");
			writer.write(user.getPassword()+"<br>");
			writer.write(user.getPhonenumber()+"<br>");
			writer.write(user.getEmail()+"<br>");
			writer.write(user.getBirthday()+"<br>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
