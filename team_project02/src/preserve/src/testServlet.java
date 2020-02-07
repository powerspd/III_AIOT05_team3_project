package preserve.src;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/testServlet")
//public class testServlet extends HttpServlet
//{
//	private static final long serialVersionUID = 1L;
//       
//    public testServlet()
//    {
//        super();
//    }
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//	{
//		
//	}
//	
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//	{
//		doGet(request, response);
//	}
//
//}
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class testServlet
{
   public static void main(String[] args)
   {
      // Recipient's email ID needs to be mentioned.
      String to = "ppowerlai0311@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "ppowerlai0311@gmail.com";
      final String password = "ppower850311";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object.
      Session session = Session.getDefaultInstance
      (props,
    		  new javax.mail.Authenticator()
      			{
            		protected PasswordAuthentication getPasswordAuthentication()
            		{
            			return new PasswordAuthentication(from, password);
            		}
      			}
      );

      try
      {
	   // Create a default MimeMessage objecXt.
	   Message message = new MimeMessage(session);
	   
	   // Set From: header field of the header.
	   message.setFrom(new InternetAddress(from));
	
	   // Set To: header field of the header.
	   message.setRecipients(Message.RecipientType.TO,
               InternetAddress.parse(to));
	
	   // Set Subject: header field
	   message.setSubject("Testing Subject");
	
	   // Now set the actual message
	   message.setText("Hello, this is sample for to check send " +
		"email using JavaMailAPI ");

	   // Send message
	   Transport.send(message);

	   System.out.println("Sent message successfully....");

      }
      catch (MessagingException e)
      {
         e.printStackTrace();
      }
   }
}