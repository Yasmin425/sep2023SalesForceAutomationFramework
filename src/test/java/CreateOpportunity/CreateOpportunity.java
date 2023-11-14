package CreateOpportunity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basetest.BaseTest;

public class CreateOpportunity extends BaseTest{
@Test

	 public static void OpportunitiesDropdown() throws InterruptedException{
		
		
			
		
		    System.out.println("******logout_to_Salesforce automation script started***********");
		     
			String expected="Yasmin Yassin";
			String expected2="Opportunities";
			String expected3="All Opportunities";
			
			
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
			  
			  WebElement OpportunitiesTabEle= driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
			  clickElement(OpportunitiesTabEle,"Opportunities Tab");
			  
			  WebElement OpportunitiesPageEle= driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h1"));
			  waitForVisibility(OpportunitiesPageEle, 5, "Opportunities Page"); 
			  String actual2= OpportunitiesPageEle.getText();
			  System.out.println("text is extracted from Opportunities Page element");
			  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
			  Thread.sleep(2000);
			  
			  WebElement AllOportunitiesDropdownEle=driver.findElement(By.id("fcf"));
			  clickElement(AllOportunitiesDropdownEle,"All Oportunities Dropdown");
			  
			  WebElement AllOportunitieslistEle= driver.findElement(By.xpath("//*[@id=\"fcf\"]/option[1]"));
			  waitForVisibility(AllOportunitieslistEle, 5, "All Oportunities lists"); 
			  String actual3= AllOportunitieslistEle.getText();
			  System.out.println("text is extracted from All Oportunities lists element");
			  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
			  Thread.sleep(5000);		  
			  
	}

@Test

public static void CreateNewOpty() throws InterruptedException{
	
	
	
	
    System.out.println("******logout_to_Salesforce automation script started***********");
     
	String expected="Yasmin Yassin";
	String expected2="Opportunities";
	String expected3="SDE";
	
	
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
	  
	  WebElement OpportunitiesTabEle= driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	  clickElement(OpportunitiesTabEle,"Opportunities Tab");
	  
	  WebElement OpportunitiesPageEle= driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h1"));
	  waitForVisibility(OpportunitiesPageEle, 5, "Opportunities Page"); 
	  String actual2= OpportunitiesPageEle.getText();
	  System.out.println("text is extracted from Opportunities Page element");
	  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
	  Thread.sleep(2000);
	  
	  WebElement NewButtonEle=driver.findElement(By.name("new"));
	  clickElement(NewButtonEle,"New Button");
	  
	  WebElement OptyNameEle = driver.findElement(By.id("opp3"));
		waitForVisibility(OptyNameEle, 5, "Opportunity Name textbox");
		enterText(OptyNameEle,"SDE","Opportunity Name textbox");
		
		WebElement AccountNameEle = driver.findElement(By.id("opp4"));
		waitForVisibility(AccountNameEle, 5, "Account Name textbox");
		enterText(AccountNameEle,"Nicholas Morris","Account Name Textbox");

		WebElement CloseDateLinkEle=driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span/a"));
		clickElement(CloseDateLinkEle,"Close Date Link");
		
		 WebElement StageDropdownEle= driver.findElement(By.xpath("//*[@id=\"opp11\"]"));
		 selectByIndexData(StageDropdownEle,3,"Stage Dropdown Ele");
		 
		 WebElement LeadSourceDropdownEle= driver.findElement(By.id("opp6"));
		 selectByIndexData(LeadSourceDropdownEle,2,"Stage Dropdown Ele");
		 
		 WebElement SaveButtonEle=driver.findElement(By.name("save"));
		 clickElement(SaveButtonEle,"Save Button");
		 
		  WebElement NewOpportunitiesPageEle= driver.findElement(By.className("pageDescription"));
		  waitForVisibility(NewOpportunitiesPageEle, 5, "New Opportunities Page"); 
		  String actual3= NewOpportunitiesPageEle.getText();
		  System.out.println("text is extracted from New Opportunities Page element");
		  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		  Thread.sleep(5000);  
	  
}

@Test

public static void TestOpportunityPipelineReport() throws InterruptedException{
	
	
	
	
    System.out.println("******logout_to_Salesforce automation script started***********");
     
	String expected="Yasmin Yassin";
	String expected2="Opportunities";
	String expected3="Opportunity Pipeline";
	
	
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
	  
	  WebElement OpportunitiesTabEle= driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	  clickElement(OpportunitiesTabEle,"Opportunities Tab");
	  
	  WebElement OpportunitiesPageEle= driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h1"));
	  waitForVisibility(OpportunitiesPageEle, 5, "Opportunities Page"); 
	  String actual2= OpportunitiesPageEle.getText();
	  System.out.println("text is extracted from Opportunities Page element");
	  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
	  Thread.sleep(2000);
	  
	  WebElement OptyPiplineLinkEle=driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
	  clickElement(OptyPiplineLinkEle,"Opportunity Pipline Link");
	  
		 
		  WebElement OpportunityPipelinePageEle= driver.findElement(By.xpath("//*[@id=\"noTableContainer\"]/div/div[1]/div[1]/div[1]/h1"));
		  waitForVisibility(OpportunityPipelinePageEle, 5, "Opportunity Pipeline Page"); 
		  String actual3= OpportunityPipelinePageEle.getText();
		  System.out.println("text is extracted from Opportunities Pipeline Page element");
		  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		 
		 Thread.sleep(5000);
	

	 
	  
	  
}


@Test

public static void TestStuckOpportunitiesReport() throws InterruptedException{
	
	
	
	
    System.out.println("******logout_to_Salesforce automation script started***********");
     
	String expected="Yasmin Yassin";
	String expected2="Opportunities";
	String expected3="Stuck Opportunities";
	
	
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
	  
	  WebElement OpportunitiesTabEle= driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	  clickElement(OpportunitiesTabEle,"Opportunities Tab");
	  
	  WebElement OpportunitiesPageEle= driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h1"));
	  waitForVisibility(OpportunitiesPageEle, 5, "Opportunities Page"); 
	  String actual2= OpportunitiesPageEle.getText();
	  System.out.println("text is extracted from Opportunities Page element");
	  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
	  Thread.sleep(2000);
	  
	  WebElement StuckOpportunitiesLinkEle=driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
	  clickElement(StuckOpportunitiesLinkEle,"Stuck Opportunities Link");
	  
		 
		  WebElement StuckOpportunitiesPageEle= driver.findElement(By.xpath("//*[@id=\"noTableContainer\"]/div/div[1]/div[1]/div[1]/h1"));
		  waitForVisibility(StuckOpportunitiesPageEle, 5, "Stuck Opportunities Page"); 
		  String actual3= StuckOpportunitiesPageEle.getText();
		  System.out.println("text is extracted from Stuck Opportunities Page element");
		  Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		 
		 Thread.sleep(5000);
	

	 
	  
	  
}

@Test

public static void TestQuarterlySummaryReport() throws InterruptedException{
	
	//Not completed validating the last line of test step
	
	
    System.out.println("******logout_to_Salesforce automation script started***********");
     
	String expected="Yasmin Yassin";
	String expected2="Opportunities";
	String expected3="Opportunity Report";
	
	
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
	  
	  WebElement OpportunitiesTabEle= driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	  clickElement(OpportunitiesTabEle,"Opportunities Tab");
	  
	  WebElement OpportunitiesPageEle= driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[1]/div[1]/div[1]/h1"));
	  waitForVisibility(OpportunitiesPageEle, 5, "Opportunities Page"); 
	  String actual2= OpportunitiesPageEle.getText();
	  System.out.println("text is extracted from Opportunities Page element");
	  Assert.assertEquals(actual2, expected2,"Pass: testcase passed");
	  Thread.sleep(2000);
	  
	  WebElement IntervaldropdownEle=driver.findElement(By.id("quarter_q"));
	  selectByIndexData(IntervaldropdownEle,2,"Next FQ selection");
	  
	  WebElement IncludedropdownEle=driver.findElement(By.id("open"));
	  selectByIndexData(IncludedropdownEle,0,"All oportunities selection");
	  
	  WebElement RunReportButtonEle=driver.findElement(By.className("btn"));
	  clickElement(RunReportButtonEle,"Run Report button");
	  
	  Thread.sleep(2000);
	  
		/*
		 * WebElement OpportunitiesReportPageEle=
		 * driver.findElement(By.xpath("//*[@id="noTableContainer"]/div/div[1]/div[1]/div[1]/h1"));
		 * waitForVisibility(OpportunitiesReportPageEle, 5, "Opportunity Report Page");
		 * String actual3= OpportunitiesReportPageEle.getText();
		 * System.out.println("text is extracted from Opportunity Report Page element");
		 * Assert.assertEquals(actual3, expected3,"Pass: testcase passed");
		 * Thread.sleep(5000);
		 */
}
}
