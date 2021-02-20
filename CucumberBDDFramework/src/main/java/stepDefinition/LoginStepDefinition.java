package stepDefinition;

import java.util.List;
import java.util.Properties;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ConfigFileReader;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

//	private final String filePath= "resources//Configuration.properties";
	WebDriver driver;
	Properties prop;
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws InterruptedException  {
		prop=ConfigFileReader.readconfigfile();
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	   
	}

	
	@When("^title of the login page is OpenCart$")
	public void title_of_the_login_page_is_OpenCart() throws InterruptedException {
		prop=ConfigFileReader.readconfigfile();
		WebElement loginlabel=driver.findElement(By.xpath(prop.getProperty("label_opencartLogin")));
		Assert.assertEquals(loginlabel.getText(), "Log in to your OpenCart account");
	}

	
	// This code is for data driven with and without Example keyword 
	 /* @Then("^user enters \"(.*)\" and \"(.*)\"$") public void
	 * user_enters_username_and_password(String username,String password) throws
	 * InterruptedException { WebElement
	 * txtbox_username=driver.findElement(By.xpath(prop.getProperty("txtbox_input"))
	 * ); WebElement txtbox_password=driver.findElement(By.xpath(prop.getProperty(
	 * "txtbox_password"))); txtbox_username.sendKeys(username);
	 * txtbox_password.sendKeys(password); }
	 */
	
	// Step definition for data driven using data table approach
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable dt) throws InterruptedException {
		List<List<String>> data =dt.raw();
		WebElement txtbox_username=driver.findElement(By.xpath(prop.getProperty("txtbox_input"))); 
		WebElement txtbox_password=driver.findElement(By.xpath(prop.getProperty("txtbox_password"))); 
		txtbox_username.sendKeys(data.get(0).get(0));
		txtbox_password.sendKeys(data.get(0).get(1));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
	    WebElement loginButton=driver.findElement(By.xpath(prop.getProperty("button_login")));
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click()", loginButton);
	}
	
	// This code is for data driven with and without Example keyword 
	 /* @Then("^user enters pin \"(.*)\"$") public void user_enters_pin(String pin)
	 * throws InterruptedException { WebElement
	 * inputpin=driver.findElement(By.xpath(prop.getProperty("txtbox_pin"))); //
	 * inputpin.sendKeys(prop.getProperty("pin")); inputpin.sendKeys(pin); }
	 */
	
	// Step definition for data driven using data table approach
	@Then("^user enters pin$")
	public void user_enters_pin(DataTable dt) throws Throwable {
		List<List<String>> data =dt.raw();	
		WebElement inputpin=driver.findElement(By.xpath(prop.getProperty("txtbox_pin")));
		inputpin.sendKeys(data.get(0).get(0));
	}
	
	@Then("^user clicks on continue button$")
	public void user_clicks_on_continue_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement continueButton=driver.findElement(By.xpath(prop.getProperty("button_continue")));
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click()", continueButton);
	}

	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException {
		WebElement continueButton=driver.findElement(By.xpath(prop.getProperty("label_loginHeader")));
		Assert.assertEquals(continueButton.getText(), "Welcome to OpenCart!");
	}


	
}
