package preserve.src;

import java.util.Date;
import java.io.*;
import userData.sys.userModel;

public class logRecorder
{
	private File log;//using listener to locate the log file, with servlet context
	private Date date=new Date();
	
	public logRecorder(String location)
	{
		this.log=new File(location);
		
		try
		{
			if(!log.exists())
			{
				log.createNewFile();
			}
		}	
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void signUp(String name)
	{
		try
		{
			BufferedWriter writer=new BufferedWriter(new FileWriter(log, true));
			String temp=date.toString()+": A new user(username: "+name+" ) has signed up to system.";
			System.out.println(temp);
			writer.write(temp);
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void login(String name)
	{
		try
		{
			BufferedWriter writer=new BufferedWriter(new FileWriter(log, true));
			String temp=date.toString()+": User(username: "+name+" ) has login into system.";
			System.out.println(temp);
			writer.write(temp);
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void logout(String name)
	{
		try
		{
			BufferedWriter writer=new BufferedWriter(new FileWriter(log, true));
			String temp=date.toString()+": User(username: "+name+" ) has logout.";
			System.out.println(temp);
			writer.write(temp);
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void changePassword(String name)
	{
		try
		{
			BufferedWriter writer=new BufferedWriter(new FileWriter(log, true));
			String temp=date.toString()+": User(username: "+name+" ) change his/her password";
			System.out.println(temp);
			writer.write(temp);
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void modify(String name)
	{
		try
		{
			BufferedWriter writer=new BufferedWriter(new FileWriter(log, true));
			String temp=date.toString()+": User(username: "+name+" ) has change his/her profile.";
			System.out.println(temp);
			writer.write(temp);
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void delete(userModel user)
	{
		try
		{
			BufferedWriter writer=new BufferedWriter(new FileWriter(log, true));
			String temp=date.toString()+": User(username: "+user.getUsername()+" ) leave the system.";
			System.out.println(temp);
			writer.write(temp);
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void SQL(String instruction)
	{
		try
		{
			BufferedWriter writer=new BufferedWriter(new FileWriter(log, true));
			String temp=date.toString()+": "+instruction;
			System.out.println(temp);
			writer.write(temp);
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
