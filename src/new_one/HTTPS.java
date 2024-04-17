package new_one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions o1 = new ChromeOptions();
		o1.setAcceptInsecureCerts(true);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(o1);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
       System.out.println (driver.getTitle());
        
	}

}
