package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7
{
	public static void main(String[] args) throws InterruptedException
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch240\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("username")).sendKeys("9908028816");
		driver.findElement(By.name("password")).sendKeys("gopiveeru");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Send SMS']")).click();
		
		
		
		

	}

}
