package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import propertyLoader.configReader;

public class DriverFactory {
	configReader config = new configReader();
	static WebDriver driver;
	
	public  WebDriver start() throws InterruptedException {
		//config.setupSuite();
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(5000);   
    
    return(driver);
    

	}
}
