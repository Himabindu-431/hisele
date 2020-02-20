import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch_demo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 WebElement search=driver.findElement(By.name("q"));
		 search.sendKeys("java");
		 
       List<WebElement> all=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
       for(WebElement suggestion:all)
       {
    	   System.out.println(suggestion.getText());
      all.get(3).click();
		
}
}
}