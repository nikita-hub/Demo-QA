package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import pages.Elementpage;
import pages.Windowspage;

public class VerifyAlertsFrameandWindowstest extends Baseclass  {
	@Feature("window")
	@Description("verifyAlerts Frame and Windows")
	@Test
	public void verifyAlertsFrameandWindows() {
		Windowspage windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
	}
	
	@Feature("window")
	@Description("verifyBrowserWindows")
	@Test
	public void verifyBrowserWindows() {
		Windowspage windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickBrowserWindows();
	}
	@Feature("window")
	@Description("New Tab")
	@Test
	public void verifyNewTab() {
		Windowspage windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickBrowserWindows();
		windowspage.clickNewTab();
	}
	@Feature("window")
	@Description("New window")
	@Test
	public void verifyNewWindow() {
		Windowspage windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickBrowserWindows();
		windowspage.clickNewWindow();
	}
	@Feature("window")
	@Description("New Window Message")
	@Test
	public void verifyNewWindowMessage() {
		Windowspage windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickBrowserWindows();
		windowspage.clickNewWindowMessage();
	}
	
	// Alert
	
	@Feature("window")
	@Description("Alerts")
	@Test
	public void verifyAlerts() {
		Windowspage windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickAlerts();
	
	}
	@Feature("window")
	@Description("click me")
	@Test
	public void verifyClickClickMe() {
		Windowspage windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickAlerts();
		windowspage.clickClickMe();
		windowspage.clickAlert();
	} 
	@Feature("window")
	@Description(" alert will appear after 5 seconds")
	@Test
	public void verifyClickMe() {
		Windowspage windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickAlerts();
		windowspage.clickMe();
	}
	
// frame
	
	@Feature("window")
	@Description("frame")
	@Test
	public void verifyframe() {
		Windowspage windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
	 	windowspage.clickframe();
	 	windowspage.clickframeelement();
	
	}
	
	//nested
	
	@Feature("window")
	@Description("Alerts")
	@Test
	public void verifynestedFramebutton() {
		Windowspage	windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clicknestedFramebutton();
	}
	
	//model
	
	@Feature("window")
	@Description("clicking on modal dialogs button")
	@Test
	public void verifymodeldialogbutton() {
		Windowspage	windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickmodeldialogbutton();
	}
	
	
	@Feature("window")
	@Description("clicking on small modal in modal dialog")
	@Test
	public void verifynestedFrameelement() {
		Windowspage	windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickmodeldialogbutton();
		windowspage.clicksmallmodal();
		
		
	}
	@Feature("window")
	@Description("clicking on close button in small modal alert")
	@Test
	public void verifysmallmodalclosebutton() {
		Windowspage	windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickmodeldialogbutton();
		windowspage.clicksmallmodal();
		windowspage.clickclosebuttonofsmall();
		
	}
	@Feature("window")
	@Description("clicking on cut button in small modal alert")
	@Test
	public void verifysmallmodalcutbutton() {
		Windowspage	windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickmodeldialogbutton();
		windowspage.clicksmallmodal();
		windowspage.clickcutbuttonofsmall();
		
		
	}
	@Feature("window")
	@Description("clicking on large modal button")
	@Test
	public void verifynestedFrameelementlarge() {
		Windowspage	windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickmodeldialogbutton();
		windowspage.clicklargemodal();
		
		
	}
	@Feature("window")
	@Description("clicking on close button in large modal alert")
	@Test
	public void verifylargemodaleclosebutton() {
		Windowspage	windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickmodeldialogbutton();
		windowspage.clicklargemodal();
		windowspage.clickclosebuttonoflarge();
		
		
	}
	@Feature("window")
	@Description("clicking on cut button in large modal alert")
	@Test
	public void verifylargemodalcutbuttont() {
		Windowspage	windowspage = new Windowspage(driver);
		windowspage.clickAlertsFrameandWindows();
		windowspage.clickmodeldialogbutton();
		windowspage.clicklargemodal();
		windowspage.clickcutbuttonoflarge();
		
		
	}
}
