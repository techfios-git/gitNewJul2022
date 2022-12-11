package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void testLocators() throws InterruptedException {
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		//upload file
		//use Robot Class if the tags is not input 
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Dell\\Desktop\\Techfios Class\\Selenium\\Selenium\\Session 2.pptx");
		
		//link Text
		/*driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		driver.navigate().back();
		
		//partial link text
		driver.findElement(By.partialLinkText("Backend")).click();*/
		
		//css selector
		driver.findElement(By.cssSelector("input#exp-2")).click();
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("is fun");
		
//		driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();
		
		driver.findElement(By.cssSelector("input[id='profession-1'][value='Automation Tester']")).click();
		
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("abcdef");
		
		//xpath
//		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2' and @name='tool']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='tool-2' and @name='tool']")).click();
//		driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : Page Change')]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		
	}

}
