package week2.day1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class Createleads {
		
	private static final WebElement Source = null;
	private static final WebElement MarketingCampaign = null;
	private static final WebElement PreferredCurrency = null;
	private static final WebElement Industry = null;
	private static final WebElement Ownership = null;
	private static final WebElement Province = null;

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
				driver.findElement(By.linkText("Leads")).click();
				
				//Click on Create Leads tab
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter Company Name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				
				//Enter First Name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Testleaf");
				
				//Enter Last Name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shankari");
				

				WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
				//Create object for Select class
				Select dropdown = new Select (source);
				
		        dropdown.selectByIndex(3)	;
		        WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		      //Create object for Select class
				Select category = new Select (marketingCampaign);
				
		        dropdown.selectByIndex(3)	;        

				//Enter First Name Local
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Testleaf");
				
				//Enter Last Name Local
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Shankari");

				//Enter Salutation
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Self");

				//Enter Birthday
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/19/92");
		        

				//Enter Title
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");

				//Enter Department
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
				

				//Enter Annual Revenue
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("xyz");
				
				 //Create object for Select class
				   WebElement preferredCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
				Select money = new Select (preferredCurrency);

		        money.selectByIndex(4)	;   
		        
				 //Create object for Select class
		 	   WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select department = new Select (industry);
				
		        department.selectByIndex(5)	;        
		        
				//Enter Annual Revenue
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("12");
				
				//Create object for Select class

			 	   WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select partnership = new Select (Ownership);
				
				partnership.selectByIndex(5)	;  
		        
				//Enter SIC Code
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");

				//Enter Ticket Symbol
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("12");
				
				//Enter Description	
				driver.findElement(By.id("createLeadForm_description")).sendKeys("abcdefgh");
				

				//Enter Important Note	
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("poverty");
				

				//Enter Country Code	
				driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("123");

				//Enter Area code	
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("456");

				//Enter Phone Number	
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
				
				//Enter Extension
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0442644789");

				//Enter Person to ask for
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Unknown");
				
				//Enter value in Email address field
				WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
				primaryEmail.sendKeys("babu@testleaf.com");
				String primaryEmailValue= primaryEmail.getAttribute("value");
				System.out.println(primaryEmailValue);
		       
				
				//Primary Address
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Unknown");
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Narayanan");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3/312-1");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Hill View Nagar");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Coimbatore");
				

				 //Create object for Select class


			 	   WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));	
				Select state = new Select (province);
				
		        state.selectByIndex(5)	;  
		        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("00222");
		        driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("12345");
		        
				// Click on Create Contact button
				driver.findElement(By.name("submitButton")).click();
				
				
				//Click the browser
				driver.close();
			
			}
		}

