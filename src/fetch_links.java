import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch_links {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 WebElement search=driver.findElement(By.name("q"));
		 Thread.sleep(2000);
		 
		 search.sendKeys("java");
		 Thread.sleep(2000);
		 
	     Robot r1=new Robot();
	       r1.keyPress(KeyEvent.VK_ENTER);
		 
       List<WebElement> all=driver.findElements(By.xpath("//a"));
       for(WebElement suggestion:all)
       {
    	   System.out.println(suggestion.getText());
      
       }

       //links.size()
  
}
}