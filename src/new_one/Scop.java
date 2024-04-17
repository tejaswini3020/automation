package new_one;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        //1.links count on webPage by using tagname -> <a> and count use the size()
        System.out.println(driver.findElements(By.tagName("a")).size());
        
        //2.count of link in footer section
        WebElement minD = driver.findElement(By.id("gf-BIG"));//limiting webDriver concepts
       System.out.println(minD.findElements(By.tagName("a")).size());
       
       //3.link count of only 1st column
       WebElement c1 = minD.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
       System.out.println(c1.findElements(By.tagName("a")).size());
       
       
       //4.click on each link of column
       for(int i=1 ;i< c1.findElements(By.tagName("a")).size();i++ ) { 
    	 //each pages open in separte tab
    	   String clickLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
    	   c1.findElements(By.tagName("a")).get(i).sendKeys(clickLink); 
       }
    	 //getting title of that links
    	   
    	   Set<String> abc = driver.getWindowHandles();
    	 //  Iterator <String> it = abc.iterator();
    	  // while(it.hasNext()) {
    		 //  driver.switchTo().window(it.hasNext());
    		   System.out.println(driver.getTitle());
    		   
    	   }
    	   
    	   
    	   
       
       
      
       
       
       
       
       
       
	}
	

}
