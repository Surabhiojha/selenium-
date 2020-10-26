package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.titleIs("somlata"));
		//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track" ));
		//wait.until(ExpectedConditions.titleContains("actiTIME - Enter "));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutlink")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='menu_icon'])[2]")));
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();


	}

}
