import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class herokuap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String user="admin";
		String pass="admin";		
		String url="http://" + user+ ":" +pass+ "@the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		Thread.sleep(10000);
	
}
}