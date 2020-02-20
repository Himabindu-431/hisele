import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cromoptns_redbus {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		
		//to disable notification popup 
		//****************************************
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		//*****************************************
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
}
}