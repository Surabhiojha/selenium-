package handlingMultipleWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/ICSS8/Automation/drivers/MultipleElements.html");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println(links.size());   //it shows no of links present in webpage
		//System.out.println(links.get(0).getText());
		//System.out.println(links.get(1).getText());              //it shows the text of the link
		//System.out.println(links.get(2).getText());
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}

	}

}
