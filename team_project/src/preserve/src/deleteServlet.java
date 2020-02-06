package preserve.src;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userData.sys.userDAO;

/**
 * Servlet implementation class deleteServlet
 */
@WebServlet("/delete")
public class deleteServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	userDAO dao=new userDAO();
       
    public deleteServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
