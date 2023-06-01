package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Edge.driver","C:\\Users\\MIRS0001\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.bing.com/");
		//driver.quit();
		driver.findElement(By.name("q")).sendKeys("google"+Keys.ENTER);

	}

}
