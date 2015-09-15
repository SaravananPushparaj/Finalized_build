package learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility_class1 {
	
	
	public String Reading_properties(String Skey) throws IOException
	
	{
		
		File f= new File("C:\\Users\\User\\workspace1\\Seleniumlearning\\global_setting.properties");
		FileInputStream fis= new FileInputStream(f);
		
		Properties prop= new Properties();
		prop.load(fis);
		
		return prop.getProperty(Skey);
		
		
	}

}
