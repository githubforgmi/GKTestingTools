package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcepts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
				
				ele.click();
				
				Thread.sleep(5000);
				
				String clickHereXpath="(//a[text()='Click Here'])[1]";
				
				String iframeButton="//li[text()='iFrame']";
				driver.findElement(By.xpath(iframeButton)).click();
				Thread.sleep(2000);
				
				//iframe[@name='globalSqa']
				String reqFrame="//iframe[@name='globalSqa']";
				
				String ddXpath="//span[@id='current_filter']";
				
				WebElement reqFrameEle=driver.findElement(By.xpath(reqFrame));
				
				driver.switchTo().frame(reqFrameEle);
				
				
				Thread.sleep(2000);
				
				System.out.println(driver.findElement(By.xpath(ddXpath)).getText()); // All
				
				
				
				driver.switchTo().defaultContent();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//span[text()='Demo Testing Site'])[2]")).click();
				

	}

}
