package new_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("tp123@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("12345678");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);
       System.out.println( driver.findElement(By.xpath("//p[@class='error']")).getText());
       driver.findElement(By.linkText("Forgot your password?")).click();
       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Teju");
       driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("tpatil@gmail.com");
       driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9689316056");
       Thread.sleep(1000);
       driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
       driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
       driver.findElement(By.id("inputUsername")).sendKeys("tp123@gmail.com");
       driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
       Thread.sleep(1000);
       driver.findElement(By.id("chkboxOne")).click();
       driver.findElement(By.id("chkboxTwo")).click();
       driver.findElement(By.className("signInBtn")).click();
       Thread.sleep(1000);
       System.out.println(driver.findElement(By.tagName("p")).getText());
       Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	}

}
