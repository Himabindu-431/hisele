import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
		public void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
			Thread.sleep(10000);
			
			WebElement coins = driver.findElement(By.xpath("//a[@title='Gold Coins']"));
			coins.click();
			Thread.sleep(1000);
			WebElement laxmicoins = driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-20gms,m']"));
			laxmicoins.click();
}
}


//a[@title="Gold Coins"]
//span[@data-p="l-gold-coins-weight-20gms,m"]