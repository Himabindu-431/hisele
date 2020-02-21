import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class kadas_bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);

		//WebElement user = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		//user.click();
		//Thread.sleep(10000);

		                 WebElement sel = driver.findElement(By.xpath(""));
             kadas.click();
             WebElement buy = driver.findElement(By.xpath("//input[@id='buy-now']"));
             a.doubleClick(buy).perform();
			
			
		}
	}

}//a[contains(.,'Rings')]/parent::li/descendant::ul[@class='odd-even-bg']/li

