package handlingPoopus;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeSwitchToNewWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		System.out.println(allwindows.size());
		ArrayList<String> al=new ArrayList<>();
		al.addAll(allwindows);
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[.='Try Free']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Surabhi");
		driver.findElement(By.id("last-name")).sendKeys("ojha");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("surabhi.ojha867@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Company']")).sendKeys("TCS");
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(al.get(0));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

}
