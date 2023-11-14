package random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;

public class Random extends BaseTest{
	@Test
	
	public static void Verifyifthefirstnameandlastnameoftheloggedinuserisdisplayed() throws InterruptedException {
		
		String expected= "Yasmin Yassin";
		String expected2= "Yasmin Yassin ";
		
		
		Login();
		
		WebElement HomeEle= driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		clickElement(HomeEle,"Home Tab");
		Thread.sleep(2000);
		
		
		  WebElement HomePageEle= driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")); 
		  waitForVisibility(HomePageEle, 5, "First and Last name link on Home Page"); 
		  String actual= HomePageEle.getText();
		  System.out.println("text is extracted from First and Last name link on Home Page element");
		  Assert.assertEquals(actual, expected,"Pass: testcase passed");
		  Thread.sleep(2000); 
		  
		  clickElement(HomePageEle,"First and Last name link on Home Page");
		  
		  WebElement MyProfilePageEle= driver.findElement(By.id("tailBreadcrumbNode"));
	        waitForVisibility(MyProfilePageEle, 5, "My Profile Page");
			String actual2= MyProfilePageEle.getText();
			System.out.println("text is extracted from My Profile Page element");
			Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
			
		  Thread.sleep(2000); 
				
			}
	
@Test
	
	public static void Verifytheeditedlastnameisupdatedatvariousplaces() throws InterruptedException {
		
		String expected= "Yasmin Yassin";
		String expected2= "Contact";
		String expected3= "Yasmin Abcde";
		String expected4= "Yasmin Abcde";
		
		
		Login();
		
		WebElement HomeEle= driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		clickElement(HomeEle,"Contacts Tab");
		Thread.sleep(2000);
		
		
		  WebElement HomePageEle= driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")); 
		  waitForVisibility(HomePageEle, 5, "First and Last name link on Home Page"); 
		  String actual= HomePageEle.getText();
		  System.out.println("text is extracted from First and Last name link on Home Page element");
		  Assert.assertEquals(actual, expected,"Pass: testcase passed");
		  Thread.sleep(2000); 
		
		  clickElement(HomePageEle,"First and Last name link on Home Page");
		  
		  WebElement EditIconEle= driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		  clickElement(EditIconEle," Edit Icon");
		  Thread.sleep(2000); 
		  
		  WebElement EditProfilePopupEle= driver.findElement(By.xpath("/html/body/iframe"));
		  driver.switchTo().frame(EditProfilePopupEle);
		  Thread.sleep(2000); 

		  
		  WebElement EditProfilePopupContactTabEle= driver.findElement(By.xpath("//*[@id=\"contactTab\"]/a")); 
		  waitForVisibility(EditProfilePopupContactTabEle, 5, "Edit Profile Popup contact tab Element"); 
		  String actual2= EditProfilePopupContactTabEle.getText();
		  System.out.println("text is extracted from Edit Profile Popup contact tab element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000); 
		  
		  WebElement AboutTabEle= driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		  clickElement(AboutTabEle,"About Tab");
		
		  
		  WebElement LastNameEle= driver.findElement(By.id("lastName"));
		  enterText(LastNameEle,"Abcde","LastNameEle");
		  
		  WebElement SaveAllButtonEle= driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
		  clickElement(SaveAllButtonEle,"SaveAll Button");
		  Thread.sleep(2000); 
		  
		  driver.switchTo().defaultContent();
		  
		    WebElement AccountNameEle= driver.findElement(By.id("tailBreadcrumbNode"));
	        waitForVisibility(AccountNameEle, 5, "Account Name Link");
			String actual3= AccountNameEle.getText();
			System.out.println("text is extracted from Account Name element");
			Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
			
			WebElement UserMenuEle= driver.findElement(By.id("userNavLabel"));
	        waitForVisibility(UserMenuEle, 5, "Home page");
			String actual4= UserMenuEle.getText();
			System.out.println("text is extracted from Home tab element");
			Assert.assertEquals(actual4, expected4,"Pass: testcase passed");
				
			}


@Test

public static void Blockinganeventinthecalender() throws InterruptedException {
	
	String expected= "Yasmin Yassin";
	String expected2= "Calendar for Yasmin Yassin - Day View";
	String expected3= "New Event";
	String expected4= "New Event";
	
	
	Login();
	
	WebElement HomeEle= driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
	clickElement(HomeEle,"Home Tab");
	Thread.sleep(2000);
	
	
	  WebElement HomePageEle= driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")); 
	  waitForVisibility(HomePageEle, 5, "First and Last name link on Home Page"); 
	  String actual= HomePageEle.getText();
	  System.out.println("text is extracted from First and Last name link on Home Page element");
	  Assert.assertEquals(actual, expected,"Pass: testcase passed");
	  Thread.sleep(2000); 
	  
	  WebElement CalanderLinkEle= driver.findElement(By.cssSelector("#ptBody > div > div.content > span.pageDescription > a"));
	  clickElement(CalanderLinkEle,"Calander Link");

	  
	  WebElement CalanderPageEle= driver.findElement(By.className("pageType")); 
	  waitForVisibility(CalanderPageEle, 5, "Edit Profile Popup contact tab Element"); 
	  String actual2= CalanderPageEle.getText();
	  System.out.println("text is extracted from Edit Profile Popup contact tab element");
	  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
	  Thread.sleep(2000); 
	  
	  WebElement ClockLinkEle= driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a"));
	  clickElement(ClockLinkEle,"Clock Link 8:00pm");
	  
	  WebElement NewEventPageEle= driver.findElement(By.className("pageDescription"));
      waitForVisibility(NewEventPageEle, 5, "New Event Page");
		String actual3= NewEventPageEle.getText();
		System.out.println("text is extracted from New Event Page element");
		Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		
		WebElement SubjectComboIconEle= driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
		clickElement(SubjectComboIconEle,"Subject Combo Image Icon");
		Thread.sleep(2000); 
		  
		WebElement SubjectComboPopupEle= driver.findElement(By.className("pageDescription"));
		driver.switchTo().window(actual3);
	  
		 
	    waitForVisibility(SubjectComboPopupEle, 5, "Subject Combo Popup window");
		String actual4= SubjectComboPopupEle.getText();
		System.out.println("text is extracted from Subject Combo Popup window element");
		Assert.assertEquals(actual4, expected4,"Pass: testcase passed");
		
		//driver.switchTo().window(actual4);
	  
		WebElement otherLinkEle= driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
		clickElement(otherLinkEle,"other Link");
	  
	    driver.switchTo().defaultContent();
	  
	    Thread.sleep(5000);
			
		}

@Test

public static void Blockinganeventinthecalenderwithweeklyrecurrance() throws InterruptedException {
	
	String expected= "Yasmin Yassin";
	String expected2= "Calendar for Yasmin Yassin - Day View";
	String expected3= "New Event";
	String expected4= "New Event";
	
	
	Login();
	
	WebElement HomeEle= driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
	clickElement(HomeEle,"Home Tab");
	Thread.sleep(2000);
	
	
	  WebElement HomePageEle= driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a")); 
	  waitForVisibility(HomePageEle, 5, "First and Last name link on Home Page"); 
	  String actual= HomePageEle.getText();
	  System.out.println("text is extracted from First and Last name link on Home Page element");
	  Assert.assertEquals(actual, expected,"Pass: testcase passed");
	  Thread.sleep(2000); 
	  
	  WebElement CalanderLinkEle= driver.findElement(By.cssSelector("#ptBody > div > div.content > span.pageDescription > a"));
	  clickElement(CalanderLinkEle,"Calander Link");

	  
	  WebElement CalanderPageEle= driver.findElement(By.className("pageType")); 
	  waitForVisibility(CalanderPageEle, 5, "Edit Profile Popup contact tab Element"); 
	  String actual2= CalanderPageEle.getText();
	  System.out.println("text is extracted from Edit Profile Popup contact tab element");
	  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
	  Thread.sleep(2000); 
	  
	  WebElement ClockLinkEle= driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a"));
	  clickElement(ClockLinkEle,"Clock Link 8:00pm");
	  
	  WebElement NewEventPageEle= driver.findElement(By.className("pageDescription"));
      waitForVisibility(NewEventPageEle, 5, "New Event Page");
		String actual3= NewEventPageEle.getText();
		System.out.println("text is extracted from New Event Page element");
		Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		
		WebElement SubjectComboIconEle= driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
		clickElement(SubjectComboIconEle,"Subject Combo Image Icon");
		Thread.sleep(2000); 
		  
		WebElement SubjectComboPopupEle= driver.findElement(By.className("pageDescription"));
		driver.switchTo().window(actual3);
	  
		 
	    waitForVisibility(SubjectComboPopupEle, 5, "Subject Combo Popup window");
		String actual4= SubjectComboPopupEle.getText();
		System.out.println("text is extracted from Subject Combo Popup window element");
		Assert.assertEquals(actual4, expected4,"Pass: testcase passed");
		
		//driver.switchTo().window(actual4);
	  
		WebElement otherLinkEle= driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a"));
		clickElement(otherLinkEle,"other Link");
	  
	    driver.switchTo().defaultContent();
	  
	    Thread.sleep(5000);
			
		}

	
}



