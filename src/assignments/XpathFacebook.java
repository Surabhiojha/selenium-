package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		
		driver.get("https://www.facebook.com");
	driver.manage().window().maximize();

	}

}