package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 
{
	public static void main(String[] args) throws InterruptedException
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver",
				"E:\\batch240\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html");
		Thread.sleep(5000);
		String t=driver.getTitle();
		System.out.println(t);
		//Close site
		driver.close();

	}

}
