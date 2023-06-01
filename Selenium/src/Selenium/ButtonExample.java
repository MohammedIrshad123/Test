package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonExample {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.Edge.driver",
				"C:\\\\Users\\\\MIRS0001\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/button.xhtml");

		// find disabled button
		WebElement disabledbutton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean disbutton = disabledbutton.isDisplayed();
		System.out.println(disbutton);

		// find position of the button
		WebElement position = driver.findElement(By.id("j_idt88:j_idt94"));
		org.openqa.selenium.Point xypoint = position.getLocation();
		int xpoint = xypoint.getX();
		int ypoint = xypoint.getY();
		System.out.println("Value of x point is :" + xpoint + "Value of y point is :" + ypoint);

		// find color of the button
		WebElement color = driver.findElement(By.id("j_idt88:j_idt96"));
		String colorbutton = color.getCssValue("background");
		System.out.println("Colour of the button is :" + colorbutton);

		// find the height and width
		WebElement size = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("heigth of the button is" + height);
		System.out.println("width of the button is " + width);

		//click the home button
		//	WebElement home = driver.findElement(By.id("j_idt88:j_idt90"));
		//	home.click();

		//move the cursor
		WebElement move = driver.findElement(By.id("j_idt88:j_idt100"));
		Actions actions = new Actions(driver);
		actions.moveToElement(move).perform();
		//View the image 
		WebElement view = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		view.click();

	}

}
