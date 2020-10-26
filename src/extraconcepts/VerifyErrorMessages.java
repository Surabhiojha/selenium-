package extraconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver = new 	ChromeDriver();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
/*JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].value='surabhi.ojhayahoo.com'", username);*/
//WebElement errormessage=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
WebElement errormessage=driver.findElement(By.xpath("//div[contains(text(),'Enter')]"));
String actualerrormessage=errormessage.getText();
//String expectederrormessage="somlata";
String expectederrormessage="Enter an email or phone number";

if(actualerrormessage.equalsIgnoreCase(expectederrormessage)) {
	System.out.println("both are matching");
}
else {
	System.out.println("both are not matching");
}

	}

}
