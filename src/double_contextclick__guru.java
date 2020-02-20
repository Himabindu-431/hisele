import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_contextclick__guru {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions a = new Actions(driver);
		//WebElement f=driver.findElement(By.xpath("http://demo.guru99.com/test/simple_context_menu.html"));
		//a.doubleClick(f).perform();
		WebElement ele=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		a.contextClick(ele).perform();
	}
}
