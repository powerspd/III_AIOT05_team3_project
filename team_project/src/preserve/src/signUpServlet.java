package preserve.src;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userData.sys.userDAO;
import userData.sys.userModel;

import java.sql.SQLException;

@WebServlet("/signUp")
public class signUpServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private userDAO dao=new userDAO();
       
    public signUpServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println(request.getParameter("name")+" "+request.getParameter("password"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("phonenumber"));
		System.out.println(request.getParameter("birthday"));
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phoneNumber=request.getParameter("phonenumber");
		String birthday=request.getParameter("birthday");
		userModel newUser=new userModel(name, password, email, phoneNumber, birthday);
		
		try
		{
			dao.insertUser(newUser);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		response.sendRedirect("actionSuccess.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
