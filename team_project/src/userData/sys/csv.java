package userData.sys;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class csv {

	
		// TODO Auto-generated method stub
		public  List<userModel> Csv(String name) throws IOException {
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\User\\Desktop\\fake_data\\"+ name +"\\"+ name +"_results.csv")));
			BufferedReader data = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\User\\Desktop\\fruits.csv")));
			String line; 
			String fruits=null;
			String number =null;
			Double price =0.0;
			String[] info = null;
			String in = null;
			String[] inf =null;
			String key = null;
			Double value = 0.0;
			Double total = 0.0;
			Double precision = 0.0;
			Map<String, String> dictionary = new HashMap<String, String>();
			while ((in = data.readLine()) != null ) { 
				inf = in.split(",");
				dictionary.put(inf[0], inf[1]);
			}
			
			List<userModel> item = new ArrayList<>();
					
					while ((line = br.readLine()) != null ) { 
						
						info = line.split("	");
						fruits = info[0];
						number = info[1];
						precision = (Double.valueOf(info[2])*100.00);
						System.out.println(info[2]);
						//System.out.print(price);
						java.util.Set<String> keySet = dictionary.keySet();
				        Iterator<String> it = keySet.iterator();
				        while(it.hasNext()){
				             key = (String) it.next();
				             
				             if (fruits.equals(key)) {
				            	 String a= dictionary.get(fruits).toString(); 
				            	 value = Double.parseDouble(a);
				            	 //System.out.print(value);
				             }
				            else price = 0.0;
				        }
				        price = value;
				       
				       total += price; 
				       System.out.println(total);
						item.add(new userModel(fruits, number, price,total,precision));
				        
					}
				br.close();
				data.close();
					
					return item;
	}

}
