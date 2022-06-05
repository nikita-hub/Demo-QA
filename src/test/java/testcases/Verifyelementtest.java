package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import pages.Elementpage;

public class Verifyelementtest extends Baseclass {

	@Feature("Element")
	@Description("verifyelementTest")
	@Test
	public void verifyelementTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();

		elementpage.verifyDiffValuesUnderElement();
	}

	@Feature("Element")
	@Description("UrlTest")
	@Test
	public void UrlTest() {
		String expected = "https://demoqa.com/";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}
	// TextboxTest

	@Feature("Element")
	@Description("verifyTestBoxTest")
	@Test
	public void verifyTestBoxTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickTextBoxButton();
		System.out.println("clicked in text box");

	}

	@Feature("Element")
	@Description("verifyEnterFielsInTextBoxTest")
	@Test
	public void verifyEnterFielsInTextBoxTest() {

		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickTextBoxButton();
		elementpage.EnterName();
		elementpage.EnterEmail();
		elementpage.EnterCurrentAddress();
		elementpage.EnterPermanentAddress();
		elementpage.clickSubmitButton();
		elementpage.assertName(data.getName());
		elementpage.assertEmail(data.getEmail());
		elementpage.assertCurrentAddress(data.getCurrentAddress());
		elementpage.assertPermanentAddress(data.getPermanentAddress());
		// elementpage.assertemail(data.geterrormessage());

	}

	@Feature("Element")
	@Description("verifySubmitButttonintextboxTest")
	@Test
	public void verifySubmitButttonintextboxTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickTextBoxButton();

		elementpage.clickSubmitButton();

	}
////
////	@Test
////	public void TexturlTest()
////	{ 
////		String expected="https://demoqa.com/text-box";
////		String actual= driver.();
////		Assert.assertEquals(actual, expected);
////	}

//	// check box

	@Feature("Element")
	@Description("verifyChecktBox")
	@Test
	public void verifyChecktBoxTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickCheckBoxButton();
		System.out.println("check box clicked");

	}

	@Feature("Element")
	@Description("verifyChecktBoxButtonTest")
	@Test
	public void verifyChecktBoxButtonTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickCheckBoxButton();
		elementpage.clickCheckBoxElementButton();

		// Assert.assertFalse(driver.findElement(By.xpath("//*[@id='tree-node']/ol/li//input")).isSelected());
		elementpage.assertCheckBox();
	}

	@Feature("Element")
	@Description("verifyChecktBoxDropDownButtontTest")
	@Test
	public void verifyChecktBoxDropDownButtontTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickCheckBoxButton();
		elementpage.clickCheckBoxDropDownButton();
		// Assert.assertFalse(driver.findElement(By.cssSelector("#tree-node > ol > li >
		// span > button")).isSelected());
		// elementpage.assertDropDown();
	}

	// radio button

	@Feature("Element")
	@Description("verifyRadioButtontElementTest")
	@Test
	public void verifyRadioButtontElementTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickRadioButton();
		elementpage.clickRadioButtonElement();
		// Assert.assertTrue(driver.findElement(By.xpath("//*[@id='yesRadio']")).isSelected());
		elementpage.assertRadioButton();

	}

//WebTool
	@Feature("Element")
	@Description("verifyWebTablesTest")
	@Test
	public void verifyWebTablesTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickWebTables();

	}

	@Feature("Element")
	@Description("verifySearchBarTest")
	@Test
	public void verifySearchBarTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickWebTables();
		elementpage.clickSerchBar();

	}

	@Feature("Element")
	@Description("verifyAddButtonTest")
	@Test
	public void verifyAddButtonTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickWebTables();
		elementpage.clickAddButton();
	

	}

	@Feature("Element")
	@Description("verifyEnterRegistrationFormField")
	@Test
	public void verifyEnterRegistrationFormField() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickWebTables();
		elementpage.clickAddButton();
		elementpage.enterFirstName();
		elementpage.enterLastName();
		elementpage.enterEmailf();
		elementpage.enterAge();
		elementpage.enterSalary();
		elementpage.enterDepartment();
		System.out.println(data.getName());
		elementpage.assertFirstName(data.getFirstName());
		elementpage.assertLastName(data.getLastName());
		elementpage.assertEmailf(data.getEmailf());
		elementpage.assertAge(data.getAge());
		elementpage.assertSalary(data.getSalary());
		elementpage.assertDepartment(data.getDepartment());
		elementpage.clickSubmitButtoninform();
	}
	@Feature("Element")
	@Description("verifySubmitButttoninformTest")
	@Test
	public void verifyCloseFormTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickWebTables();
		elementpage.clickAddButton();
		elementpage.clickCloseForm();
	}
	@Feature("Element")
	@Description("verifySubmitButttoninformTest")
	@Test
	public void verifySubmitButttoninformTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickWebTables();
		elementpage.clickAddButton();
		elementpage.clickSubmitButtoninform();
	}

	@Feature("Element")
	@Description("verifyRecordEditorTest")
	@Test
	public void verifyRecordEditorTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickWebTables();
		elementpage.clickRecordEditorSign();
	}

	// Button

	@Feature("Element")
	@Description("verifyButtonTest")
	@Test
	public void verifyButtonTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickButton();

	}
//	@Feature("Element")
//	@Description("verifyButtonTest")
//	@Test
//	public void verifyButtonElementdoubleclickTest() 
//	{
//		Elementpage elementpage = new Elementpage(driver);
//		elementpage.clickElementButton();
//		elementpage.clickButton();
//        elementpage.clickdoubleclickbutton();
//        
//}
	//links
	
	@Feature("Element")
	@Description("verifylinksTest")
	@Test
	public void verifylinksTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
	}
	@Feature("Element")
	@Description("verifyHomeGMRAFlinkTest")
	@Test
	public void verifyHomelinkTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
		elementpage.clickHomelink();
	}
	@Feature("Element")
	@Description("verifyHomeGMRAFlinkTest")
	@Test
	public void verifyHomeGMRAFlinkTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
		elementpage.clickHomeGMRAFlink();
	}
	@Feature("Element")
	@Description("verifyCreatedlinkTest")
	@Test
	public void verifyCreatedlinkTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
		elementpage.clickCreatedlink();
	}
	@Feature("Element")
	@Description("verifyNo ContentlinkTest")
	@Test
	public void verifyNoContentlinkTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
		elementpage.clickNoContentlink();
	}
	@Feature("Element")
	@Description("verifyHomeGMRAFlinkTest")
	@Test
	public void verifyMovedlinkTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
		elementpage.clickMovedlink();
	}
	@Feature("Element")
	@Description("verifyHomeGMRAFlinkTest")
	@Test
	public void verifyBadRequestTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
		elementpage.clickBadRequestlink();
	}
	@Feature("Element")
	@Description("verifyUnauthorizedTest")
	@Test
	public void verifyUnauthorizedTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
		elementpage.clickUnauthorizedlink();
	}
	@Feature("Element")
	@Description("verifyForbiddenTest")
	@Test
	public void verifyForbiddenTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
		elementpage.clickForbiddenlink();
	}
	@Feature("Element")
	@Description("verifyNotFoundTest")
	@Test
	public void verifyNotFoundTest() {
		Elementpage elementpage = new Elementpage(driver);
		elementpage.clickElementButton();
		elementpage.clickLinks();
		elementpage.clickNotFoundlink();
	}
}
	
	
	

