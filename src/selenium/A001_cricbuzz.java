package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A001_cricbuzz {
static String playerName="Virat Kohli";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://www.cricbuzz.com/ ");
		driver.findElement(By.xpath("//a[text()='Rankings']")).click();
		driver.findElement(By.xpath("//div[text()='ODI']")).click();
////		Thread.sleep(3000);
//		
		String str = driver.findElement(By.xpath(String.format("//div[@class='bg-cbWhite']/descendant::a[@title='%s']/following-sibling::div", playerName))).getText();
		String country = driver.findElement(By.xpath(String.format("//div[@class='bg-cbWhite']/descendant::a[@title='%s']/descendant::div[@class='text-cbTxtGray text-sm']", playerName))).getText();
		System.out.println(str);
		System.out.println(country);
		driver.quit();
		
		
		
		
	}
}
