package userData.sys;
import java.io.IOException;

import com.csvreader.*;

public class test
{
	public static void main(String argv[])
	{
		try 
		{
			CsvReader reader=new CsvReader("fruits.csv");
			reader.readHeaders();
			while(reader.readRecord())
			{
				System.out.println(reader.getCurrentRecord());
				System.out.println(reader.get("item"));
				System.out.println(reader.get("unitprice"));
				
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
