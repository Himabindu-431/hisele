import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windwhadl_switchto {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukari.com/");
		
		System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>wins=driver.getWindowHandles();
		wins.remove(parent);
		driver.close();
		//System.out.println(driver.getClass());
		
		for(String win:wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			//System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			ArrayList<> a=new a
		}
}
}
	