package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TextBoxFillUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Working with text boxes

		System.setProperty("webdriver.Edge.driver",
				"C:\\Users\\MIRS0001\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/input.xhtml");

		// Enter the name in the text box
		WebElement name = driver.findElement(By.name("j_idt88:name"));
		name.sendKeys("Mohammed Irshath");

		//append text
		WebElement append = driver.findElement(By.name("j_idt88:j_idt91"));
		append.sendKeys(",Tamilnadu");

		//disabled box
		WebElement disabledbox = driver.findElement(By.className("col-12"));
		boolean disable = disabledbox.isDisplayed();
		System.out.println(disable);

		//clear text
		WebElement clear = driver.findElement(By.name("j_idt88:j_idt95"));
		clear.clear();

		//retr text
		WebElement retrieve = driver.findElement(By.name("j_idt88:j_idt97"));
		String retr = retrieve.getAttribute("value");
		System.out.println(retr);

		//append text
		WebElement email= driver.findElement(By.name("j_idt88:j_idt99"));
		email.sendKeys("irshath884@gmail.com");


	}

}
