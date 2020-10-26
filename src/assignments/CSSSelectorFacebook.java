package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorFacebook {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://www.facebook.com");
	
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[data-type='text']")).sendKeys("surabhi");
		//driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("surabhi");
		//driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("surabhi");
		//driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("surabhi");

	}

}
