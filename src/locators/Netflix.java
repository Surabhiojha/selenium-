package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://www.netflix.com/in/login");
		//driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.name("userLoginId")).sendKeys("9695087574");
		driver.findElement(By.name("password")).sendKeys("surabhi");
		WebElement checkbox=driver.findElement(By.id("bxid_rememberMe_true"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", checkbox);
		
		WebElement link=driver.findElement(By.partialLinkText("Sign"));
		System.out.println(link.getText());
		link.click();
		//driver.findElement(By.partialLinkText("Need")).click();
		//WebElement checkbox=driver.findElement(By.id("bxid_rememberMe_true"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", checkbox);
		

	}}
