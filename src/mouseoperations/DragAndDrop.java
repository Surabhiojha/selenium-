package mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement source=driver.findElement(By.xpath("//a[.=' SALES ']"));
		WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement sou=driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement tar=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
		act.dragAndDrop(sou, tar).perform();

	}

}
