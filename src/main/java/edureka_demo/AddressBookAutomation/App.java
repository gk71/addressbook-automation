package edureka_demo.AddressBookAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		  ChromeOptions chromeOptions = new ChromeOptions();
		  WebDriver driver = new ChromeDriver(chromeOptions);
		  
		  String endPoint = "http://localhost:8080/addressbook";
		  System.out.println("Hitting the endpoint : " + endPoint);
		  driver.get(endPoint);
		  
		  String firstName = "Vidya";
		  String lastName = "Kasi";
		  String mob = "8979879230";
		  
		  
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  driver.findElement(By.className("v-button")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("gwt-uid-5")).sendKeys(firstName);
		  Thread.sleep(2000);
		  driver.findElement(By.id("gwt-uid-7")).sendKeys(lastName);
		  Thread.sleep(2000);
		  driver.findElement(By.id("gwt-uid-9")).sendKeys(mob);
		  driver.findElement(By.id("gwt-uid-11")).sendKeys("vidya@gmail.com");
		  driver.findElement(By.id("gwt-uid-13")).sendKeys("01/02/80");
		  Thread.sleep(2000);
		  driver.findElement(By.className("v-button-primary")).click();
		  System.out.println("Finihed saving contact in the app..");
		  driver.quit();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
      
      
        
    }
}
