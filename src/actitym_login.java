import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.Authentication.User;

public class actitym_login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(10000);
		
		//WebElement connect = driver.findElement(By.xpath("//div[@class='gms-banner-inner']/strong"));
		//connect.click();
	
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		String name=user.getText();
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
		String password=pwd.getText();
		WebElement pswd=driver.findElement(By.name("pwd"));
		pswd.sendKeys("manager");
		
		WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']/div"));
        login.click();
        
        
		//WebElement buynow = driver.findElement(By.xpath("//input[@value='Start Now']"));
		//buynow.click();

		//body[@class="gms-landing-page with-white-header no-footer-top    p-auto-play   no-ticker wh-scrollDown fixed-header fixed-white-header"]
		
		/*
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='gms-banner-inner']/strong"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		b
		/*
		for (WebElement menu : ele) {
			String item = menu.getText();
			System.err.println(item);
			a.moveToElement(menu).build().perform();
			Thread.sleep(2000);
}
*/
}
}