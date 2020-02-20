import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.server.Authentication.User;

public class selectclass_fb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//fb day
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("27");
		
		//fb month
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(10);
		
		//fb year
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1994");
		
		//fetching all days(1 to 31 in console)
		
		List<WebElement> days=s.getOptions();
		for(WebElement day1:days)
		{
			System.out.println(day1.getText());
		}
	}
}