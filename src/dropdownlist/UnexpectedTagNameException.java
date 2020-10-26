package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnexpectedTagNameException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
WebElement dropdownlist=driver.findElement(By.xpath("(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[1]"));
Select sel=new Select(dropdownlist);
sel.selectByIndex(0);

	}

}
