package SeleniumConcepts;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultileWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String chromePath="C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		String chromeKey="webdriver.chrome.driver";
		
		String url="https://www.globalsqa.com/demo-site/";
		
		System.setProperty(chromeKey, chromePath);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		String windowsXpath="//a[text()='Windows']";
		
		WebElement ele=driver.findElement(By.xpath(windowsXpath));
		
		if(ele.isDisplayed()) {
			System.out.println("isDisplayed");
		}
		
		
		ele.click();
		
		Thread.sleep(5000);
		
		String clickHereXpath="(//a[text()='Click Here'])[1]";
		
		String mainWindow=driver.getWindowHandle();
		
		String mainWindowTitle=driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(clickHereXpath)).click();
		
		Thread.sleep(5000);
		
		Set<String>  allWindows= driver.getWindowHandles();
		
		
		
		for(String windowname:allWindows) {
			
			driver.switchTo().window(windowname);
			
			Thread.sleep(5000);
			
			System.out.println(driver.getTitle());
			
		}
		
		//driver.switchTo().window(mainWindow);
		
		//driver.switchTo().defaultContent();
		
		//driver.close();
		

	}

}
