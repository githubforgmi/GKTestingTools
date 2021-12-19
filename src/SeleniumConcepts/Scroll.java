package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		

		String chromePath="C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		String chromeKey="webdriver.chrome.driver";
		
		String url="https://www.amazon.in";
		
		System.setProperty(chromeKey, chromePath);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Amazon Pay on Merchants']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		
		Thread.sleep(7000);
		driver.close();
		
	}

}
