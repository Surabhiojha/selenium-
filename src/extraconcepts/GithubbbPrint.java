package extraconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubbbPrint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		System.out.println("I am a software engineer ");

	}

}
