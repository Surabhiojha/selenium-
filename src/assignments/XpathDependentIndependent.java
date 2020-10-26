package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDependentIndependent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qspiders.com/contact");
		String text=driver.findElement(By.xpath("//p[contains(text(),'Noida')]/../..//span[.='+919810072392']")).getText();
System.out.println(text);
	}

}