package week2.day1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
		
	import io.github.bonigarcia.wdm.WebDriverManager;


	public class FindContacts {
		
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
				
				//Click on Find Contact tab
				driver.findElement(By.linkText("Find Contacts")).click();
				
				//Click on Email tab
				driver.findElement(By.linkText("Email")).click();
				
				//Enter value in Email address field
				WebElement emailAddress = driver.findElement(By.name("emailAddress"));
				emailAddress.sendKeys("babu@testleaf.com");
				String emailAddressValue= emailAddress.getAttribute("value");
				System.out.println(emailAddressValue);
			
				//Click Find Contacts
				driver.findElement(By.linkText("Find Contacts")).click();
				
				//Click the browser
				driver.findElement(By.linkText("Logout")).click();
			
			}
		}

