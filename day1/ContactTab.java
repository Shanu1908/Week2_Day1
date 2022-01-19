package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
import io.github.bonigarcia.wdm.WebDriverManager;


public class ContactTab {
	
public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Setup the driver
			WebDriverManager.chromedriver().setup();
			
			//Launch the browser

			ChromeDriver driver = new ChromeDriver();
			
			//maximize the url
		   driver.manage().window().maximize();
		   
		   //load the url
			driver.get("http://leaftaps.com/opentaps/control/login");

			//get the title
			String title = driver.getTitle();
			System.out.println(title);
			
			//Enter the UserName
			
			WebElement userName = driver.findElement(By.id("username"));
			
			userName.sendKeys("DemoSalesManager");
			
			//Enter the password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			//Click on Login button 
			driver.findElement (By.className("decorativeSubmit")).click();
			
			//Click on CRM/SFA link
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			//Click on Leads tab
			driver.findElement(By.linkText("Contacts")).click();
			
			//Click on Create Leads tab
			driver.findElement(By.linkText("Create Contact")).click();
			
			//Enter First Name
			driver.findElement(By.id("firstNameField")).sendKeys("Testleaf");
			
			//Enter Last Name
			driver.findElement(By.id("lastNameField")).sendKeys("Shankari");
			
			// Click on Create Contact button
			driver.findElement(By.name("submitButton")).click();
			
	
           //Print the First Name 
			System.out.println("Testleaf");
			
			//get the title
			String title1 = driver.getTitle();
			System.out.println(title1);
			
			//Click the browser
			driver.close();
		
		}
	}

