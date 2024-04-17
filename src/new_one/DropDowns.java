package new_one;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       WebElement statictdop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
       //static dropdown
       Select dopdown = new Select(statictdop);
       dopdown.selectByIndex(3);
        System.out.println(dopdown.getFirstSelectedOption().getText());
        dopdown.selectByVisibleText("AED");
        System.out.println(dopdown.getFirstSelectedOption().getText());
        dopdown.selectByValue("INR");
        System.out.println(dopdown.getFirstSelectedOption().getText());
        //dunamic dropdown
        driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
        driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
        
        
        
      

	}

}
