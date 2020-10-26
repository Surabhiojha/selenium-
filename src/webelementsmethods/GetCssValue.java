package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement username=driver.findElement(By.id("email"));
	System.out.println(username.getCssValue("font-size"));
	System.out.println(username.getCssValue("font-family"));
	System.out.println(username.getCssValue("color"));
	
	

	}

}
