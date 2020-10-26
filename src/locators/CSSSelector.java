package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.get("file:///E:/ICSS8/Automation/drivers/CSSSelector.html");
//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("somlata");
//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("somlata");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("surabhi");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("vivek");
	}

}
