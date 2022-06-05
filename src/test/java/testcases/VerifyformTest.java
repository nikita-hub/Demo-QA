package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import pages.Formpage;

public class VerifyformTest  extends Baseclass {

	@Feature("Form")
	@Description("verifyAlerts Frame and Windows")
	@Test
	public void verifyForm() {
		Formpage formpage = new Formpage(driver);
		formpage.clickForm();
	}
	@Feature("Form")
	@Description("verifyAlerts Frame and Windows")
	@Test
	public void verifyPracticeForm() {
		Formpage formpage = new Formpage(driver);
		formpage.clickForm();
		formpage.clickPracticeForm();
		formpage.clickfirstname();
		formpage.clicklastname();
		formpage.clickEmail();
		formpage.clickmale();
		formpage.clickFemale();
		formpage.clickOther();
		formpage.clickMobile();
		formpage.clickDateofBirth();
		formpage.clickSubjects();
		formpage.clickHobbiesSport();
		formpage.clickHobbiesReading();
		formpage.clickHobbiesMusic();
		formpage.clickCurrenttAdddress();
	
	}
//	@Feature("Form")
//	@Description("verifyAlerts Frame and Windows")
//	@Test
//	public void verifyPracticeForm() {
//		Formpage formpage = new Formpage(driver);
//		formpage.clickForm();
//		formpage.clickPracticeForm();
//	}
	
	
}
