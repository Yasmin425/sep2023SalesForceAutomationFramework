package leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;

public class Leads extends BaseTest{
	@Test

	 public static void leadsSelectView() throws InterruptedException{
		
		//Assertion of last test step doesn't work on the drop down menu
		
			  String expected3= "All Open Leads\r\n"
			  		+ "My Unread Leads\r\n"
			  		+ "Recently Viewed Leads\r\n"
			  		+ "Today's Leads\r\n"
			  		+ "View - Custom 1\r\n"
			  		+ "View - Custom 2";
					    
			
			  Login();
			  
			  Thread.sleep(2000);
			  
			  ClickLeadsTab();
		      Thread.sleep(2000);
		      
				 
			  WebElement LeadsviewDropdownEle=driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
			  clickElement(LeadsviewDropdownEle,"Leads view Dropdown");
			  
			  WebElement LeadsviewListEle= driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
			  waitForVisibility(LeadsviewListEle, 5, "Leads view List"); 
			  String actual3= LeadsviewListEle.getText();
			  System.out.println("text is extracted from Leads view List element");
			  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  Logout();
			  
			  Thread.sleep(2000);
				  
	 
	}
	
	@Test

	 public static void defaultView() throws InterruptedException{
		
		     
			  
			  String expected2="All Open Leads";
			  String expected3="My Unread Leads";
			
			  Login();
		      Thread.sleep(2000);
			  
		      ClickLeadsTab();
		      Thread.sleep(2000);
		      
			  WebElement LeadsviewDropdownEle=driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
			  clickElement(LeadsviewDropdownEle,"Leads view Dropdown");
			  
			  WebElement LeadsviewListEle= driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[1]"));
			  waitForVisibility(LeadsviewListEle, 5, "Leads view List"); 
			  String actual2= LeadsviewListEle.getText();
			  System.out.println("text is extracted from Leads view List element");
			  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
			  Thread.sleep(5000);
			  
			  WebElement StageDropdownEle= driver.findElement(By.id("fcf"));
			  selectByIndexData(StageDropdownEle,1,"My Unread Leads");
			  
			  Logout();
			  Thread.sleep(2000);
			  
              Login();
			  
		      Thread.sleep(2000);
		      
		      ClickLeadsTab();
		      Thread.sleep(2000);
			  
		      WebElement GoButtonEle=driver.findElement(By.name("go"));
			  clickElement(GoButtonEle,"Go Button");
			  
			  WebElement MyUnreadListPageEle= driver.findElement(By.xpath("//*[@id=\"00BHr00000DyNNt_listSelect\"]/option[2]"));
			  waitForVisibility(MyUnreadListPageEle, 5, "My Unread List Page"); 
			  String actual3= MyUnreadListPageEle.getText();
			  System.out.println("text is extracted from My Unread List Page element");
			  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
			  Thread.sleep(5000);
		      
              Logout();
			  Thread.sleep(2000); 
				  
	 
	}
	
	@Test

	 public static void CheckNewbuttononLeadsHome() throws InterruptedException{
		
		     
			  
			  String expected2="New Lead";
			  String expected3="ABCD";
			
			  Login();
		      Thread.sleep(2000);
			  
		      ClickLeadsTab();
		      Thread.sleep(2000);
		      
			  WebElement NewButtonEle=driver.findElement(By.name("new"));
			  clickElement(NewButtonEle,"New Button");
			  
			  WebElement NewLeadsPageEle= driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div/div[1]/div[1]/h2"));
			  waitForVisibility(NewLeadsPageEle, 5, "New Leads Page Ele"); 
			  String actual2= NewLeadsPageEle.getText();
			  System.out.println("text is extracted from New Leads Page element");
			  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
			  Thread.sleep(5000);
			  
			  WebElement LastNameEle = driver.findElement(By.id("name_lastlea2"));
			  waitForVisibility(LastNameEle, 5, "LastName textbox");
			  enterText(LastNameEle,"ABCD","LastName Textbox");
			  
			  WebElement CountryEle = driver.findElement(By.id("lea3"));
			  waitForVisibility(CountryEle, 5, "Country textbox");
			  enterText(CountryEle,"ABCD","Country Textbox");
			  
			  WebElement SaveButtonEle=driver.findElement(By.name("save"));
			  clickElement(SaveButtonEle,"Save Button");
			  Thread.sleep(5000);
			  
			  WebElement NewLeadviewPageEle= driver.findElement(By.xpath("//*[@id=\"contactHeaderRow\"]/div[2]/h2"));
			  waitForVisibility(NewLeadviewPageEle, 5, "New Lead view Page"); 
			  String actual3= NewLeadviewPageEle.getText();
			  System.out.println("text is extracted from New Lead view Page element");
			  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  Logout();
			  Thread.sleep(2000);

				  
	 
	}
}
