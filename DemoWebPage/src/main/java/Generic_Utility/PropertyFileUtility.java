package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility extends WebDriverUtility{
	
	public static String propertyData(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(Iconstant.Property_path);
		p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
