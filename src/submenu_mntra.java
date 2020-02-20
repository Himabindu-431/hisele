import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class submenu_mntra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(10000);

		/*WebElement user = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		user.click();
		Thread.sleep(10000); */

		List<WebElement> all = driver.findElements(By.xpath("//div[@class='desktop-navLink']/a"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		
		for (WebElement menu : all) {
			String item = menu.getText();
			System.err.println(item);
			a.moveToElement(menu).build().perform();
			Thread.sleep(2000);

		List<WebElement> submenus = driver.findElements(
					By.xpath("//a[contains(.,'Men')]/parent::div/descendant::ul[@class='desktop-navBlock']/li"));
		
		for (WebElement subitem : submenus) {
				System.out.println(subitem.getText());
			}
		}
	}

}
