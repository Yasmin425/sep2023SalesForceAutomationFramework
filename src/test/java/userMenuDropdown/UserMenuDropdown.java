package userMenuDropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.PropertiesUtility;
import basetest.BaseTest;


public class UserMenuDropdown extends BaseTest{
	
	@Test
	
	public static void SelectUserMenu() throws InterruptedException{
			
		    System.out.println("******login_to_Salesforce automation script started***********");
		    
			String expected="Yasmin Yassin";
			String expected2="My Profile";
			System.out.println("url is entered");

		
			WebElement usernameEle = driver.findElement(By.id("username"));
			waitForVisibility(usernameEle, 5, "User Name textbox");
			enterText(usernameEle,"yasmin@tekarch.com","username");
			
			WebElement passwordEle = driver.findElement(By.id("password"));
			enterText(passwordEle,"TGByhn@123","password");
		
			WebElement buttonEle=driver.findElement(By.id("Login"));
			clickElement(buttonEle,"login button");
			
			Thread.sleep(2000);
			
	        WebElement UserMenuEle= driver.findElement(By.id("userNavLabel"));
	        waitForVisibility(UserMenuEle, 5, "Home page");
			String actual= UserMenuEle.getText();
			System.out.println("text is extracted from Home tab element");
			Assert.assertEquals(actual, expected,"Pass: testcase passed");
			
			clickElement(UserMenuEle,"User name dropdown");
			
			WebElement UserMenuMyProfileEle= driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		    waitForVisibility(UserMenuMyProfileEle, 5, "User Menu dropdown; My Profile list");
			String actual2= UserMenuMyProfileEle.getText();
			System.out.println("text is extracted from User Menu My Profile element");
			Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
			
			System.out.println("******login_to_salesforce automation script ended***********");
			
			

		}
	@Test
	
