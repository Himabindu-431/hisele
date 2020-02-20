import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class blustn2_10_plus_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
		
		WebElement connect = driver.findElement(By.xpath("//div[@class='gms-banner-inner']/strong"));
		connect.click();
	
		WebElement mailid=driver.findElement(By.xpath("//input[@id='Email']"));
		String email=mailid.getText();
		WebElement user=driver.findElement(By.id("Email"));
		user.sendKeys("himabindugovindu@gmail.com");
		
		WebElement buynow = driver.findElement(By.xpath("//input[@value='Start Now']"));
		buynow.click();
		
		Thread.sleep(10000);
		WebElement monthly=driver.findElement(By.xpath("//input[@name='amount']"));
		String amount=monthly.getText();
		WebElement amt=driver.findElement(By.name("amount"));
		amt.sendKeys("1200");
		
		//WebElement buynow2 = driver.findElement(By.xpath("//input[@value='Start Now']"));
		buynow.click();
}
}