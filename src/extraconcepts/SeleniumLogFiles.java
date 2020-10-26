package extraconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLogFiles {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.logfile", "./seleniumlogs/chromelog.txt/");
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();*/
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "./seleniumlogs/chromelog.txt/");
		System.setProperty("webdriver.gecko.driver", "E:/geckodriver.exe");
		WebDriver driver = new 	FirefoxDriver();
		
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		
	}

}
