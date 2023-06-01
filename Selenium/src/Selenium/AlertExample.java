package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// Alert Message Handling
		System.setProperty("webdriver.Edge.driver","C:\\Users\\MIRS0001\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		
		//Alert for simple dialog
		
		WebElement simpleAlert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
		simpleAlert.click();
		Alert alert = driver.switchTo().alert();
	Thread.sleep(4000);
		alert.accept();

		WebElement confirmationAlert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		confirmationAlert.click();
		Alert Alert1 = driver.switchTo().alert();
		Thread.sleep(4000);
		Alert1.accept();
		
		//WebElement sweetAlert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']/span[2]"));
		
	/*	sweetAlert.click();
		Alert Alert2 = driver.switchTo().alert();
	Alert2.accept() 
		
	WebElement modalAlert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span"));
		
		modalAlert.click();
		Alert Alert3 = driver.switchTo().alert();
		Alert3.dismiss(); */
		
		WebElement promptAlert = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
		promptAlert.click();
		Alert Alert4 = driver.switchTo().alert();
		Alert4.sendKeys("Mohammed ");
		Alert4.accept();
		
	}

}
