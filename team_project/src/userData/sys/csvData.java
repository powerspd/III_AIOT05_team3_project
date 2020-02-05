package userData.sys;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.opencsv.exceptions.CsvException;




public class csvData {

	public static  String[] main(String[] args) throws IOException, CsvException {
		// TODO Auto-generated method stub
		String[] info = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\User\\Desktop\\fake_data\\jack\\jack_results.csv")));
		String line; 
		while ( (line = br.readLine()) != null ) { 
		    // nextLine[] is an array of values ​​from the line 
			 info = line.split("	");
			 String item = info[0];
			 String n =info[1];
			 
		    System.out.println("水果  :"+ item  +" "+"個數  :"+ n +" "+  "\n"); 
		}
		
		return info;
		
	}
}


