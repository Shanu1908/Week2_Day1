package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setup the driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser

		ChromeDriver driver = new ChromeDriver();
		
		//maximize the url
	   driver.manage().window().maximize();
	   
	   //load the url
		driver.get("https://www.myntra.com/");

		// hover on men
		driver.findElement(By.xpath("//input[contains(@class,'desktop-main']")).click();
		

}
}
