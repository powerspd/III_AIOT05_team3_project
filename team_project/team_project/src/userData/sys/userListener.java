package userData.sys;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Date;
import java.text.SimpleDateFormat;
import userData.sys.logRecorder;

@WebListener
public class userListener implements HttpSessionListener
{
	static logRecorder log;
    public userListener()
    {
    }
    
    public void sessionCreated(HttpSessionEvent se) 
    { 
    	ServletContext context=se.getSession().getServletContext();
    	Date now=new Date();
    	SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    	
    	String path=context.getRealPath(format.format(now)+".txt");
    	log=new logRecorder(path);
    	
    	context.setAttribute("log", log);
    }

    public void sessionDestroyed(HttpSessionEvent se) 
    { 

    }
	
}
