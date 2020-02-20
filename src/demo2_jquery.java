import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo2_jquery {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Actions a = new Actions(driver);
		WebElement f=driver.findElement(By.xpath(""));
		driver.switchTo().frame(f);
		WebElement ele1=driver.findElement(By.id("draggable"));
		WebElement ele2=driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		a.dragAndDrop(ele1,ele2).perform();System.out.println(driver.findElement(By.id("droppable")).getText());

		/*
		WebElement ele=driver.findElement(By.xpath("//li/a[contains(.,'Droppable')]"));
		ele.click();
		driver.switchTo().frame(ele);

		
		WebElement login=driver.findElement(By.id("dropable"));

		Actions a = new Actions(driver);
		a.dragAndDropBy(login,150,0).perform();
		//login.getText();
		*/
	}
}