	public static void SelectMyProfile() throws InterruptedException, AWTException{
		
	    System.out.println("******login_to_Salesforce automation script started***********");
	    
	   
	    
		String expected="Yasmin Yassin";
		String expected2="My Profile";
		String expected3="Login History";
		String expected4= "Edit Profile";
		
		System.out.println("url is entered");

	
		WebElement usernameEle = driver.findElement(By.id("username"));
		waitForVisibility(usernameEle, 5, "User Name textbox");
		enterText(usernameEle,"yasmin@tekarch.com","username");
		
		WebElement passwordEle = driver.findElement(By.id("password"));
		enterText(passwordEle,"TGByhn@123","password");
	
		WebElement buttonEle=driver.findElement(By.id("Login"));
		clickElement(buttonEle,"login button");
		
		Thread.sleep(2000);
		
        WebElement UserMenuEle= driver.findElement(By.id("userNavLabel"));
        waitForVisibility(UserMenuEle, 5, "Home page");
		String actual= UserMenuEle.getText();
		System.out.println("text is extracted from Home tab element");
		Assert.assertEquals(actual, expected,"Pass: testcase passed");
		
		clickElement(UserMenuEle,"User name dropdown");
		
		Thread.sleep(2000);
		
		WebElement MyProfileEle= driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
        waitForVisibility(MyProfileEle, 5, "My Profile dropdown Menu");
        clickElement(MyProfileEle,"My Profile dropdown Menu");
		
    	Thread.sleep(2000);
	 
    	GettoProfilePage(expected3);
    	
		
		  WebElement EditProfileEle= driver.findElement(By.xpath(
		  "//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		  clickElement(EditProfileEle,"Edit My Profile icon");
		  
		  Thread.sleep(2000);
		  
		  WebElement EditProfilePageEle= driver.findElement(By.id("contactInfoTitle"));
		  waitForVisibility(EditProfilePageEle, 5, "Edit Profile Page"); String
		  actual4= EditProfilePageEle.getText();
		  System.out.println("text is extracted from My Profile Page element");
		  Assert.assertEquals(actual4, expected4,"Pass: testcase passed");
		  
		  Thread.sleep(2000);
		  
		  WebElement CloseEditProfileEle= driver.findElement(By.id("contactInfoX"));
		  clickElement(CloseEditProfileEle,"Close icon for Edit My Profile page");
		  
		  Thread.sleep(2000);
		  
		  
		  GettoProfilePage(expected3);
		  
		  Thread.sleep(2000);
		  
		  WebElement PostLinkEle=
		  driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]"));
		  clickElement(PostLinkEle,"Post link on My Profile page");
		  
		  
		  
		  
		  WebElement PostfieldEle = driver.findElement(By.xpath("/html/body"));
		  clickElement(PostfieldEle,"Posting text area on My Profile page"); if
		  (PostfieldEle.isDisplayed()) {
		  
		  PostfieldEle.sendKeys("This is my second post");
		  System.out.println("data is entered in the "+"Posting text field/area"); }
		  else { myLog.error("Posting text field/area"+" element is not displayed"); }
		  
		  WebElement sharebutton= SharingElement(); clickElement(sharebutton,
		  "Sharing button");
		  
		  Thread.sleep(2000);
		  
		  WebElement FileuploadLinkEle=
		  driver.findElement(By.xpath("//*[@id=\"publisherAttachContentPost\"]/span[1]"
		  )); waitForVisibility(FileuploadLinkEle, 5,
		  "File upload link in Edit Profile Page");
		  clickElement(FileuploadLinkEle,"File link on My Profile page");
		  
		  WebElement UploadfilefromyourComputerButtonEle=
		  driver.findElement(By.id("chatterUploadFileAction")); clickElement(
		  UploadfilefromyourComputerButtonEle,"Upload a file from your Computer Button"
		  );
		  
		  WebElement ChoosefileEle =
		  driver.findElement(By.xpath("//*[@id=\"chatterFile\"]"));
		  waitForVisibility(ChoosefileEle, 5,
		  "File selected in the Choose file element");
		  enterText(ChoosefileEle,"C:\\Users\\yasmi\\Downloads\\New folder\\Nike.jpg"
		  ,"File selected in the Choose file element");
		  
		  
		  clickElement(sharebutton, "Sharing button");
		 
        Thread.sleep(2000);
        
        WebElement ProfileImageEle = driver.findElement(By.xpath("//*[@id=\"photoSection\"]/span[2]/img[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(ProfileImageEle).build().perform(); 
        Thread.sleep(2000);
        
        WebElement AddPhotoEle = driver.findElement(By.xpath("//*[@id=\"uploadLink\"]"));
        clickElement(AddPhotoEle,"Add photo button");
        
        driver.switchTo().frame("uploadPhotoContentId");
        
        Thread.sleep(2000);
        
        WebElement ChooseimageEle = driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
		waitForVisibility(ChooseimageEle, 5, "Image file selected in the Choose image element");
		enterText(ChooseimageEle,"C:\\Users\\yasmi\\Downloads\\New folder\\Nike.jpg","Image File selected in the Choose image element");
		
		Thread.sleep(2000);
		
		WebElement SaveImageButtonEle= driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
        clickElement(SaveImageButtonEle,"Saving the uploading Image");
        
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();
        
        Thread.sleep(2000);
        
        driver.switchTo().frame("uploadPhotoContentId");
        
        WebElement SaveImageButtonEle2= driver.findElement(By.id("j_id0:j_id7:save"));
        clickElement(SaveImageButtonEle2,"Saving the cropped Image");
     
        Thread.sleep(5000);		
		
		System.out.println("******login_to_salesforce automation script ended***********");
		
		

	}
	
	@Test
	
public static void SelectMySettings() throws InterruptedException, AWTException{
		//Sample popup window is uninteractable
	    System.out.println("******login_to_Salesforce automation script started***********");
	    
	   
	    
		String expected="Yasmin Yassin";
		String expected2="My Settings";
		String expected3="Login History";
		String expected4= "Edit Profile";
		String expected5= "Your settings have been successfully saved.";
		String expected6= "  Sample Event.";
		
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
		  waitForVisibility(UserMenuEle, 5, "Home page"); String actual=
		  UserMenuEle.getText();
		  System.out.println("text is extracted from Home tab element");
		  Assert.assertEquals(actual, expected,"Pass: testcase passed");
		  
		  clickElement(UserMenuEle,"User name dropdown");
		  
		  Thread.sleep(2000);
		  
		  WebElement MySettingEle=
		  driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
		  waitForVisibility(MySettingEle, 5, "My Setting dropdown Menu");
		  clickElement(MySettingEle,"My Setting dropdown Menu");
		  
		  
		  Thread.sleep(2000); GettoMySettingPage(expected2);
		  
		  
		  
			
			  WebElement PersonalEle=driver.findElement(By.id("PersonalInfo_font"));
			  clickElement(PersonalEle,"Personal Tab");
			  
			  WebElement LoginHistoryEle=driver.findElement(By.id("LoginHistory_font"));
			  clickElement(LoginHistoryEle,"Login History menu");
			  
			  WebElement LoginHistoryPageEle=
			  driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h1"))
			  ; waitForVisibility(LoginHistoryPageEle, 5, "Login History Page"); String
			  actual3= LoginHistoryPageEle.getText();
			  System.out.println("text is extracted from Login History Page");
			  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
			  
			  WebElement DownloadLoginHistoryEle=driver.findElement(By.xpath(
			  "//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
			  clickElement(DownloadLoginHistoryEle," Download Login History link");
			  
			  WebElement
			  DisplayandLayoutEle=driver.findElement(By.id("DisplayAndLayout_font"));
			  clickElement(DisplayandLayoutEle," Display and Layout tab");
			  
			  WebElement CustomizeTabsEle=driver.findElement(By.id("CustomizeTabs_font"));
			  clickElement(CustomizeTabsEle," Customize Tabs Menu");
			  
			  WebElement
			  CustomAppdropdownEle=driver.findElement(By.xpath("//*[@id=\"p4\"]"));
			  selectByIndexData(CustomAppdropdownEle,8,"Salesforce Chatter selection");
			  
			  Thread.sleep(2000);
			  
			  WebElement ReportTabEle= driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]/option[81]"));
						 
			  clickElement(ReportTabEle,"Reports tab");
						  
			  Thread.sleep(2000);
						  
			  WebElement AddbuttonEle=driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
			  clickElement(AddbuttonEle," Add button");
						  
			  Thread.sleep(2000);
						  
			  WebElement SaveButtonEle=driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
			  clickElement(SaveButtonEle," Save button");
						  
						 
			  Thread.sleep(2000);
		
		  GettoMySettingPage(expected2);
		  
		  WebElement
		  EmailTabEle=driver.findElement(By.xpath("//*[@id=\"EmailSetup\"]/a"));
		  clickElement(EmailTabEle," Email tab");
		  
		  WebElement
		  MyEmailSettingsTabEle=driver.findElement(By.id("EmailSettings_font"));
		  clickElement(MyEmailSettingsTabEle," My Email Setting Tab");
		  
		  WebElement EmailNametextboxEle = driver.findElement(By.id("sender_name"));
		  waitForVisibility(EmailNametextboxEle, 5, "Email Name textbox");
		  enterText(EmailNametextboxEle,"Yasmin Yassin","Email Name textbox");
		  
		  WebElement EmailAddresstextboxEle =
		  driver.findElement(By.id("sender_email")); enterText(EmailAddresstextboxEle,
		  "yasminqaclass@gmail.com","Email Address textbox");
		  
		  WebElement AutoBCCRadiobuttonEle=driver.findElement(By.id("auto_bcc1"));
		  clickElement(AutoBCCRadiobuttonEle,"Auto BCC Radio button");
		  
		  WebElement SavebuttonEle=driver.findElement(By.name("save"));
		  clickElement(SavebuttonEle,"save button");
		  
		  WebElement EmailSettingPageEle=
		  driver.findElement(By.className("messageText"));
		  waitForVisibility(EmailSettingPageEle, 5, "Email Setting Saved Page"); String
		  actua5= EmailSettingPageEle.getText();
		  System.out.println("text is extracted from Email Setting Saved Page element"
		  ); Assert.assertEquals(actua5, expected5,"Pass: testcase passed");
		 
		
		WebElement CalendarAndRemindersTabEle=driver.findElement(By.id("CalendarAndReminders_font"));
		clickElement(CalendarAndRemindersTabEle,"Calendar And Reminders Tab");
		
		WebElement ActivityRemindersTabEle=driver.findElement(By.id("Reminders_font"));
		clickElement(ActivityRemindersTabEle,"Activity Reminders Tab");
		
		WebElement OpenaTestReminderButtonEle=driver.findElement(By.id("testbtn"));
		clickElement(OpenaTestReminderButtonEle,"Open a Test Reminder Button");
		
		
		
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		driver.switchTo().window(child_window).getTitle();
		
		/*
		 * WebElement SampleEventPopupEle=
		 * driver.findElement(By.xpath("//*[@id=\"summary0\"]/div/span"));
		 * waitForVisibility(SampleEventPopupEle, 5, "Sample Event Popup Window");
		 * String actual6= SampleEventPopupEle.getText();
		 * System.out.println("text is extracted from Sample Event Popup alert element"
		 * ); Assert.assertEquals(actual6, expected6,"Pass: testcase passed");
		 */
		
		driver.close(); 
		   }

		}
		
		//switch to the parent window
		driver.switchTo().window(parent);
		
		
		
		Thread.sleep(2000);
		
		
		}

	@Test
	
    public static void SelectDeveloperConsol() throws InterruptedException, AWTException{
		
		//Developer console popup window is uninteractable
		
	    System.out.println("******login_to_Salesforce automation script started***********");
	     
		String expected="Yasmin Yassin";
		String expected2="";
		
		
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
		  waitForVisibility(UserMenuEle, 5, "Home page"); String actual=
		  UserMenuEle.getText();
		  System.out.println("text is extracted from Home tab element");
		  Assert.assertEquals(actual, expected,"Pass: testcase passed");
		  
		  clickElement(UserMenuEle,"User name dropdown");
		  
		  Thread.sleep(2000);
		  
		  WebElement DeveloperConsoleEle= driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]"));
		  waitForVisibility(DeveloperConsoleEle, 5, "Developer Console Tab");
		  clickElement(DeveloperConsoleEle,"Developer Console Tab");
		  
		  String parent=driver.getWindowHandle();

			Set<String>s=driver.getWindowHandles();

			Iterator<String> I1= s.iterator();

			while(I1.hasNext())
			{

			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);
			
			String actual2= driver.switchTo().window(child_window).getTitle();
			Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
			System.out.println("text is extracted from Developer Console Element");

			Thread.sleep(2000);
			
			
			driver.close(); 
			   }

			}
			
