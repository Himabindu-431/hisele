import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urban_store {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);

		WebElement user = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		user.click();
		Thread.sleep(10000);
		
		WebElement store = driver.findElement(By.xpath("//a[@href='../../furniture-stores?src=header']"));
		store.click();
		
		WebElement view = driver.findElement(By.xpath("//button[@class='_1fVSi action-button _1njbS _1XfDi _3J6Eb']"));
		view.click();
	
		
		
		
	}
}