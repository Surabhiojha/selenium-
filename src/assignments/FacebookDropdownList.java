package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdownList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Surabhi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ojha");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("surabhi.ojha867@gmail.com");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Surabhi8@");
		WebElement dropdownday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel=new Select(dropdownday);
		sel.selectByVisibleText("8");
		WebElement dropdownmonth=driver.findElement(By.xpath("//select[@id='month']"));
Select selmon=new Select(dropdownmonth);
selmon.selectByVisibleText("Nov");
WebElement dropdownyear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select selyear=new Select(dropdownyear);
selyear.selectByVisibleText("1993");
}
}
