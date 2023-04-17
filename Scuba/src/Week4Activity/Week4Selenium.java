package Week4Activity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week4Selenium {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");

		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
	
}	
