package interviewBasedJavaProgramming;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class General002_BrokenLink {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		System.out.println(list.size());
		for(WebElement e : list) {
			String href = e.getAttribute("href");
			if(href==null || href.isEmpty()) {
				continue;
			}
			URL url = new URL(href);
			URLConnection conn =url.openConnection();
			HttpsURLConnection https = (HttpsURLConnection)conn;
			int status = https.getResponseCode();
			if(status>400) {
				System.out.println("Broken Link");
			}
			
			
		}
		
		
	}
}
