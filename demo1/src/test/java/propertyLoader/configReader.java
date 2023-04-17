package propertyLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class configReader {
	
	public static Properties websiteProperty;
	public static String Orange;
	public static String time;
	
	
	public Properties setupSuite() throws IOException {
		String path = "src/test/resources/config/environment/";
		
		websiteProperty = new Properties();
		File testData = new File(path + "website.properties");
		FileInputStream read = new FileInputStream(testData);
		websiteProperty.load(read);
		read.close();
		
		
		return (websiteProperty);
		
		
	}


//public static void main(String args[]) throws IOException {
//	setupSuite();
//System.out.println(Orange);	
//}
}
