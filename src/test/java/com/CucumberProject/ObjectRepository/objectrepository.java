package com.CucumberProject.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CucumberProject.Baseclass.BaseClass;

public class objectrepository extends BaseClass {
	private static objectrepository single_instance=null;
	public objectrepository() {
	PageFactory.initElements(driver, this);
	
	}
@FindBy(id="Name")	
public WebElement name;
@FindBy(id="Mobile")
public WebElement Mobilenumber;
@FindBy(id="Email")
public WebElement emailid;
@FindBy(id="password")
public WebElement Pass;
@FindBy(id="agree_terms")
public WebElement agreeterms;
@FindBy(id="form-signup-btn")
public WebElement sign;
@FindBy(xpath="//input[@name='pan']")	
public WebElement PanNo;
@FindBy(name="dob")
public WebElement dob;
@FindBy(xpath="//button[@type='submit']")
public WebElement Proceed;
@FindBy(xpath="//input[@name='annualIncome']")
public WebElement Aincome;
@FindBy(name="fatherName")
public WebElement Fathername;
@FindBy(name="motherName")
public WebElement motherName;
@FindBy(name="occupation")
public WebElement occupation;
@FindBy(name="strAddressLine1")
public WebElement strAddressLine1;
@FindBy(name="location")
public WebElement location;
@FindBy(name="strStateID")
public WebElement state;
@FindBy(name="strPincode")
public WebElement strPincode;
@FindBy(xpath="(//input[@type='checkbox'])[1]")
public WebElement CB;
@FindBy(xpath="(//input[@type='checkbox'])[2]")
public WebElement CB2;
@FindBy(xpath="(//input[@type='checkbox'])[3]")
public WebElement CB3;
@FindBy(xpath="(//input[@type='checkbox'])[4]")
public WebElement CB4;
@FindBy(xpath="//button[@type='submit']")
public WebElement addinfoproceed;
@FindBy(name="ifsc")
public WebElement ifsc;
@FindBy(name="account")
public WebElement accountnum;
@FindBy(xpath="(//input[@type='radio'])[1]")
public WebElement accholder;
@FindBy(xpath="//input[@name='terms']")
public WebElement CB5;
@FindBy(xpath="//button[text()='Verify']")
public WebElement linkverify;
@FindBy(xpath="//div[text()='Upload']")
public WebElement uploadcheque;
@FindBy(xpath="//input[@type='checkbox']")
public WebElement verify;
@FindBy(xpath="//button[@class='btn btn-primary btn-qpayment']")
public WebElement Continue;
@FindBy(className="link mt-3 d-inline-block")
public WebElement skip;
@FindBy(xpath="//div[@class='confirmation-title-message offline-payment mb ng-star-inserted']")
public WebElement confirmationpage;

public static objectrepository Singleton() 
{ 
    // To ensure only one instance is created 
    if (single_instance == null) 
    { 
        single_instance = new objectrepository(); 
    } 
    return single_instance; 
} 

public WebElement getName() {
	return name;
}
public void setName(WebElement name) {
	this.name = name;
}
public WebElement getMobilenumber() {
	return Mobilenumber;
}
public void setMobilenumber(WebElement mobilenumber) {
	Mobilenumber = mobilenumber;
}
public WebElement getEmailid() {
	return emailid;
}
public void setEmailid(WebElement emailid) {
	this.emailid = emailid;
}
public WebElement getPass() {
	return Pass;
}
public void setPass(WebElement pass) {
	Pass = pass;
}
public WebElement getAgreeterms() {
	return agreeterms;
}
public void setAgreeterms(WebElement agreeterms) {
	this.agreeterms = agreeterms;
}
public WebElement getSign() {
	return sign;
}
public void setSign(WebElement sign) {
	this.sign = sign;
}
public WebElement getPanNo() {
	return PanNo;
}
public void setPanNo(WebElement panNo) {
	PanNo = panNo;
}
public WebElement getDob() {
	return dob;
}
public void setDob(WebElement dob) {
	this.dob = dob;
}
public WebElement getProceed() {
	return Proceed;
}
public void setProceed(WebElement proceed) {
	Proceed = proceed;
}
public WebElement getAincome() {
	return Aincome;
}
public void setAincome(WebElement aincome) {
	Aincome = aincome;
}
public WebElement getFathername() {
	return Fathername;
}
public void setFathername(WebElement fathername) {
	Fathername = fathername;
}
public WebElement getMotherName() {
	return motherName;
}
public void setMotherName(WebElement motherName) {
	this.motherName = motherName;
}
public WebElement getOccupation() {
	return occupation;
}
public void setOccupation(WebElement occupation) {
	this.occupation = occupation;
}
public WebElement getStrAddressLine1() {
	return strAddressLine1;
}
public void setStrAddressLine1(WebElement strAddressLine1) {
	this.strAddressLine1 = strAddressLine1;
}
public WebElement getLocation() {
	return location;
}
public void setLocation(WebElement location) {
	this.location = location;
}
public WebElement getState() {
	return state;
}
public void setState(WebElement state) {
	this.state = state;
}
public WebElement getStrPincode() {
	return strPincode;
}
public void setStrPincode(WebElement strPincode) {
	this.strPincode = strPincode;
}
public WebElement getCB() {
	return CB;
}
public void setCB(WebElement cB) {
	CB = cB;
}
public WebElement getCB2() {
	return CB2;
}
public void setCB2(WebElement cB2) {
	CB2 = cB2;
}
public WebElement getCB3() {
	return CB3;
}
public void setCB3(WebElement cB3) {
	CB3 = cB3;
}
public WebElement getCB4() {
	return CB4;
}
public void setCB4(WebElement cB4) {
	CB4 = cB4;
}
public WebElement getAddinfoproceed() {
	return addinfoproceed;
}
public void setAddinfoproceed(WebElement addinfoproceed) {
	this.addinfoproceed = addinfoproceed;
}
public WebElement getIfsc() {
	return ifsc;
}
public void setIfsc(WebElement ifsc) {
	this.ifsc = ifsc;
}
public WebElement getAccountnum() {
	return accountnum;
}
public void setAccountnum(WebElement accountnum) {
	this.accountnum = accountnum;
}
public WebElement getAccholder() {
	return accholder;
}
public void setAccholder(WebElement accholder) {
	this.accholder = accholder;
}
public WebElement getCB5() {
	return CB5;
}
public void setCB5(WebElement cB5) {
	CB5 = cB5;
}
public WebElement getLinkverify() {
	return linkverify;
}
public void setLinkverify(WebElement linkverify) {
	this.linkverify = linkverify;
}
public WebElement getUploadcheque() {
	return uploadcheque;
}
public void setUploadcheque(WebElement uploadcheque) {
	this.uploadcheque = uploadcheque;
}
public WebElement getVerify() {
	return verify;
}
public void setVerify(WebElement verify) {
	this.verify = verify;
}
public WebElement getContinue() {
	return Continue;
}
public void setContinue(WebElement continue1) {
	Continue = continue1;
}
public WebElement getSkip() {
	return skip;
}
public void setSkip(WebElement skip) {
	this.skip = skip;
}
public WebElement getConfirmationpage() {
	return confirmationpage;
}
public void setConfirmationpage(WebElement confirmationpage) {
	this.confirmationpage = confirmationpage;
}

	
	}