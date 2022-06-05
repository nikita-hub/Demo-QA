package pages;

import org.openqa.selenium.WebDriver;


import element.Windows;
import io.qameta.allure.Step;

public class Windowspage {
	Windows window = null;

	public Windowspage(WebDriver driver) {
		window = new Windows(driver);
	}
	   @Step("Click on Alerts Frame and Windows")
		 public Windowspage clickAlertsFrameandWindows() {
	     window.getAlertsFrameandWindows().click();
				return this;
			}

		@Step("Click on Browser Windows")
		public Windowspage  clickBrowserWindows() {
			 window.getBrowserWindows().click();
			return this;
		}
		@Step("Click on New Tab")
		public Windowspage  clickNewTab() {
			 window.getNewTab().click();
			return this;
		}
		@Step("Click on New Window")
		public Windowspage clickNewWindow() {
			 window.getNewWindow().click();
			return this;
		}
		@Step("Click on  New Window Message")
		public Windowspage  clickNewWindowMessage() {
			 window.getNewWindowMessage().click();
			return this;
		}
		@Step("Click on Alert ")
		public Windowspage  clickAlerts() {
			 window.getAlerts().click();
			return this;
		}
		@Step("Click on Click Me ")
		public Windowspage  clickClickMe() {
			 window.getClickClickMe().click();
			
			return this;
		}
		@Step("Click on Alert ")
		public Windowspage  clickAlert() {
			 window.getAlert().click();
			return this;
		}
		@Step("Click on Alert ")
		public Windowspage  clickMe() {
			 window.getclickMe().click();
			return this;
		}
		//frame
		
		@Step("Click on Alert ")
		public Windowspage  clickframe() {
			 window.getframe().click();
			return this;
		}
		@Step("Click on Alert ")
		public Windowspage  clickframeelement() {
			 window.getframeelement();
			return this;
		}
		//nested
		
		@Step("Click on nested frame ")
		public Windowspage  clicknestedFramebutton() {
			 window.getnestedFramebutton().click();
			return this;
		}
//model
		
		@Step("Click on nested frame ")
		public Windowspage  clickmodeldialogbutton() {
			 window.getmodeldialogbutton().click();
			return this;
		}
		@Step("click on small modal ")
		public Windowspage  clicksmallmodal() {
			 window.getsmallmodal().click();
			return this;
		}
		
		@Step("Click on small model close button ")
		public Windowspage  clickclosebuttonofsmall() {
			 window.getclosebuttonofsmall().click();
			return this;
		}
		@Step("Click on small button cut button ")
		public Windowspage  clickcutbuttonofsmall() {
			 window.getcutbuttonofsmall().click();
			return this;
		}

		@Step("Click on large modal ")
		public Windowspage  clicklargemodal() {
			 window.getlargemodal().click();
			return this;
		}
		
		@Step("Click on large model close button ")
		public Windowspage  clickclosebuttonoflarge() {
			 window.getclosebuttonoflarge().click();
			return this;
		}
		@Step("Click on large model cut button ")
		public Windowspage  clickcutbuttonoflarge() {
			 window.getcutbuttonoflarge().click();
			return this;
		}
}
