package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/ICSS8/Automation/drivers/DropDownList.html");
WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='employees']"));
Select sel=new Select(dropdownlist);
sel.selectByValue("JU");
sel.selectByVisibleText("Reena");
sel.selectByIndex(4);
WebElement firstselected=sel.getFirstSelectedOption();
System.out.println(firstselected.getText());
/*List<WebElement>option=sel.getAllSelectedOptions();
System.out.println(option.size());
for(int i=0;i<option.size();i++) {
	System.out.println(option.get(i).getText());
}*/


	}

}
