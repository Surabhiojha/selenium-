package handlingPoopus;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriCognizant {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		System.out.println(allwindows.size());
		ArrayList<String> al= new ArrayList<>();
		al.addAll(allwindows);
		System.out.println(al.size());
		driver.switchTo().window(al.get(3));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@href='http://w28.naukri.com/advertiser/bms_hits.php?banner=7304970']")).click();
		for(String newWindow:driver.getWindowHandles()) {
			driver.switchTo().window(newWindow);
			System.out.println(driver.getTitle());
		}
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(al.get(3));
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		
	}
}

		

	


