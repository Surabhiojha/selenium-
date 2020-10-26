package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterURLFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.myntra.com");
driver.navigate().to("https://www.flipkart.com");
	}

}
