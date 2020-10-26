package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(5000);
driver.quit();
//driver.close();

	}

}
