package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String dropdownXpath="//a[text()='DropDown']";
		
		String chromePath="C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		String chromeKey="webdriver.chrome.driver";
		
		String url="https://www.globalsqa.com/demo-site/";
		
		System.setProperty(chromeKey, chromePath);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath(dropdownXpath));
		ele.click();
		
		Thread.sleep(3000);
		
		String country_ddXpath="//div[@class='information closable']//following-sibling::p//select";
		
		WebElement ddWE=driver.findElement(By.xpath(country_ddXpath));
		
		Select dd=new Select(ddWE);
		dd.selectByVisibleText("Åland Islands");
		//dd.selectByValue("ALA");
		//dd.selectByIndex(2);
		
		Thread.sleep(7000);

	}

}
