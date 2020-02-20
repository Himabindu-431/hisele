import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class countrings_blustn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(10000);
			
	
         
		WebElement ring = driver.findElement(By.xpath("//a[@title='Rings']"));
		ring.click();
		
		
		//Thread.sleep(10000);

		List<WebElement> count = driver.findElements(By.xpath("//div[@class='product-buttons']//a"));
		System.out.println(count.size());
	/*	//Actions a = new Actions(driver);
		//Thread.sleep(2000);
	
		for (WebElement menu : ele) {
			String item = menu.getText();
			System.err.println(item);
			a.moveToElement(menu).build().perform();
			Thread.sleep(2000);

			WebElement diamond = driver.findElement(By.xpath("//a[@title='Diamond Rings']"));
             diamond.click();
             
             System.out.println(diamond.getSize());
          /*   WebElement sel = driver.findElement(By.xpath(""));
             kadas.click();
             WebElement buy = driver.findElement(By.xpath("//input[@id='buy-now']"));
             a.doubleClick(buy).perform();*/


}
}