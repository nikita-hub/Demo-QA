package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import pages.Widgetspage;


public class VerifyWidgetsTest extends Baseclass  {
	@Feature("Widgets")
	@Description("verify Widgets")
	@Test
	public void verifyWidgets() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
	}
	@Feature("Widgets")
	@Description("verify Accordian")
	@Test
	public void verifyAccordian() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickAccordian();
	}
	@Feature("Widgets")
	@Description("verify Accordian element")
	@Test
	public void verifyAccordianelement() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickAccordian();
		widgetspage.clickLorem();
		widgetspage.clickloremcomefrom();
		widgetspage.clickuseoflorem();
	}
	
	//Autocomplete
	@Feature("Widgets")
	@Description("verify Autocomplete")
	@Test
	public void verifyAutocomplete() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickAutocomplete();
	}
	@Feature("Widgets")
	@Description("verify Autocomplete")
	@Test
	public void verifyAutocompletemulti() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickAutocomplete();
		widgetspage.clickmultiplecolor();
	}
	@Feature("Widgets")
	@Description("verify Autocomplete")
	@Test
	public void verifyAutocompletesingle() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickAutocomplete();
		widgetspage.clicksinglecolor();
	}
	
	//Date Picker
	
	@Feature("Widgets")
	@Description("verify Date Picker")
	@Test
	public void verifyDatePicker() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickDatepicker();
		widgetspage.clickselectdate();
		Widgetspage.clickmonths();
		widgetspage.clickdateandtime();
	}
	
	//Progress Bar
	
	@Feature("Widgets")
	@Description("verify Progress Bar")
	@Test
	public void verifyProgressBar() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickProgressbar();
	}
	@Feature("Widgets")
	@Description("verify start")
	@Test
	public void verifystart() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickProgressbar();
		widgetspage.clickstart();
		
}
	@Feature("Widgets")
	@Description("verify stop")
	@Test
	public void verifystop() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickProgressbar();
		widgetspage.clickstart();
		widgetspage.clickstop();
	
	}
	@Feature("Widgets")
	@Description("verify reset")
	@Test
	public void verifyreset() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickProgressbar();
		widgetspage.clickstart();
		widgetspage.clickstop();
		widgetspage.clickreset();
	}
	
	//Tabs
	
	@Feature("Tabs")
	@Description("verify Tabs")
	@Test
	public void verifyTabs() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickTabs();
	}
	@Feature("Widgets")
	@Description("verify What")
	@Test
	public void verifyWhat() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickTabs();
		widgetspage.clickWhat();
		
}
	@Feature("Widgets")
	@Description("verify Origin")
	@Test
	public void verifyOrigin() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickTabs();
		widgetspage.clickOrigin();
	
	}
	@Feature("Widgets")
	@Description("verify use")
	@Test
	public void verifyuse() {
		Widgetspage widgetspage = new Widgetspage(driver);
		widgetspage.clickWidgets();
		widgetspage.clickTabs();
		widgetspage.clickUse();
		
	}
	//toolstip
}
