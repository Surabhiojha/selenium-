package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		//driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//xpath by contains[dynamic attribute]
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("kavita");
		//xpath by contains[dynamic text]
//driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		driver.get("https:/login.yahoo.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@autocomplete,'given')]")).sendKeys("surabhi");
	}

}
