import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		// WebElement connect =
		// driver.findElement(By.xpath("//div[2]/a[1]/span[1]/span"));
		// connect.click();
		Thread.sleep(10000);
		WebElement connect = driver.findElement(By.xpath("//a[@class='google-auth']"));
		connect.click();
		// WebElement connect =
		// driver.findElement(By.xpath("//div[3]/div[3]/a[1]"));
		// connect.sendKeys("1234");
	}

}
