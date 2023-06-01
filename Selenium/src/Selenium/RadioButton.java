package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {
//Complete Radio button is not working
	
	public static void main(String[] args) {
		// Radio button 

		System.setProperty("webdriver.Edge.driver","C:\\Users\\MIRS0001\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://leafground.com/radio.xhtml");

		WebElement select = driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/div/div[2]/span"));
		select.click();

		//find default selected one
		WebElement default1 = driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[1]/div/div[2]/span"));
		boolean status=	default1.isSelected();
		System.out.println(status);

		WebElement default2 = driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[3]/div/div[2]"));
		boolean status1=	default2.isSelected();
		System.out.println(status1);


		WebElement default3 = driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[4]/div/div[2]/span"));
		boolean status2=	default3.isSelected();
		System.out.println(status2);
		
		
		//Select if not selected
		
		boolean a =true;
		WebElement notSelect = driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/label"));
		boolean noselect1= notSelect.isSelected();
		System.out.println(noselect1);
		
		WebElement notSelect1 = driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[2]/label"));
		boolean noselect2= notSelect1.isSelected();
		System.out.println(noselect2);
		
		WebElement notSelect2 = driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[3]/label"));
		boolean noselect3= notSelect2.isSelected();
		System.out.println(noselect3);
		
		
		if (noselect1=!a)
		{
			if(noselect1=!noselect3)
			{
				if(noselect1=!noselect2)
				{
					WebElement selectit = driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[3]/label"));
					selectit.click();
				}
			}
		}
		
		
	}
}
