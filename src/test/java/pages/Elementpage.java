package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import element.Elements;
import io.qameta.allure.Step;

public class Elementpage {
	Elements element = null;

	public Elementpage(WebDriver driver) {
		element = new Elements(driver);
	}

	@Step("Click on Element button")
	public Elementpage clickElementButton() {
		element.getElementButton().click();
		return this;
	}

	@Step("Verify different values under element section")
	public void verifyDiffValuesUnderElement() {
		element.getElementButton().click();
	}

	// TextBox
	@Step("Click on Tex tBox button")
	public Elementpage clickTextBoxButton() {
		element.getTextBoxButton().click();
		return this;
	}

	@Step("Enter Name")
	public Elementpage EnterName() {
		element.getName().sendKeys("Nikita");
		return this;

	}

	public Elementpage assertName(String name) {
		String actualname = element.getName().getAttribute("value");
		Assert.assertEquals(actualname, name);
		return null;

	}

	@Step("Enter email")
	public Elementpage EnterEmail() {
		element.getEmail().sendKeys("nikitanautiyal2001@gmail.com");
		return this;
	}

	public Elementpage assertEmail(String email) {
		String actualemail = element.getEmail().getAttribute("value");
		Assert.assertEquals(actualemail, email);
		return null;

	}

	@Step("Enter Current Address")
	public Elementpage EnterCurrentAddress() {
		element.getCurrentAddress().sendKeys("Vill.shyampur,premnagar,dehradun");
		return this;
	}

	public Elementpage assertCurrentAddress(String currentaddress) {
		String actualcurrentaddress = element.getCurrentAddress().getAttribute("value");
		System.out.println(currentaddress);
		Assert.assertEquals(actualcurrentaddress, currentaddress);
		return null;

	}

	@Step("Enter Permanent Address")
	public Elementpage EnterPermanentAddress() {
		element.getPermanentAddress().sendKeys("Vill.shyampur,premnagar,dehradun");
		return this;
	}

	public Elementpage assertPermanentAddress(String permanentaddress) {
		String actualpermanentaddress = element.getPermanentAddress().getAttribute("value");
		Assert.assertEquals(actualpermanentaddress, permanentaddress);
		return null;

	}

	@Step("Click  on Submit Button")
	public Elementpage clickSubmitButton() {
		element.getSubmitButton().click();
		return this;
	}
//
//	public Elementpage assertemail(String errormessage) {
//		String actualerrormessage = element.geterroremail().getAttribute("value");
//		Assert.assertEquals(actualerrormessage, errormessage);
//		return this;
//	}

//check box
	@Step("Click on Check Box Button")
	public Elementpage clickCheckBoxButton() {
		element.getCheckBoxButton().click();
		return this;
	}

	@Step("Click on Check Box Element button")
	public Elementpage clickCheckBoxElementButton() {
		element.getCheckBoxElementButton().click();
		return this;
	}

	public Elementpage assertCheckBox() {
		Assert.assertTrue(element.getCheckBox().isSelected());
		return null;
	}

	@Step("Click on Check Box Drop Down Element button")
	public Elementpage clickCheckBoxDropDownButton() {
		element.getCheckBoxDropdownButton().click();
		return this;
	}

//	public Elementpage assertDropDown() {
//		Assert.assertTrue(element.getDropdown().isSelected());
//		return null;
//	}
//Radio Button
	@Step("Click on Radio button")
	public Elementpage clickRadioButton() {
		element.getRadioButton().click();
		return this;
	}

	@Step("Click on Radio Button Element")
	public Elementpage clickRadioButtonElement() {
		element.getRadioButtonElement().click();
		return this;
	}

	public Elementpage assertRadioButton() {
		Assert.assertTrue(element.getButtonRadio().isSelected());
		return null;
	}

	// WebTables
	@Step("Click on WebTables button")
	public Elementpage clickWebTables() {
		element.getWebTables().click();
		return this;
	}

	@Step("Click on SerchBar ")
	public Elementpage clickSerchBar() {
		element.getSerchBar().sendKeys("Vega");
		return this;
	}

