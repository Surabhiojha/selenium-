package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BritishairwaysAutosuggestion {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.britishairways.com");
			driver.manage().window().maximize();
			WebElement searchbar=driver.findElement(By.xpath("//input[@id='from']"));
			searchbar.sendKeys("del");
			/*Thread.sleep(2000);
			List<WebElement> suggestions= driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
			System.out.println(suggestions.size());
			*/

	}

}
