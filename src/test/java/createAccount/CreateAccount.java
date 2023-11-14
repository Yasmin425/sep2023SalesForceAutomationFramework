package createAccount;

import java.awt.AWTException;
import java.awt.Window;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;

public class CreateAccount extends BaseTest{
	
	@Test
	
	
public static void CreatingAccount() throws InterruptedException{
		
	    System.out.println("******logout_to_Salesforce automation script started***********");
	     
		String expected="Yasmin Yassin";
		String expected2="Yasmin Yassin";
		String expected3="Nicholas Morris";
		String expected4="new";
		
		System.out.println("url is entered");

	
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, "User Name textbox");
		enterText(usernameEle,"yasmin@tekarch.com","username");
		
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,"TGByhn@123","password");
	
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		
		Thread.sleep(5000);
		
		  WebElement UserMenuEle= driver.findElement(By.id("userNavLabel"));
		  waitForVisibility(UserMenuEle, 5, "Home page"); 
		  String actual= UserMenuEle.getText();
		  System.out.println("text is extracted from Home tab element");
		  Assert.assertEquals(actual, expected,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  WebElement AccountTabEle= driver.findElement(By.id("Account_Tab"));
		  clickElement(AccountTabEle,"Account Tab");
		  
		  WebElement AccountPageEle= driver.findElement(By.xpath("//*[@id=\"mru005Hr00000EMi9E\"]/a/span"));
		  waitForVisibility(AccountPageEle, 5, "Account Page"); 
		  String actual2= AccountPageEle.getText();
		  System.out.println("text is extracted from Account Pag element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  WebElement NewButtonEle= driver.findElement(By.name("new"));
		  clickElement(NewButtonEle,"New Button");
		  
		  WebElement AccountNameEle = driver.findElement(By.xpath("//*[@id=\"acc2\"]"));
		  enterText(AccountNameEle,"Nicholas Morris","Account Name ");
		  
		  WebElement TypedropdownEle=driver.findElement(By.id("acc6"));
		  selectByIndexData(TypedropdownEle,6,"Technology partner selection");
		  
		  WebElement CustomerPrioritydropdownEle=driver.findElement(By.id("00NHr00000IHKUe"));
		  selectByIndexData(CustomerPrioritydropdownEle,1,"High Priority selection");
		 
		  WebElement SaveButtonEle= driver.findElement(By.name("save"));
		  clickElement(SaveButtonEle,"Save Button");
		  
		  WebElement NewAccountPageEle= driver.findElement(By.xpath("//*[@id=\"contactHeaderRow\"]/div[2]/h2"));
		  waitForVisibility(NewAccountPageEle, 5, "New Account Page"); 
		  String actual3= NewAccountPageEle.getText();
		  System.out.println("text is extracted from New Account Pag element");
		  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  Thread.sleep(2000);
}

	@Test
	
    public static void CreatingNewView() throws InterruptedException{
		//Not completed validating the last line of test step 
	    System.out.println("******logout_to_Salesforce automation script started***********");
	     
		String expected="Yasmin Yassin";
		String expected2="Yasmin Yassin";
		String expected3="view";
		
		System.out.println("url is entered");

	
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, "User Name textbox");
		enterText(usernameEle,"yasmin@tekarch.com","username");
		
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,"TGByhn@123","password");
	
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		
		Thread.sleep(5000);
		
		  WebElement UserMenuEle= driver.findElement(By.id("userNavLabel"));
		  waitForVisibility(UserMenuEle, 5, "Home page"); 
		  String actual= UserMenuEle.getText();
		  System.out.println("text is extracted from Home tab element");
		  Assert.assertEquals(actual, expected,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  WebElement AccountTabEle= driver.findElement(By.id("Account_Tab"));
		  clickElement(AccountTabEle,"Account Tab");
		  
		  WebElement AccountPageEle= driver.findElement(By.xpath("//*[@id=\"mru005Hr00000EMi9E\"]/a/span"));
		  waitForVisibility(AccountPageEle, 5, "Account Page"); 
		  String actual2= AccountPageEle.getText();
		  System.out.println("text is extracted from Account Pag element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  WebElement CreateNewViewLinkEle= driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		  clickElement(CreateNewViewLinkEle,"Create New View Link");
		  
		  WebElement ViewNameTextBoxEle = driver.findElement(By.id("fname"));
		  enterText(ViewNameTextBoxEle,"view","View Name Text Box");
			
		  WebElement ViewUniqueNameTextBoxEle = driver.findElement(By.id("devname"));
		  enterText(ViewUniqueNameTextBoxEle,"view","View Unique Name Text Box");
		  
		  WebElement SaveButtonEle= driver.findElement(By.name("save"));
		  clickElement(SaveButtonEle,"Save Button");
		  
		  Thread.sleep(2000);
		  //driver.navigate().refresh();
			/*
			 * WebElement ViewDropdownEle=
			 * driver.findElement(By.xpath("//*[@id=\"00BHr00000Amuor_listSelect\"]"));
			 * clickElement(ViewDropdownEle,"View Dropdown");
			 */
		  Thread.sleep(2000);
		  WebElement NewAddedviewEle= driver.findElement(By.xpath("//*[@id=\"00BHr00000Amuor_listSelect\"]"));
		  waitForVisibility(NewAddedviewEle, 5, "New Added view Ele"); 
		  String actual3= NewAddedviewEle.getText();
		  System.out.println("text is extracted from New Added view element");
		  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		
		  
		
}
	@Test
	
	 public static void EditingView() throws InterruptedException{
			//Not completed validating the last line of test step
		
		    System.out.println("******logout_to_Salesforce automation script started***********");
		     
			String expected="Yasmin Yassin";
			String expected2="Yasmin Yassin";
			String expected3="view";
			
			System.out.println("url is entered");

		
			WebElement usernameEle = driver.findElement(By.id("username"));
			waitForVisibility(usernameEle, 5, "User Name textbox");
			enterText(usernameEle,"yasmin@tekarch.com","username");
			
			WebElement passwordEle = driver.findElement(By.id("password"));
			enterText(passwordEle,"TGByhn@123","password");
		
			WebElement buttonEle=driver.findElement(By.id("Login"));
			clickElement(buttonEle,"login button");
			
			Thread.sleep(5000);
			
			  WebElement UserMenuEle= driver.findElement(By.id("userNavLabel"));
			  waitForVisibility(UserMenuEle, 5, "Home page"); 
			  String actual= UserMenuEle.getText();
			  System.out.println("text is extracted from Home tab element");
			  Assert.assertEquals(actual, expected,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  WebElement AccountTabEle= driver.findElement(By.id("Account_Tab"));
			  clickElement(AccountTabEle,"Account Tab");
			  
			  WebElement AccountPageEle= driver.findElement(By.xpath("//*[@id=\"mru005Hr00000EMi9E\"]/a/span"));
			  waitForVisibility(AccountPageEle, 5, "Account Page"); 
			  String actual2= AccountPageEle.getText();
			  System.out.println("text is extracted from Account Pag element");
			  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  WebElement EditLinkEle=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[1]"));
			  clickElement(EditLinkEle,"Edit Link Ele");
			  
			  WebElement ViewNameEle = driver.findElement(By.id("fname"));
			  enterText(ViewNameEle,"New Test name","View Name Text box element");
			  
			  WebElement OperatordropdownEle=driver.findElement(By.id("fop1"));
			  selectByIndexData(OperatordropdownEle,4,"Contains selection");
			  
			  WebElement ValueTextdownEle = driver.findElement(By.id("fval1"));
			  enterText(ValueTextdownEle,"a","Value Text box element");
	
			  WebElement SaveButtonEle= driver.findElement(By.name("save"));
			  clickElement(SaveButtonEle,"Save Button");
			 
			  
			
	 }
	
	@Test
	
	 public static void MergeAccounts() throws InterruptedException{
			
		
		    System.out.println("******logout_to_Salesforce automation script started***********");
		     
			String expected="Yasmin Yassin";
			String expected2="Yasmin Yassin";
			String expected3="Merge My Accounts";
			String expected4="Nicholas Morris";
			Alert alert=null;
			
			System.out.println("url is entered");

		
			WebElement usernameEle = driver.findElement(By.id("username"));
			waitForVisibility(usernameEle, 5, "User Name textbox");
			enterText(usernameEle,"yasmin@tekarch.com","username");
			
			WebElement passwordEle = driver.findElement(By.id("password"));
			enterText(passwordEle,"TGByhn@123","password");
		
			WebElement buttonEle=driver.findElement(By.id("Login"));
			clickElement(buttonEle,"login button");
			
			Thread.sleep(5000);
			
			  WebElement UserMenuEle= driver.findElement(By.id("userNavLabel"));
			  waitForVisibility(UserMenuEle, 5, "Home page"); 
			  String actual= UserMenuEle.getText();
			  System.out.println("text is extracted from Home tab element");
			  Assert.assertEquals(actual, expected,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  WebElement AccountTabEle= driver.findElement(By.id("Account_Tab"));
			  clickElement(AccountTabEle,"Account Tab");
			  
			  WebElement AccountPageEle= driver.findElement(By.xpath("//*[@id=\"mru005Hr00000EMi9E\"]/a/span"));
			  waitForVisibility(AccountPageEle, 5, "Account Page"); 
			  String actual2= AccountPageEle.getText();
			  System.out.println("text is extracted from Account Pag element");
			  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  WebElement MergeAccountsLinkEle=driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
			  clickElement(MergeAccountsLinkEle,"Merge Accounts Link Ele");
			  
			  WebElement AccountNameTextboxEle = driver.findElement(By.id("srch"));
			  enterText(AccountNameTextboxEle,"Nicholas Morris","Account Name Text box element");
			  
			  WebElement FindAccountsButtonEle= driver.findElement(By.name("srchbutton"));
			  clickElement(FindAccountsButtonEle,"Find Accounts Button");
			  
			  WebElement NextButtonEle= driver.findElement(By.name("goNext"));
			  clickElement(NextButtonEle,"Next Button");
			  
			  Thread.sleep(2000);

			  WebElement MergeAccountsPageEle= driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div/div[1]/div[1]/h1"));
			  waitForVisibility(MergeAccountsPageEle, 5, "Merge Account Page"); 
			  String actual3= MergeAccountsPageEle.getText();
			  System.out.println("text is extracted from Merge Account Page element");
			  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  WebElement MergeButtonEle= driver.findElement(By.name("save"));
			  clickElement(MergeButtonEle,"Merge Button");
			  
				
				  alert= driver.switchTo().alert(); alert.accept();
				 
			  
				/*
				 * switchToAlert(); getAlertText("Alert message"); dismisAlert();
				 */
			  
			  Thread.sleep(2000);
			  WebElement RecentAccountsEle= driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
			  waitForVisibility(RecentAccountsEle, 5, "RecentAccounts Element"); 
			  String actual4= RecentAccountsEle.getText();
			  System.out.println("text is extracted from Merge Account Page element");
			  Assert.assertEquals(actual4, expected4,"Pass: testcase passed");
			  
			 
			  
			  
			  Thread.sleep(5000);
			  
	}
	@Test
	
	 public static void CreateAccountReports() throws InterruptedException{
		
		//Not completed validating the last line of test step
			
		
		    System.out.println("******logout_to_Salesforce automation script started***********");
		     
			String expected="Yasmin Yassin";
			String expected2="Yasmin Yassin";
			String expected3="Unsaved Report";
			String expected4="Report Generation Status:";
			Alert alert=null;
			
			System.out.println("url is entered");

		
			WebElement usernameEle = driver.findElement(By.id("username"));
			waitForVisibility(usernameEle, 5, "User Name textbox");
			enterText(usernameEle,"yasmin@tekarch.com","username");
			
			WebElement passwordEle = driver.findElement(By.id("password"));
			waitForVisibility(passwordEle, 5, "Password textbox");
			enterText(passwordEle,"TGByhn@123","password");
		
			WebElement buttonEle=driver.findElement(By.id("Login"));
			clickElement(buttonEle,"login button");
			
			Thread.sleep(5000);
			
			  WebElement UserMenuEle= driver.findElement(By.id("userNavLabel"));
			  waitForVisibility(UserMenuEle, 5, "Home page"); 
			  String actual= UserMenuEle.getText();
			  System.out.println("text is extracted from Home tab element");
			  Assert.assertEquals(actual, expected,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  WebElement AccountTabEle= driver.findElement(By.id("Account_Tab"));
			  clickElement(AccountTabEle,"Account Tab");
			  
			  WebElement AccountPageEle= driver.findElement(By.xpath("//*[@id=\"mru005Hr00000EMi9E\"]/a/span"));
			  waitForVisibility(AccountPageEle, 5, "Account Page"); 
			  String actual2= AccountPageEle.getText();
			  System.out.println("text is extracted from Account Pag element");
			  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  WebElement AccountsActivitymorethan30daysLinkEle=driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
			  clickElement(AccountsActivitymorethan30daysLinkEle,"Accounts Activity more than 30days Link");
			  
			  WebElement UnsavedReportsPageEle= driver.findElement(By.xpath("//*[@id=\"thePage:sectionHeader\"]/div/div/div[1]/h2"));
			  waitForVisibility(UnsavedReportsPageEle, 5, "Unsaved Reports Page"); 
			  String actual3= UnsavedReportsPageEle.getText();
			  System.out.println("text is extracted from Unsaved Reports Page element");
			  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  
			  WebElement FromCalanderImageEle= driver.findElement(By.xpath("//*[@id=\"ext-gen152\"]"));
			  clickElement(FromCalanderImageEle,"From Calander image Element");
			  Thread.sleep(2000);
			  
			  WebElement FromCalandersendate = driver.findElement(By.xpath("//*[@id=\"ext-comp-1042\"]"));
			// Using send method to sent particular date to the calendar field
			  FromCalandersendate.sendKeys("11/2/2023");
			  
		     
			  WebElement ToCalanderImageEle= driver.findElement(By.xpath("//*[@id=\"ext-gen154\"]"));
			  clickElement(ToCalanderImageEle,"To Calander image Element");
			  
			  WebElement ToCalandersendate= driver.findElement(By.xpath("//*[@id=\"ext-comp-1045\"]"));
			  ToCalandersendate.sendKeys("11/2/2023");
			  
			  WebElement SaveButtonEle= driver.findElement(By.id("ext-gen49"));
			  clickElement(SaveButtonEle,"Save Button");
			  Thread.sleep(2000);
			  
			  //alert= driver.switchTo().alert(); 
			  WebElement ReportNameEle = driver.findElement(By.id("saveReportDlg_reportNameField"));
			  enterText(ReportNameEle,"Test Reoprt","Report Name Textbox");
				
			  WebElement ReportUniqueNameEle = driver.findElement(By.id("saveReportDlg_DeveloperName"));
			  enterText(ReportUniqueNameEle,"TestReoprt"," Report Unique Name Textbox");
			  Thread.sleep(5000);
		
			  WebElement SaveandRunButtonEle= driver.findElement(By.id("ext-gen310"));
			  clickElement(SaveandRunButtonEle,"Save and Run Button");
			  Thread.sleep(5000);
			  
			  
				/*
				 * WebElement ReportDetailsPageEle=
				 * driver.findElement(By.xpath("//*[@id=\"noTableContainer\"]/div/div[2]/h2"));
				 * waitForVisibility(ReportDetailsPageEle, 5, "Report Details Page");
				 * 
				 * String actual4= ReportDetailsPageEle.getText();
				 * System.out.println("text is extracted from Report Details Page element");
				 * Assert.assertEquals(actual4, expected4,"Pass: testcase passed");
				 */
	

			 
			  
			  
	}
	 
	 
	 
	 
}
