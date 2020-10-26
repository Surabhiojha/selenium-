package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefersh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().to("https://www.myntra.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
