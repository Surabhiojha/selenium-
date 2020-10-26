package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.myntra.com");
		String title=driver.getTitle();
		System.out.println(driver.getTitle());
//driver.navigate().to("https://www.flipkart.com");

	}

}
