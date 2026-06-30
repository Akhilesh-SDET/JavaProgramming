package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A005 {
public static void main(String[] args) {
	String tabName="Medal results";
	String gameName="Boxing";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.bbc.com/sport/olympics/paris-2024/medals");
	driver.findElement(By.xpath(String.format("//span[text()='%s']", tabName))).click();
	WebElement dropDown = driver.findElement(By.xpath("//select[@id='discipline-selector']"));
	
	Select select = new Select(dropDown);
	select.selectByValue(gameName);
	
	List<WebElement> xyz = driver.findElements(By.xpath("//tbody/tr/td/descendant::div[@class='ssrcss-7dafha-DesktopNames e1dg50ic3']/div[@class='ssrcss-n40wtk-PrimaryName e1dg50ic1']"));

	List<WebElement> country = driver.findElements(By.xpath("//tbody/tr/td/descendant::div[@class='ssrcss-7dafha-DesktopNames e1dg50ic3']/div[@class='ssrcss-bsteyn-SecondaryName e1dg50ic0']"));
	for (int i = 0; i < xyz.size(); i++) {
	    System.out.println(xyz.get(i).getText() + " ---> " + country.get(i).getText());
	}	    
}
/**
 *  Navigate  https://www.bbc.com/sport/olympics/paris-2024/medals this URL  
It’s displayed  medal pages 
Then click on Medal result web element
Write a XPath for filtering the drop-down select (xpth should work on all options )
Select any the spots then click 
Print the all-winning country
 */
}
