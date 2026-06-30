package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class A002_olympic {
	public static void main(String[] args) throws InterruptedException {
		String playerName="Jorge VIVAS PALACIOS";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
        driver.get("https://www.olympics.com/en/olympic-games/tokyo-2020");
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        driver.findElement(By.xpath("//a[@href='/en/olympic-games/tokyo-2020/results' and @class='primary']")).click();
        
        Actions action = new Actions(driver);
        action.scrollByAmount(0,  1400).perform();
        WebElement boxing = driver.findElement( By.xpath("//p[.='Boxing']") ); 
        boxing.click();
        
        driver.findElement(By.xpath("//button[@data-cy='event-select']")).click();
        driver.findElement(By.xpath("//p[text()=\"Men's Light Heavy (75-81kg)\"]")).click();
        driver.findElement(By.xpath("//a[@data-cy='go-link']")).click();
        
        action.scrollByAmount(0,  1400).perform();
        
        
      String countryName = driver.findElement(By.xpath(String.format("//div[@data-cy='table-content']/descendant::h3[text()='%s']/ancestor::div[@data-cy='athlete-image-name']/parent::div/preceding-sibling::div/div[@data-cy='flag-with-label']/descendant::span", playerName))).getText();
      System.out.println(playerName +"------------------------->"+countryName);
        
      driver.quit();
	}

	/*
	 * Navigate https://www.olympics.com/en/olympic-games/tokyo-2020  this URL  
home page is displayed. 
Next, click on the result button, 
scroll down the page  the select  Boxing  & click  next, (all text filed is dropdopwn )
click on the events text field the select  then select the men’s light heavy (75- 81 kg)(changing the events also should work )
Click on the Go button, 
next scroll down the page below, then see the points  table (write a dynamic xpath ), 
enter the player name, it should display the player name and country

	 */
}




