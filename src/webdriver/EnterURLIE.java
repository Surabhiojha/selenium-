package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EnterURLIE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "E:/IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		//driver.get("https://www.gmail.com");
driver.navigate().to("https://www.gmail.com");
}
}