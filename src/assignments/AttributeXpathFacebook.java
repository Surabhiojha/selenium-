package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeXpathFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("surabhi");
		//driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("sura");
driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy'][@aria-label='Email address or phone number']")).sendKeys("surabhi");

	}

}
