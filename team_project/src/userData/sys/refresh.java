package userData.sys;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class refresh
 */
@WebServlet("/refresh")
public class refresh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public refresh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		userModel user = (userModel) request.getSession().getAttribute("user");
		String name = user.getUsername();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\User\\Desktop\\fake_data\\"+ name +"\\"+ name +"_results.csv")));
		String line; 
		String[] info = null;
		while ( (line = br.readLine()) != null ) { 
			info = line.split("	");
			//pw.println("水果  :"+ info[0]  +" "+"個數  :"+ info[1] +" "+  "\n");
		}
		pw.println(info[0]);
		request.getSession().setAttribute("info", info);
		request.getRequestDispatcher("shopping.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
