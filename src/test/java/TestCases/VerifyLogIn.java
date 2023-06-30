package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.CommonMethod;
import PageObjectModel.LogInPage;
import Resources.baseClass;
import Resources.Constant;

public class VerifyLogIn extends baseClass{
	
	public LogInPage LOG;
	
	@Test(priority=2)
   public void Login() {
	   LOG=new LogInPage(driver);
	   LOG.entreUser().sendKeys(Constant.Username);
	   LOG.entrePass().sendKeys(Constant.Password);
	   LOG.clickSubmit().click();
   }
	
    @Test(priority=1)
	public void Customer() {
     LOG=new LogInPage(driver);	
     LOG.clickcontactCust().click();
	 LOG.entreCusName().sendKeys(Constant.firstName);
	 LOG.entreCusEmail().sendKeys(Constant.CustEmail);
	 LOG.entreCusphNum().sendKeys(Constant.PhoneNum);
	 LOG.entreCustMsg().sendKeys(Constant.CustMsg);
	 LOG.clickSendCare().click();
		   
	 String actsuccontactText=LOG.succontactText().getText();
	 String ExpsuccontactText=Constant.ConactSuc;
	 CommonMethod.handleAssersions(actsuccontactText,ExpsuccontactText, "customer care contact success text did not match");
	}
	
	
}
