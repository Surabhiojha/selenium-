package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("file:///E:/ICSS8/Automation/drivers/XpathTraversing.html");
		driver.manage().window().maximize();
		//html to hema
		driver.findElement(By.xpath("/html//div[3]/input[1]")).click();
		//body to sonata
		driver.findElement(By.xpath("//body//div[2]/input[2]")).click();
//somlata to jaya
		driver.findElement(By.xpath("//div[1]/input[1]/../../..//div[2]/input[1]")).click();
	}

}
