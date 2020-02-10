package userData.sys;


import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
       
    public LoginServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		userDAO dao=new userDAO();
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		try {
			userModel user=dao.selectUser(request.getParameter("name"));
			request.getSession().setAttribute("user", user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("ShoppingCart.jsp").include(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
