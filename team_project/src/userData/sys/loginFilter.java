package userData.sys;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import userData.sys.userModel;
import userData.sys.userDAO;

@WebFilter({ "/loginFilter", "/LoginServlet" })
public class loginFilter implements Filter
{
	userDAO dao=new userDAO();

    public loginFilter(){}

	public void destroy(){}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		try
		{
			userModel user = dao.selectUser(request.getParameter("name"));
			String password = request.getParameter("password");
			if(user!=null && user.getPassword().equals(password))
				
					chain.doFilter(request, response);
				
			
			else
			{
				out.print("<body onload=\"alert('±b¸¹±K½X¿ù»~!')\"></body>");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void init(FilterConfig fConfig) throws ServletException
	{
	}

}
