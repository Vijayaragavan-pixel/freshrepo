package seleniumTraninig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijayaraghavanj\\Documents\\Software\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		By username = By.xpath("//input[@id='user-name']");
		
		By password = By.id("password");
		
		By loginBt= By.id("login-button");
		
		driver.findElement(username).sendKeys("standard_user");
		
		driver.findElement(password).sendKeys("secret_sauce");
		
		driver.findElement(loginBt).click();
		
		driver.wait();
		
		driver.quit();
		
		
	}

}
