package userData.sys;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Result;
import com.opencsv.exceptions.CsvException;
import com.sun.mail.imap.protocol.Item;


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
		
		
		userModel user = (userModel) request.getSession().getAttribute("user");
		String name = user.getUsername();
		
		List<userModel> item=(List<userModel>) Csv(name);
		request.getSession().setAttribute("item", item);
		request.getRequestDispatcher("shopping.jsp").include(request, response);
	}
		
	private  List<userModel> Csv(String name) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\User\\Desktop\\fake_data\\"+ name +"\\"+ name +"_results.csv")));
		BufferedReader data = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\User\\Desktop\\fruits.csv")));
		String line; 
		String fruits=null;
		String fruitsData =null;
		String number =null;
		String price =null;
		String[] info = null;
		String in = null;
		String[] inf =null;
		Dictionary geek = new Hashtable();
		
	       while((in = data.readLine()) != null) {
	    	in = data.readLine();
			inf = in.split(",");
	    	geek.put(inf[0], inf[1]);
	       }

		List<userModel> item = new ArrayList<>();
				
				while ((line = br.readLine()) != null ) { 
					
					info = line.split("	");
					fruits = info[0];
					number = info[1];
					
					
					if (fruits.equals(geek.keys()))
					price = (String) geek.get(geek.keys());
					else price = "0";
					//System.out.println("水果名稱  :"+ info[0]  +" "+"個數  :"+ info[1] +" "+  "\n");
					item.add(new userModel(fruits, number, price));
			}		

				return item;
			
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
