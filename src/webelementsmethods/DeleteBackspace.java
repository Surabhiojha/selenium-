package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteBackspace {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("deepa");
		Thread.sleep(3000);
		/*username.sendKeys(Keys.CONTROL,"a");//it will select all
		//username.sendKeys(Keys.BACK_SPACE);
		username.sendKeys(Keys.DELETE);
*/
		for(int i=0;i<=5;i++)
		{
			username.sendKeys(Keys.BACK_SPACE);
		}
	}

}
