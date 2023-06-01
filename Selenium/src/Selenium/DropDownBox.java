package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBox {

	public static void main(String[] args) {
		//select the dropdown 
		System.setProperty("webdriver.Edge.driver","C:\\Users\\MIRS0001\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/select.xhtml");

		WebElement dropdown = driver.findElement(By.className("ui-selectonemenu"));
		Select select = new Select(dropdown);
		select.selectByIndex(3);
		//select.selectByVisibleText("Selenium");
		//dropdown.sendKeys("Selenium");

		WebElement option = driver.findElement(By.id("j_idt87:country"));
				option.sendKeys("India");

		WebElement choose = driver.findElement(By.id("j_idt87:city"));
		choose.sendKeys("Delhi");
		

	}

}
