package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import element.Widgets;
import io.qameta.allure.Step;

public class Widgetspage {
	Widgets widgets = null;

	public Widgetspage(WebDriver driver) {
		widgets = new Widgets(driver);
	}

	@Step("Click onWidgets Alerts Frame and Windows")
	public Widgetspage clickWidgets() {
		widgets.getWidgets().click();
		return this;
	}

	@Step("Click on Accordian")
	public Widgetspage clickAccordian() {
		widgets.getAccordian().click();
		return this;
	}

	@Step("Click on Lorem")
	public Widgetspage clickLorem() {
		widgets.getLorem().click();
		return this;
	}

	@Step("Click on loremcomefrom")
	public Widgetspage clickloremcomefrom() {
		widgets.getloremcomefrom().click();
		return this;
	}

	@Step("Click on useoflorem")
	public Widgetspage clickuseoflorem() {
		widgets.getuseoflorem().click();
		return this;
	}

//		AutoComplete
	@Step("Click on useoflorem")
	public Widgetspage clickAutocomplete() {
		widgets.getAutocomplete().click();
		return this;
	}

	@Step("Click on useoflorem")
	public Widgetspage clickmultiplecolor() {
		widgets.getmultiplecolor().sendKeys("Red","Blue");
		return this;
	}

	@Step("Click on useoflorem")
	public Widgetspage clicksinglecolor() {
		widgets.getsinglecolor().sendKeys("Red");
		return this;
	}
	//Date Picker
	
	@Step("Click on Date Picker")
	public Widgetspage clickDatepicker() {
		widgets.getDatepicker().click();
		return this;
	}
	@Step("Click on select date")
	public Widgetspage clickselectdate() {
		widgets.getselectdate().sendKeys("06/04/2022");
		widgets.getselectdate().sendKeys(Keys.ARROW_DOWN);
		widgets.getselectdate().sendKeys(Keys.ENTER);
		return this;
	}
	@Step("Click on date and time")
	public Widgetspage clickdateandtime() {
		widgets.getdateandtime().sendKeys("June 4, 2022 3:38 PM");
		return this;
	}
	//Progress Bar
	
	@Step("Click on Progress Bar")
	public Widgetspage clickProgressbar() {
		widgets.getProgressbar().click();
		return this;
	}
	@Step("Click on start button")
	public Widgetspage clickstart() {
		widgets.getstart().click();
		return this;
	}
	@Step("Click on stop ")
	public Widgetspage clickstop() {
		widgets.getstop().click();
		return this;
	}
	
	@Step("Click on reset")
	public Widgetspage clickreset() {
		widgets.getreset().click();
		return this;
	}
	
	//Tabs
	@Step("Click on Tabs")
	public Widgetspage clickTabs() {
		widgets.getTabs().click();
		return this;
	}
	@Step("Click on What")
	public Widgetspage clickWhat() {
		widgets.getWhat().click();
		return this;
	}
	@Step("Click on Origin")
	public Widgetspage clickOrigin() {
		widgets.getOrigin().click();
		return this;
	}
	@Step("Click on Use")
	public Widgetspage clickUse() {
		widgets.getUse().click();
		return this;
	}
}
