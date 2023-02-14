package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Expedia {
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
	
		driver=new ChromeDriver();

}

	@BeforeMethod
	public void url(){
		
		driver.get("https://www.expedia.com/");
		
	}
	
	@Test
	public void test1(){
		driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin\"]")).sendKeys("brussels",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination\"]")).sendKeys("newyork",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[3]/div/div")).click();
		WebElement age=driver.findElement(By.xpath("//*[@id=\"child-age-input-0-0\"]"));
		Select agedetails=new Select(age);
		agedetails.selectByVisibleText("3");
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"preferred-class-input-trigger\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]/span")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
	    while(true) {
	    	
	    	WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
	    	
	    	String month1=month.getText();
	    	if(month1.equals("February 2023")) {
	    		break;
	    		
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
	    	}
	    }
	    
	    List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\"app-layer-datepicker-flights-departure-arrival-start\"]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr[2]/td[4]"));
		
		for(WebElement dateelement:alldates1) {
			String date=dateelement.getAttribute("data-day");
			System.out.println(date);
			if(date.equals("18")) {
				dateelement.click();
				System.out.println("date selected");
			}
		}
		driver.findElement(By.xpath("//*[@id=\"app-layer-datepicker-flights-departure-arrival-end\"]/div[2]/div/div/div[3]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"d2-btn\"]")).click();
	    while(true) {
	    	
	    	WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
	    	
	    	String month1=month.getText();
	    	if(month1.equals("April 2023")) {
	    		break;
	    		
	    	}
	    	else
	    	{
	    		driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
	    	}
	    }
	    
	    List<WebElement> alldates2=driver.findElements(By.xpath("//*[@id=\"app-layer-datepicker-flights-departure-arrival-start\"]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr[2]/td[4]"));
		
		for(WebElement dateelement:alldates2) {
			String date=dateelement.getAttribute("data-day");
			System.out.println(date);
			if(date.equals("18")) {
				dateelement.click();
				System.out.println("date selected");
			}
		}
		driver.findElement(By.xpath("//*[@id=\"app-layer-datepicker-flights-departure-arrival-end\"]/div[2]/div/div/div[3]/button")).click();
	}
}
