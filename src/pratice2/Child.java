package pratice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Child
{
  public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bbc.com/sport/olympics/paris-2024/medals");
	driver.findElement(By.xpath("//span[text()='Medal results']")).click();
	
	WebElement dropDown = driver.findElement(By.xpath("//select[@id='discipline-selector']"));
	Select select = new Select(dropDown);
	select.selectByValue("Boxing");
	List<WebElement> players = driver.findElements(By.xpath("//tbody/tr/td/descendant::div[@class='ssrcss-7dafha-DesktopNames e1dg50ic3']/div[@class='ssrcss-n40wtk-PrimaryName e1dg50ic1']"));
	List<WebElement> countryName = driver.findElements(By.xpath("//tbody/tr/td/descendant::div[@class='ssrcss-7dafha-DesktopNames e1dg50ic3']/div[@class='ssrcss-bsteyn-SecondaryName e1dg50ic0']"));
	for(int i=0; i<players.size();i++) {
		System.out.print(players.get(i).getText()+"--------------------->");
		System.out.println(countryName.get(i).getText());
	}
	driver.quit();
}	
}  
