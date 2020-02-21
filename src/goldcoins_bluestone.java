import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class goldcoins_bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
			
	
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
	
		for (WebElement menu : ele) {
			String item = menu.getText();
			System.err.println(item);
			a.moveToElement(menu).build().perform();
			Thread.sleep(2000);

			WebElement kadas = driver.findElement(By.xpath("//a[@title='Coins']"));
             kadas.click();

         
		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions a = new Actions(driver);
Thread.sleep(1000);
	/*	
		WebElement gram_20 = driver.findElement(By.xpath("//a[@title='Coins']"));
		gram_20.click();
		
		
		
		
		//Thread.sleep(10000);

	
		List<WebElement> ele = driver.findElements(By.xpath("a[@title='Gold Coins']"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
	
		WebElement coins = driver.findElement(By.xpath("//a[@title='Gold Coins']"));
		coins.click();
		
		WebElement laxmicoins = driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-20gms,m']"));
		laxmicoins.click();*/
}
}
