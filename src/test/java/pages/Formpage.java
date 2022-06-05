package pages;



import org.openqa.selenium.WebDriver;

import element.Forms;
import element.Windows;
import io.qameta.allure.Step;

public class Formpage {
	Forms form = null;

	public Formpage(WebDriver driver) {
		form = new Forms (driver);
	}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickForm() {
		 form.getForm().click();
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickPracticeForm() {
		 form.getPracticeForm().click();
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickfirstname() {
		 form.getfirstname().sendKeys("Nikita");
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clicklastname() {
		 form.getlastname().sendKeys("Nautiyal");
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickEmail() {
		 form.getEmail().sendKeys("niki2001@gmail.com");
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickmale() {
		 form.getmale().click();
			return this;
		}
	 
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickFemale() {
		 form.getFemale().click();
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickOther() {
		 form.getOther().click();
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickMobile() {
		 form.getMobile().sendKeys("8449014174");
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickDateofBirth() {
		 form.getDateofBirth().click();
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickSubjects() {
		 form.getSubject().sendKeys("hindi");
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickHobbiesSport() {
		 form.getHobbiesSport().click();
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickHobbiesReading() {
		 form.getHobbiesReading().click();
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickHobbiesMusic() {
		 form.getHobbiesMusic().click();
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickPicture() {
		 form.getpicture().click();
			return this;
		}
	 @Step("Click on Alerts Frame and Windows")
	 public Formpage clickCurrenttAdddress() {
		 form.getCurrentAddress().sendKeys("premnagar");
			return this;
		}
}
