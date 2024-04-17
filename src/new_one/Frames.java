package new_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://jqueryui.com/droppable");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        
        WebElement target = driver.findElement(By.id("droppable"));

        a.dragAndDrop(source, target).build().perform();

	}

}
