package contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;

public class Contacts extends BaseTest {
	
	@Test

	 public static void Createnewcontact() throws InterruptedException{
		
		     
			  
		String expected2="New Contact";
		  String expected3="Morris";
		
		  Login();
	      Thread.sleep(2000);
		  
	      ClickContactsTab();
	      Thread.sleep(2000);
	      
		  WebElement NewButtonEle=driver.findElement(By.name("new"));
		  clickElement(NewButtonEle,"New Button");
		  
		  WebElement NewContactsPageEle= driver.findElement(By.className("pageDescription"));
		  waitForVisibility(NewContactsPageEle, 5, "New Contacts Page Ele"); 
		  String actual2= NewContactsPageEle.getText();
		  System.out.println("text is extracted from New Contacts Page element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(5000);
		  
		  WebElement LastNameEle = driver.findElement(By.id("name_lastcon2"));
		  waitForVisibility(LastNameEle, 5, "LastName textbox");
		  enterText(LastNameEle,"Morris","LastName Textbox");
		  
		  WebElement AccountNameEle = driver.findElement(By.id("con4"));
		  waitForVisibility(AccountNameEle, 5, "Account Name Ele textbox");
		  enterText(AccountNameEle,"Nicholas Morris","Account Name Textbox");
		  
		  WebElement SaveButtonEle=driver.findElement(By.name("save"));
		  clickElement(SaveButtonEle,"Save Button");
		  Thread.sleep(5000);
		  
		  WebElement NewContactPageEle= driver.findElement(By.className("topName"));
		  waitForVisibility(NewContactPageEle, 5, "New Contact Page"); 
		  String actual3= NewContactPageEle.getText();
		  System.out.println("text is extracted from New Contact Page element");
		  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		  Thread.sleep(2000);


	}
	
	@Test

	 public static void CreatenewviewintheContactPage() throws InterruptedException{
		//Last test case is not validated yet
		     
			  
		  String expected2="Create New View";
		  String expected3="Stone Hedge";
		
		  Login();
	      Thread.sleep(2000);
		  
	      ClickContactsTab();
	      Thread.sleep(2000);
	      
		  WebElement CreateNewViewLinkEle=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		  clickElement(CreateNewViewLinkEle,"Create New View Link Ele");
		  
		  WebElement CreateNewPageEle= driver.findElement(By.className("pageDescription"));
		  waitForVisibility(CreateNewPageEle, 5, "Create New Page Ele"); 
		  String actual2= CreateNewPageEle.getText();
		  System.out.println("text is extracted from Create New Page element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  WebElement ViewNameEle = driver.findElement(By.id("fname"));
		  waitForVisibility(ViewNameEle, 5, "View Name textbox");
		  enterText(ViewNameEle,"Stone Hedge","View Name Textbox");
		  
		  WebElement ViewUniqueNameEle = driver.findElement(By.id("devname"));
		  waitForVisibility(ViewUniqueNameEle, 5, "View Unique Name textbox");
		  enterText(ViewUniqueNameEle,"","View Unique Name Textbox");
		  
		  WebElement SaveButtonEle=driver.findElement(By.name("save"));
		  clickElement(SaveButtonEle,"Save Button");
		  Thread.sleep(2000);
		  
			/*
			 WebElement NewViewNamePageEle=
			 driver.findElement(By.xpath("//*[@id=\"00BHr00000AmupB_listSelect\"]"));
			 waitForVisibility(NewViewNamePageEle, 5, "New View Name Page"); String
			 actual3= NewViewNamePageEle.getText();
			 System.out.println("text is extracted from New View Name Page element");
			 Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
			 Thread.sleep(2000);
			 */


	}
	
	@Test

	 public static void CheckrecentlycreatedcontactintheContactPage() throws InterruptedException{
		//Last test case is not validated yet
		     
			  
		  String expected2="Contacts";
		
		  Login();
	      Thread.sleep(2000);
		  
	      ClickContactsTab();
	      Thread.sleep(2000);
	      
	      WebElement RecentContactdropdownEle=driver.findElement(By.id("hotlist_mode"));
		  selectByIndexData(RecentContactdropdownEle,0,"Recently Created selection");
		  
		  
		  WebElement RecentlyCreadtedContactsPageEle= driver.findElement(By.className("pageType")); 
		  waitForVisibility(RecentlyCreadtedContactsPageEle, 5, "Recently Creadted Contacts Page"); 
		  String actual2= RecentlyCreadtedContactsPageEle.getText();
		  System.out.println("text is extracted from Recently Creadted Contacts Page element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000);
	      
	}
	
	@Test

	 public static void CheckAllcontactsviewintheContactPage() throws InterruptedException{
		//Last test case is not validated yet
		     
			  
		  String expected2="My Contacts";
		
		  Login();
	      Thread.sleep(2000);
		  
	      ClickContactsTab();
	      Thread.sleep(2000);
	      
	      WebElement MyContactviewdropdowndEle=driver.findElement(By.name("fcf"));
		  selectByIndexData(MyContactviewdropdowndEle,5,"My Contact selection");
		  Thread.sleep(2000);
		  
		  
		  /*
		  WebElement MyContactsViewPageEle= driver.findElement(By.id("//*[@id=\"00BHr00000DyNJp_listSelect\"]/option[6]")); 
		  waitForVisibility(MyContactsViewPageEle, 5, "My Contacts View Page"); 
		  String actual2= MyContactsViewPageEle.getText();
		  System.out.println("text is extracted from My Contacts view Page element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000);
		  */
		  
	      
	}
	
	@Test

	 public static void ViewacontactinthecontactPage() throws InterruptedException{
		     
			  
		  String expected2="Morris";
		
		  Login();
	      Thread.sleep(2000);
		  
	      ClickContactsTab();
	      Thread.sleep(2000);
	      
	      WebElement ContactNameLinkEle=driver.findElement(By.cssSelector("#bodyCell > div.bRelatedList > div.hotListElement > div > div.pbBody > table > tbody > tr.dataRow.even.first > th > a"));
		  clickElement(ContactNameLinkEle,"First Contact Name Link");
		  
		  
		  WebElement ContactNameLinkPageEle= driver.findElement(By.className("topName")); 
		  waitForVisibility(ContactNameLinkPageEle, 5, "Contact Name Link Page"); 
		  String actual2= ContactNameLinkPageEle.getText();
		  System.out.println("text is extracted from My Contact Name Link Page element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  
	      
	}
	
	@Test

	 public static void ChecktheErrormessagewhilecreatingaNewviewinContacts() throws InterruptedException{
	
		     
			  
		  String expected2="Create New View";
		  String expected3="Error: You must enter a value";
		 
		
		  Login();
	      Thread.sleep(2000);
		  
	      ClickContactsTab();
	      Thread.sleep(2000);
	      
	      WebElement CreateNewViewLinkEle=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		  clickElement(CreateNewViewLinkEle,"Create New View Link");
		  
		  
		  WebElement CreateNewViewPageEle= driver.findElement(By.className("pageDescription")); 
		  waitForVisibility(CreateNewViewPageEle, 5, "Create New View Page"); 
		  String actual2= CreateNewViewPageEle.getText();
		  System.out.println("text is extracted from Create New View Page element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  WebElement ViewUniqueNameEle = driver.findElement(By.id("devname"));
		  waitForVisibility(ViewUniqueNameEle, 5, "View Unique Name textbox");
		  enterText(ViewUniqueNameEle,"EFGH","View Unique Name Textbox");
		  
		  
		  WebElement SaveButtonEle=driver.findElement(By.name("save"));
		  clickElement(SaveButtonEle,"Save Button");
		  Thread.sleep(2000);
		  
		  WebElement ErrorMessageEle= driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]")); 
		  waitForVisibility(ErrorMessageEle, 5, "Error Message"); 
		  String actual3= ErrorMessageEle.getText();
		  System.out.println("text is extracted from Error Message element");
		  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		  Thread.sleep(2000);	  
	      
	}
	
	@Test

	 public static void ChecktheCancelbuttonworksfineinCreateNewView() throws InterruptedException{
	
		     
			  
		  String expected2="Create New View";
		  String expected3="Contacts";
		 
		
		  Login();
	      Thread.sleep(2000);
		  
	      ClickContactsTab();
	      Thread.sleep(2000);
	      
	      WebElement CreateNewViewLinkEle=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
		  clickElement(CreateNewViewLinkEle,"Create New View Link");
		  
		  
		  WebElement CreateNewViewPageEle= driver.findElement(By.className("pageDescription")); 
		  waitForVisibility(CreateNewViewPageEle, 5, "Create New View Page"); 
		  String actual2= CreateNewViewPageEle.getText();
		  System.out.println("text is extracted from Create New View Page element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  WebElement ViewNameEle = driver.findElement(By.id("fname"));
		  waitForVisibility(ViewNameEle, 5, "View Name textbox");
		  enterText(ViewNameEle,"EFGH","View Name Textbox");
		  
		  WebElement ViewUniqueNameEle = driver.findElement(By.id("devname"));
		  waitForVisibility(ViewUniqueNameEle, 5, "View Unique Name textbox");
		  enterText(ViewUniqueNameEle,"ABCD","View Unique Name Textbox");
		  
		  
		  WebElement CancelButtonEle=driver.findElement(By.name("cancel"));
		  clickElement(CancelButtonEle,"Cancel Button");
		  Thread.sleep(2000);
		  
			
		  WebElement ContactsPageEle= driver.findElement(By.className("pageType")); 
		  waitForVisibility(ContactsPageEle, 5, "Contacts Page"); 
		  String actual3= ContactsPageEle.getText();
		  System.out.println("text is extracted from Contacts Page element");
		  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		  Thread.sleep(2000);  
	      
	}
		
	@Test

	 public static void ChecktheSaveandNewbuttonworksinNewContactpage() throws InterruptedException{
	
		     
			  
		  String expected2="New Contact";
		  String expected3="New Contact";
		 
		
		  Login();
	      Thread.sleep(2000);
		  
	      ClickContactsTab();
	      Thread.sleep(2000);
	      
	      WebElement NewButtonEle=driver.findElement(By.name("new"));
		  clickElement(NewButtonEle,"New Button");
		  
		  
		  WebElement CreateNewContactPageEle= driver.findElement(By.className("pageDescription")); 
		  waitForVisibility(CreateNewContactPageEle, 5, "Create New Contact Page"); 
		  String actual2= CreateNewContactPageEle.getText();
		  System.out.println("text is extracted from Create New Contact Page element");
		  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
		  Thread.sleep(2000);
		  
		  WebElement LastNameEle = driver.findElement(By.id("name_lastcon2"));
		  waitForVisibility(LastNameEle, 5, "Last Name textbox");
		  enterText(LastNameEle,"Indian","Last Name Textbox");
		  
		  WebElement AccountNameEle = driver.findElement(By.id("con4"));
		  waitForVisibility(AccountNameEle, 5, "Account Name textbox");
		  enterText(AccountNameEle,"Nicholas Morris","Account Name Textbox");
		  
		  
		  WebElement SaveandnewButtonEle=driver.findElement(By.name("save_new"));
		  clickElement(SaveandnewButtonEle,"Save and New Button");
		  Thread.sleep(2000);
		  

		  WebElement CreateNewContactPageEle2= driver.findElement(By.className("pageDescription")); 
		  waitForVisibility(CreateNewContactPageEle2, 5, "Create New Contact Page"); 
		  String actual3= CreateNewContactPageEle2.getText();
		  System.out.println("text is extracted from Create New Contact Page element");
		  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		  Thread.sleep(2000);
	      
	}
	
}
