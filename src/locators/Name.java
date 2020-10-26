package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
				driver.get("https://www.facebook.com");
				WebElement username=driver.findElement(By.name("email"));
				username.sendKeys("Alok");
	//driver.findElement(By.name("email")).sendKeys("alok");

	}

}
