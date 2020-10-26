package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://www.facebook.com");
		//WebElement  link =driver.findElement(By.partialLinkText("Forgotten"));
//link.click();
//System.out.println(link.getText());//Stale ElementReferenceException
//to overcome StaleElementReferenceException
WebElement newlink =driver.findElement(By.partialLinkText("Forgotten"));
System.out.println(newlink.getText());
newlink.click();

	}

}
