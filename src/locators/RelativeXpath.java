package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("file:///E:/ICSS8/Automation/drivers/CSSSelector.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys("somlata");
		driver.findElement(By.xpath("//input[2]")).sendKeys("sarita");

	}

}
