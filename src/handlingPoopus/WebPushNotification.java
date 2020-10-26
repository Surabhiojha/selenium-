package handlingPoopus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebPushNotification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---disable-notifications");
		WebDriver driver = new 	ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("http://www.redbus.in");
		driver.manage().window().maximize();
		

	}

}
