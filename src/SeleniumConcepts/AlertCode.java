package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCode {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		String chromePath="C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		String chromeKey="webdriver.chrome.driver";
		
		String url="https://testautomationpractice.blogspot.com/";
		
		System.setProperty(chromeKey, chromePath);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		String alert="//button[text()='Click Me']";
		
		WebElement ele=driver.findElement(By.xpath(alert));
		ele.click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		//Thread.sleep(3000);
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		Thread.sleep(7000);
		
		driver.close();

	}

}
