package preserve.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import userData.sys.userDAO;
import userData.sys.userModel;

/**
 * Servlet implementation class Updata
 */
@WebServlet("/Updata")
public class Updata extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private userDAO dao=new userDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
	
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phoneNumber=request.getParameter("phonenumber");
		String birthday=request.getParameter("birthday");
		userModel newUser=new userModel(name, password, email, phoneNumber, birthday);
		
		try
		{
			dao.updateUser(newUser);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		out.print("<script>alert('修改成功請重新登入!')</script>");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
