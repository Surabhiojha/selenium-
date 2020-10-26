package handlingPoopus;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
System.out.println(driver.getWindowHandle());
Set<String> allwindows=driver.getWindowHandles();
System.out.println(allwindows);
	}

}
