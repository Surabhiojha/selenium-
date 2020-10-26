package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/ICSS8/Automation/drivers/DropDownList.html");
WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='employees']"));
Select sel=new Select(dropdownlist);
sel.isMultiple();
System.out.println(sel.isMultiple());
//sel.selectByVisibleText("Reena");
//sel.selectByValue("JU");
//sel.selectByIndex(4);

	}

}
