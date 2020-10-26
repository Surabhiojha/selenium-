package webdriver;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetSetBrowserSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","E:/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println(driver.manage().window().getSize());
		Dimension d= new Dimension(1200,500);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		
	}

}
