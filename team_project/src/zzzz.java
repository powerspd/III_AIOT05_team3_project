import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;



public class zzzz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name = "andy";
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\User\\Desktop\\fruits.csv")));
		String line = null;
		String[] info =null;
		Map<String, String> dictionary = new HashMap<String, String>();
		while ((line = br.readLine()) != null ) { 
			info = line.split(",");
			dictionary.put(info[0], info[1]);
	}
		java.util.Set<String> keySet = dictionary.keySet();
        Iterator<String> it = keySet.iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            String value = dictionary.get(key);
		

	}
}
}