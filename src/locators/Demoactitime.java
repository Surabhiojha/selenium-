package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoactitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.name("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
			driver.findElement(By.id("keepLoggedInCheckBox")).click();
			driver.findElement(By.id("loginButton")).click();

	}

}
