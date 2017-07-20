package CucumberTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class GetterClass {
   
	public Map<String,String> getDetails(){
		Properties prop = new Properties();
		InputStream input = null;
		
		try {
			input = new FileInputStream("/home/mayankchauhan/Documents/details.properties");
			prop.load(input);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		String args1=prop.getProperty("username");
		String args2=prop.getProperty("password");
		Map<String,String> map=new HashMap<String,String>();
		map.put("username", args1);
		map.put("password", args2);
		return map;
	}
		
}
