import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit_explicit {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicity(thread.sleep)
	
WebElement search=driver.findElement(By.name("q"));
//search.sendKeys("java");
search.sendKeys("java",Keys.ENTER);
WebDriverWait ww=new WebDriverWait(driver, 10);
ww.until(ExpectedConditions.attributeContains(By.name("q"),"value","java"));
//ww.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[@target='_top']"),"sign in"));



System.out.println("search completed");
}
}