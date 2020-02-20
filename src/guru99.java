import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//input[@name='btnLogin']
		driver.get("http://demo.guru99.com/v1/index.php");
		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        login.click();
        Thread.sleep(1000);
        Alert a=driver.switchTo().alert();
        System.out.println(a.getText());
        
        a.accept();
       
        
      //div[@id="normalScreenIco"]
		
		
}
}