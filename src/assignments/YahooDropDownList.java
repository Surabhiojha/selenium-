package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooDropDownList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Create")).click();
	}

}
