package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}

}