	@Step("Click on Add button")
	public Elementpage clickAddButton() {
		element.getAddButton().click();
		return this;
	}

	@Step("Click on close button")
	public Elementpage clickCloseForm() {
		element.getCloseButton().click();
		return this;
	}

//regestration form
	@Step("Enter First Name")
	public Elementpage enterFirstName() {
		element.getFirstName().sendKeys("Nikita");
		return this;
	}

	public Elementpage assertFirstName(String firstName) {
		String actualfirstName = element.getFirstName().getAttribute("value");
		Assert.assertEquals(actualfirstName, firstName);
		return null;

	}

	@Step("Enter Last Name")
	public Elementpage enterLastName() {
		element.getLastName().sendKeys("Nautiyal");
		return this;

	}

	public Elementpage assertLastName(String lastName) {
		String actuallastName = element.getLastName().getAttribute("value");
		Assert.assertEquals(actuallastName, lastName);
		return null;

	}

	@Step("Enter Email")

	public Elementpage enterEmailf() {
		element.getEmailf().sendKeys("nikitanautiyal@gmail.com");
		return this;

	}

	public Elementpage assertEmailf(String emailf) {
		String actualemailf = element.getEmailf().getAttribute("value");
		Assert.assertEquals(actualemailf, emailf);
		return null;

	}

	@Step("Enter Age")
	public Elementpage enterAge() {
		element.getAge().sendKeys("20");
		return this;

	}

	public Elementpage assertAge(String age) {
		String actualage = element.getAge().getAttribute("value");
		Assert.assertEquals(actualage, age);
		return null;

	}

	@Step(" Enter Salary")
	public Elementpage enterSalary() {
		element.getSalary().sendKeys("20000");
		return this;

	}

	public Elementpage assertSalary(String salary) {
		String actualsalary = element.getSalary().getAttribute("value");
		Assert.assertEquals(actualsalary, salary);
		return null;

	}

	@Step("Enter Department")
	public Elementpage enterDepartment() {
		element.getDepartment().sendKeys("Automation Testing");
		return this;

	}

	public Elementpage assertDepartment(String Department) {
		String actualDepartment = element.getDepartment().getAttribute("value");
		Assert.assertEquals(actualDepartment, Department);
		return null;

	}

	@Step("Click on Submit Button")
	public Elementpage clickSubmitButtoninform() {
		element.getSubmitButtoninform().click();
		return this;
	}

	@Step("Click on Record Editor Sign")
	public Elementpage clickRecordEditorSign() {
		element.getRecordEditorSign().click();
		return this;
	}

	@Step("Click on  button")
	public Elementpage clickButton() {
		element.getButton().click();
		return this;
	}

	@Step("Click on double click button")
	public Elementpage clickdoubleclickbutton() {
		element.getdoubleclickbutton().click();
		return this;

	}

	// links

	@Step("Click on Links")
	public Elementpage clickLinks() {
		element.getLinks().click();
		return this;
	}

	@Step("Click on Links")
	public Elementpage clickHomelink() {
		element.getHomelink().click();
		return this;
	}

	@Step("Click on Links")
	public Elementpage clickHomeGMRAFlink() {
		element.getHomeGMRAFlink().click();
		return this;
	}

	@Step("Click on Links")
	public Elementpage clickCreatedlink() {
		element.getCreatedlink().click();
		return this;
	}

	@Step("Click on Links")
	public Elementpage clickNoContentlink() {
		element.getNoContentlink().click();
		return this;
	}

	@Step("Click on Links")
	public Elementpage clickMovedlink() {
		element.getMovedlink().click();
		return this;
	}

	@Step("Click on Links")
	public Elementpage clickBadRequestlink() {
		element.getBadRequestlink().click();
		return this;
	}

	@Step("Click on Links")
	public Elementpage clickUnauthorizedlink() {
		element.getUnauthorizedlink().click();
		return this;
	}

	@Step("Click on Links")
	public Elementpage clickForbiddenlink() {
		element.getForbiddenlink().click();
		return this;
	}

	@Step("Click on ")
	public Elementpage clickNotFoundlink() {
		element.getNotFoundlink().click();
		return this;
	}

  
	
}
