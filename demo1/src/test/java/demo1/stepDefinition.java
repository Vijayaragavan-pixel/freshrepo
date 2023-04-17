package demo1;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import propertyLoader.configReader;

public class stepDefinition {

	static Properties prop;
	//private static final String Orange = null;
	static WebDriver drive;
	static configReader load = new configReader();
	static DriverFactory factory = new DriverFactory();



	@Before
	public static void loadTestData() throws IOException, InterruptedException {
		load.setupSuite();
		factory.start();

		prop = configReader.websiteProperty;
		drive = DriverFactory.driver;	

	}


	@Given("^open \"([^\"]*)\" webpage$")
	public static void open_webpage(String arg) throws InterruptedException, IOException {


		String url = prop.getProperty(arg);

		drive.get(url);
	}

	//		public static void main(String args[]) throws InterruptedException, IOException {
	//			open_webpage("Orange");
	//		}

	@When("^User enters \"([^\"]*)\" at login page$")
	public static void username(String arg){

		String username = prop.getProperty(arg);

		drive.findElement(By.id("txtUsername")).sendKeys(username);

	}

	@And("^User gives \"([^\"]*)\" at login page$")
	public static void password(String arg){

		String password = prop.getProperty(arg);

		drive.findElement(By.id("txtPassword")).sendKeys(password);

	}
	
	@And("^User click login button at login page$")
	public static void loginbt() {
		
		drive.findElement(By.id("btnLogin")).click();
	}
	
	@Then("^\"([^\"]*)\" webpage opened successfully$")
	public static void homepage(String args) {
		
		String expected = prop.getProperty(args);
		Assert.assertEquals(expected, drive.getCurrentUrl());
		
	}
	
	@After
	public void close() {
		drive.close();
	}
	

}
