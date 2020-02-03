package userData.sys;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import userData.sys.userModel;
import userData.sys.userDAO;

@WebFilter({ "/loginFilter", "/Shopping" })
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
			userModel user=dao.selectUser(request.getParameter("name"));
			if(user!=null)
			{
				if(request.getParameter("password")==user.getPassword())
				{
					chain.doFilter(request, response);
				}
			}
			else
			{
				out.print("<script>alert('±b¸¹©Î±K½X¿ù»~!')</script>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
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
