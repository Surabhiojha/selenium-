package extraconcepts;



import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtensions {

	public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addExtensions(new File("C:/Users/User/Downloads/extension_6_1_8_0.crx"));
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("https://www.google.com");

	}

}
