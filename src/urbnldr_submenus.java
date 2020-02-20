import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbnldr_submenus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		//WebElement connect = driver.findElement(By.xpath("//div[2]/a[1]/span[1]/span"));
		//connect.click();
		WebElement user = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		user.click();
		Thread.sleep(10000);
		//WebElement connect = driver.findElement(By.xpath("//div[3]/div[3]/a[1]"));
	  //  connect.sendKeys("1234");	
		List<WebElement> menus=driver.findElements(By.xpath("//ul[@class='topnav bodytext']"));
	Actions a=new Actions(driver);
	for(WebElement item:menus)
	{
		System.out.println(item.getText());
		a.moveToElement(item).build().perform();
	}
	
	//submenu- Li/span[contains(.,'Living')]
	}

}
