package handlingPoopus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPoopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("http://www.americanairlines.in");
		driver.findElement(By.xpath("(//input[@class='aaDatePicker hasDatepicker'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='28'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='aaDatePicker hasDatepicker'])[2]")).click();
		//driver.findElement(By.xpath("//a[.='17']")).click();
		for(int i=0;i<8;i++) 
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		driver.findElement(By.xpath("//a[.='17']")).click();
		}


	}


