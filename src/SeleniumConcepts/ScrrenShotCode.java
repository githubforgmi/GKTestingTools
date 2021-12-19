package SeleniumConcepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrrenShotCode {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String chromePath="C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		String chromeKey="webdriver.chrome.driver";
		
		String url="https://www.amazon.in";
		
		System.setProperty(chromeKey, chromePath);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("C:\\Users\\USER\\Documents\\Screenshots\\amazonHome.png");
		
		FileHandler.copy(screenshot, destFile);
		
		 
              
              Thread.sleep(7000);
              driver.close();

	}

}
