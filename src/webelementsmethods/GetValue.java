package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("deepa");
		System.out.println(username.getAttribute("value"));
		driver.findElement(By.id("pass")).sendKeys("mehtaaaaa");
		System.out.println(username.getAttribute("value"));
		//username.sendKeys("deepa");
		//System.out.println(username.getAttribute("value"));

	}

}
