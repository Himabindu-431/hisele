import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(10000);
		
		WebElement user=driver.findElement(By.xpath("//input[@name='identifier']"));
		String Email=user.getText();
		WebElement username=driver.findElement(By.name("identifier"));
		username.sendKeys("himabindugovindu@gmail.com");
		
		WebElement next = driver.findElement(By.xpath("//span/span[@class='RveJvd snByac']"));
        next.click();
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		String password=pwd.getText();
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("8008838405");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement next2 = driver.findElement(By.xpath("//span/span[@class='RveJvd snByac']"));
        next2.click();
		
		/*WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
		String password=pwd.getText();
		WebElement pswd=driver.findElement(By.name("pwd"));
		pswd.sendKeys("manager");
		
		/*WebElement email = driver.findElement(By.xpath("//body[@id='yDmH0d']"));
		//String gmail=email.getText();
		WebElement user=driver.findElement(By.id("yDmH0d"));
		user.sendKeys("bindu.govindhu@gmail.com");
		
		/*
		WebElement pwd = driver.findElement(By.xpath("//body[@id='yDmH0d']"));
		String pswd=pwd.getText();
		WebElement pass=driver.findElement(By.id("Email"));
		pass.sendKeys("bindu.govindhu@gmail.com");
		
		/*
		WebElement mailid=driver.findElement(By.xpath("//input[@id='Email']"));
		String email=mailid.getText();
		WebElement user=driver.findElement(By.id("Email"));
		user.sendKeys("himabindugovindu@gmail.com");*/
		
}
}
	
//body[@id='yDmH0d'] email

//span/span[@class='RveJvd snByac'] next

//input[@type='password'] password

//span/span[@class='RveJvd snByac'] next

	//div[@aria-expanded="true"] compose
	
	//div/textarea[@aria-label='To'] to
	
	//div/input[@name='subjectbox'] subject
	
	//div[@id=':qb'] send button