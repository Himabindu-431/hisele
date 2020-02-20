import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot_demo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_T);
       r.keyRelease(KeyEvent.VK_CONTROL);
          r.keyRelease(KeyEvent.VK_T);
          WebElement search=driver.findElement(By.name("q"));
          search.sendKeys("java");
          Robot r1=new Robot();
          r1.keyPress(KeyEvent.VK_ENTER);
         // WebElement copy=driver.findElement(By.)
          
}
}