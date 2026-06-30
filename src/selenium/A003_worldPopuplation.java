package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A003_worldPopuplation {
public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
     driver.get("https://www.worldometers.info/world-population/");
     driver.findElement(By.xpath("//a[@href='#country']")).click();
     //driver.findElement(By.xpath("//div[@class='datatable-wrapper datatable-loading no-footer sortable searchable fixed-columns']/descendant::div[@class='datatable-search']/input")).sendKeys("Holy");
     
     
     boolean flag = true;

     while(flag) {

         List<WebElement> allcountry = driver.findElements(
                 By.xpath("//span[text()='Country (or dependency)']/ancestor::table/tbody/tr/descendant::a"));

         for(WebElement e : allcountry) {

             if(e.getText().trim().equals("Holy See")) {
                 System.out.println(e.getText());
                 flag = false;
                 break;
             }
         }
         if(!flag) {
             break;
         }

         driver.findElement(By.xpath("//button[text()='›']")).click();   
     }
     driver.quit();
	}
/**
 *  Navigate  https://www.worldometers.info/world-population/  this URL 
   home  page is displayed  in this home page search World Population by Country
  To check  Holy See country is present on the first page of the print  World
  Share otherwise go to the next page, again check holy see country 
      Continue the iteration up to the last page
 */
}

