import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logout_actitime {
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
       WebDriverWait ww=new WebDriverWait(driver, 10);
      ww.until(ExpectedConditions.attributeContains(By.id("logoutLink"),"class","logout"));
     
      WebElement logout = driver.findElement(By.xpath("//a[@id='logoutLink']"));
      logout.click();

}
}