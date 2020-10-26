package handlingPoopus;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
//System.out.println(driver.getWindowHandle());
Set<String> allwindows=driver.getWindowHandles();
System.out.println(allwindows);
System.out.println(allwindows.size());
ArrayList<String> al= new ArrayList<>();
al.addAll(allwindows);
System.out.println(al.size());
driver.switchTo().window(al.get(1));
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(al.get(2));
driver.close();
System.out.println(driver.getTitle());//NoSuchWindowException



	}

}
