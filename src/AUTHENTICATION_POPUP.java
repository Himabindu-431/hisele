import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTHENTICATION_POPUP {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(10000);
		WebElement choose = driver.findElement(By.id("file_wraper0"));
		choose.click();
		Thread.sleep(2000);
		Runtime r = Runtime.getRuntime();
		r.exec("‪C:\\Users\\Arjun\\Desktop\\scite.exe");
	}
}