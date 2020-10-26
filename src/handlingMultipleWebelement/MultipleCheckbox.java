package handlingMultipleWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/ICSS8/Automation/drivers/MultipleElements.html");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		
		
		/*//click on all the links
		for(int i=0;i<checkbox.size();i++)
		{
			Thread.sleep(2000);
			checkbox.get(i).click();
		}*/
		//click on alternate checkbox
		/*for(int i=1;i<checkbox.size();i+=2)
		{
			Thread.sleep(2000);
			checkbox.get(i).click();
		}*/
		//click on alternate checkbox  in reverse order
		for(int i=checkbox.size()-1;i>=0;i-=2)
		{
			Thread.sleep(2000);
			checkbox.get(i).click();
		}
	}

}
