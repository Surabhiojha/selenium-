package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/ICSS8/Automation/drivers/DropDownList.html");
WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='employees']"));
Select sel=new Select(dropdownlist);
sel.selectByVisibleText("Reena");
sel.selectByValue("JU");
sel.selectByIndex(4);
//sel.deselectAll();
//sel.deselectByVisibleText("Reena");
sel.deselectByValue("JU");

	}

}
