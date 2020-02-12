package shopping;

import java.io.*;
import java.nio.file.*;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;

@WebServlet("/ForgotServlet")
public class ForgotServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private final String USER_PATH = "C:/Users/User/Desktop";

    public ForgotServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String [] profile = myData(name);
		
		if(profile == null) {
			
			out.println("<html><body onload=\"alert('Account not found!')\"></body></html>");
			request.getRequestDispatcher("forgot.jsp").include(request, response);
			
		} else {
		
			// Recipient's email ID needs to be mentioned.
			String to = profile[0];
			 
			// Sender's email ID needs to be mentioned
			String from = "henrytong911216@gmail.com";
			 
			// Sending email from gmail
			String host = "smtp.gmail.com";
			String port = "587";
			 
			// Get system properties
			Properties properties = System.getProperties();
			 
			// Setup mail server
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port", port);
			  
			// Get the default Session object.
			Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, "czyfycytiqtnbypq");
				}
			});
		
			try {
		  
				// Create a default MimeMessage object.
				MimeMessage message = new MimeMessage(session);
				 
				// Set From: header field of the header.
				message.setFrom(new InternetAddress(from));
				 
				// Set To: header field of the header.
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				 
				// Set Subject: header field
				message.setSubject("Your password");
				 
				// Now set the actual message
				message.setText("Your password is: " + profile[1]);
				 
				// Send message
				Transport.send(message);					  
				out.println("<html><body onload=\"alert('Sent message successfully!')\"></body></html>");
				request.getRequestDispatcher("index.jsp").include(request, response);
				
			} catch (MessagingException mex) {
				mex.printStackTrace();
			}
		
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private String [] myData(String name) throws IOException {
	
		Path userhome = Paths.get(USER_PATH, name);
		
		if(Files.exists(userhome)) {
			try(BufferedReader br = Files.newBufferedReader(userhome.resolve("profile.txt"))) {
				return br.readLine().split("\t");
			}
		} else {
			return null;			
		}

	}

}
