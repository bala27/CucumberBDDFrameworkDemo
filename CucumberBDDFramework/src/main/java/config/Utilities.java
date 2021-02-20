package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
		
		WebDriver driver;
		
		public void invoke() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\OpenCart_BDDFramework\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		Thread.sleep(3000);
		}

}
