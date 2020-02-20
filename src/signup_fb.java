import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup_fb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement name1=driver.findElement(By.xpath("//input[@name='firstname']"));
		String fstname=name1.getText();
		WebElement firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys("surada");
		
		WebElement name2=driver.findElement(By.xpath("//input[@name='lastname']"));
		String lstname=name2.getText();
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("alekya");
		
		WebElement mobileno=driver.findElement(By.xpath("//input[@id='u_0_r']"));
		String mbl=mobileno.getText();
		WebElement mobile=driver.findElement(By.id("u_0_r"));
		mobile.sendKeys("9611386306");
		Thread.sleep(1000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='u_0_w']"));
		String pwd=password.getText();
		WebElement pass=driver.findElement(By.id("u_0_w"));
		pass.sendKeys("alekya@1123");

		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='u_0_6']"));
		radiobtn.click();
		
		//fb day
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("17");
		
		//fb month
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(5);
		
		//fb year
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2004");
		
		WebElement signup=driver.findElement(By.xpath("//div/button[@name='websubmit']"));
		signup.click();
		
}


}



//input[@name="firstname"]
//input[@name="lastname"]
//input[@id="u_0_r"] mobile no
//input[@data-type="password"] pswd
//input[@value="1"] female
//div/button[@name="websubmit"] sign up