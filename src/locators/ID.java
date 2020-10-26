package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
WebDriver driver = new 	ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys("Toni");
		//driver.findElement(By.id("email")).sendKeys("survi");


	}

}
