package userData.sys;

import java.io.IOException;
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

@WebFilter({ "/loginFilter", "/login" })
public class loginFilter implements Filter
{
	userDAO dao=new userDAO();

    public loginFilter(){}

	public void destroy(){}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
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
				System.out.println("login fail");
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
