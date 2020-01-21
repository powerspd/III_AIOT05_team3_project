package userData.sys;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import com.csvreader.*;
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
    	try
    	{
    		ServletContext context=se.getSession().getServletContext();
    		Date now=new Date();
    		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    		
    		String path=context.getRealPath(format.format(now)+".txt");
    		log=new logRecorder(path);
    	
    		String path2=context.getRealPath("fruits.csv");
    		CsvReader price=new CsvReader(path2);
    	
    		context.setAttribute("log", log);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

    public void sessionDestroyed(HttpSessionEvent se) 
    { 

    }
	
}