			//switch to the parent window
			driver.switchTo().window(parent);
			
			
			
			Thread.sleep(2000);
			
			
		  
}
	
	@Test
	
    public static void LogoutfromSalesforce() throws InterruptedException, AWTException{
		
	    System.out.println("******logout_to_Salesforce automation script started***********");
	     
		String expected="Yasmin Yassin";
		String expected2="Username";
		
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
		  waitForVisibility(UserMenuEle, 5, "Home page"); String actual=
		  UserMenuEle.getText();
		  System.out.println("text is extracted from Home tab element");
		  Assert.assertEquals(actual, expected,"Pass: testcase passed");
		  
		  clickElement(UserMenuEle,"User name dropdown");
		  
		  Thread.sleep(2000);
		  
		  WebElement LogoutEle= driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		  waitForVisibility(LogoutEle, 5, "Logout Tab");
		  clickElement(LogoutEle,"Logout Tab");
		  		  
		Thread.sleep(2000);
		
		WebElement LoginPageEle= driver.findElement(By.xpath("//*[@id=\"usernamegroup\"]/label"));
		waitForVisibility(LoginPageEle, 5, "Login Page"); 
		String actua2= LoginPageEle.getText();
		System.out.println("text is extracted from Login Page element"); 
		Assert.assertEquals(actua2, expected2,"Pass: testcase passed");
			
		Thread.sleep(2000);	
		  
}
	
}
	
	