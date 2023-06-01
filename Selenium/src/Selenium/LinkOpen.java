package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\MIRS0001\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new 	EdgeDriver();
		driver.get("https://www.bing.com/ck/a?!&&p=0027d349b94521c8JmltdHM9MTY3NzE5NjgwMCZpZ3VpZD0zZWM4MzJjYy1jODNhLTYyYTYtMTk0OS0yMDY3Yzk4ODYzODEmaW5zaWQ9NTE4Ng&ptn=3&hsh=3&fclid=3ec832cc-c83a-62a6-1949-2067c9886381&psq=facebook&u=a1aHR0cHM6Ly93d3cuZmFjZWJvb2suY29tLw&ntb=1");
		driver.findElement(By.partialLinkText("FACEBOOK LOGIN")).click();


	}

}
