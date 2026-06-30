package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A004_worldometers {
	public static void main(String[] args) {
		String foodName="";
		String countryName="";
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.worldometers.info/geography/countries-of-the-world/");
       driver.findElement(By.xpath("//div[@class='hidden w-full items-center justify-between md:flex']/div/div")).click();
       
       List<WebElement> options = driver.findElements(By.xpath("//div[@x-show='open']/a[contains(@id,'dropdown-menu-1')]"));
       for(WebElement e : options) {
    	   if(e.getText().trim().equalsIgnoreCase("Food & Agriculture")) {
    		 e.click();
    		   break;
    	   }
       }
       
     List<WebElement> country = driver.findElements(By.xpath("//h2[text()='Country Food & Agriculture Profiles:']/following-sibling::ul/li/a"));
     for(WebElement e : country) {
    	      if(e.getText().trim().equalsIgnoreCase("india")) {
    	    	  e.click();
    	    	  break;
    	      }
     }
     
     Actions action = new Actions(driver);
     action.scrollByAmount(0,  1000).perform();
     
     List<WebElement> graphData = driver.findElements(By.xpath("//div[@id='country-undernourished-chart']/div//*[name()='svg']//*[name()='path' and @fill='#FF3300']"));
     for(WebElement e : graphData) {

    	    action.moveToElement(e).pause(Duration.ofSeconds(1)).perform();

    	    WebElement tooltip = driver.findElement(
    	        By.xpath("//*[contains(@class,'highcharts-tooltip')]")
    	    );

    	    System.out.println(tooltip.getText());
    	}
     driver.quit();
	}
}
