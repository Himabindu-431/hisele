import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class avtitym {
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
        Thread.sleep(10000);
        
        WebElement que = driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']"));
        que.click();
        
        WebElement quee = driver.findElement(By.xpath("//a[@onclick='MenuHandler.openAbout(); return false;']"));
        quee.click();
        
        
}
	
	
}