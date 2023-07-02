package mpack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Projectno1 {
    @SuppressWarnings("deprecation")
	@Test
	public void amazonsample() throws InterruptedException {
		
		 
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.get("https://www.amazon.in/");
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
	     driver.findElement(By.id("nav-search-submit-button")).click();
	     
	     driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span[class='a-size-medium a-color-base a-text-normal']")).click();
	        Set<String> windowid= driver.getWindowHandles();
	        Iterator<String> itr= windowid.iterator();
	        String mainwindow= itr.next();
	        String child= itr.next();
	        driver.switchTo().window(child);

	        driver.findElement(By.id("add-to-cart-button")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[aria-labelledby=\"attach-sidesheet-checkout-button-announce\"]")).click();
	        driver.findElement(By.id("ap_email")).sendKeys("8302818964");
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("ap_password")).sendKeys("98deepak58");
	        driver.findElement(By.id("signInSubmit")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.cssSelector("input[data-testid='Address_selectShipToThisAddress']")).click();
	        Thread.sleep(3000);
	        driver.quit();
	
	}

}
