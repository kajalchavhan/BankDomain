package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.CommonMethod;
import PageObjectModel.LogInPage;
import Resources.BaseClass;
import Resources.Constant;

public class VerifyLogIn extends BaseClass{
	
	public LogInPage LOG;
	
	@Test(priority=1)
   public void Login() {
	   LOG=new LogInPage(driver);
	   LOG.entreUser().sendKeys(Constant.Username);
	   LOG.entrePass().sendKeys(Constant.Password);
	   
   }
	
/*	@Test(priority=2)
	public void Customer() {
		
     LOG.clickSubmit().click();
	 LOG.entreCusName().sendKeys(Constant.firstName);
	 LOG.entreCusEmail().sendKeys(Constant.CustEmail);
	 LOG.clickcontactCust().click();
		   
	 String actsuccontactText=LOG.succontactText().getText();
	 String ExpsuccontactText=Constant.SuccesReg;
	 CommonMethod.handleAssersions(actsuccontactText,ExpsuccontactText, "customer care contact success text did not match");
	}
	*/
	
}
