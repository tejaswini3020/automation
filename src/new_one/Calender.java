package new_one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Calender {

	private static Object[] expectedList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String year = "2027";
		String date ="30";
		String month = "10";
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();

        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();

        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();

        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();

        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();

        List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for(int i =0; i<actualList.size();i++)

        {

        System.out.println(actualList.get(i).getAttribute("value"));

        //Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

        }

        driver.close();

        }



        }




        
        
        
        
  
