package userData.sys;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.csvreader.CsvReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class zzzz {

	public static void main(String[] args) throws IOException, CsvException {
		// TODO Auto-generated method stub
		try {
			CsvReader products = new CsvReader("C:\\Users\\User\\Desktop\\fake_data\\jack\\jack_results.csv");
			products.readHeaders();
			while (products.readRecord())
		    {
				String data1= products.get("data id");
				String data2= products.get("data name");
				String data3= products.get("data price");	
				// perform program logic here
				System.out.println("id :" + data1);
			}
			products.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
	


