package stepDefinition;

import java.util.List;
import java.util.Map;
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

public class RegisterStepDefinition {

	//data table with Maps for parameterization of test case
	WebDriver driver;
	Properties prop;
	
	@Given("^user is already on sign up page$")
	public void user_is_already_on_sign_up_page() throws InterruptedException {
		prop=ConfigFileReader.readconfigfile();
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url_address"));
		driver.manage().window().maximize();
		WebElement link_signin=driver.findElement(By.xpath(prop.getProperty("link_signin")));
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click()", link_signin);
		Thread.sleep(3000);
		WebElement link_signup=driver.findElement(By.xpath(prop.getProperty("link_signup")));
		js.executeScript("arguments[0].click()", link_signup);
		Thread.sleep(3000);
	    
	}

	@When("^title of the page is signup$")
	public void title_of_the_page_is_signup() throws InterruptedException {
		prop=ConfigFileReader.readconfigfile();
		WebElement signupLabel=driver.findElement(By.xpath(prop.getProperty("label_signup")));
		Assert.assertEquals(signupLabel.getText(), "Sign up");
		
	}

	@Then("^user provides email and password$")
	public void user_provides_email_and_password(DataTable dt) throws InterruptedException {
		WebElement email=driver.findElement(By.xpath(prop.getProperty("input_email"))); 
		WebElement password=driver.findElement(By.xpath(prop.getProperty("input_password"))); 
		
	    for(Map<String,String> data :dt.asMaps(String.class, String.class)) {
	    email.sendKeys(data.get("email"));
		password.sendKeys(data.get("password"));
	    }
		
	}

	@Then("^user clicks on signup button$")
	public void user_clicks_on_signup_button() throws InterruptedException {
		WebElement signup=driver.findElement(By.xpath(prop.getProperty("button_signup")));
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click()", signup);
		
	}

	@SuppressWarnings("deprecation")
	@Then("^user is on TestAddressBook home page$")
	public void user_is_on_TestAddressBook_home_page() throws InterruptedException {
		WebElement label_homepage=driver.findElement(By.xpath(prop.getProperty("label_homepage")));
		Assert.assertEquals(label_homepage.getText(), "Welcome to Address Book");
		
	}

	
	
}
