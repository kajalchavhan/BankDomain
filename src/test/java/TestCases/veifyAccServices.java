package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.AccountServices;

import PageObjectModel.CommonMethod;
import PageObjectModel.LogInPage;
import PageObjectModel.RegesterPageObject;
import Resources.BaseClass;
import Resources.Constant;

public class veifyAccServices extends BaseClass {
	
	public AccountServices AS;
	public LogInPage LOG;
	
	@Test
	   public void Login() {
		
		LOG=new LogInPage(driver);
	    LOG.entreUser().sendKeys(VrifyRegester.username);
	    LOG.entrePass().sendKeys(Constant.Password);
	    LOG.clickSubmit().click();
	    
	  	
		 AS=new AccountServices(driver);
		 AS.newAcc().click();
		 AS.clickAccountsOverview().click();
		 AS.clickTransferFunds().click();
		  
		 AS.clickFindTransactions().click();
		 String ActTransacText=AS.FindTransacText().getText();
		 String ExpActTransacText=Constant.findTranscText;
		 CommonMethod.handleAssersions(ActTransacText,ExpActTransacText, "Transaction did not match");
		  
		 AS.clickUpdateCon().click();
		 AS.clickReqLoan().click();
		 AS.clickBillPay().click();
		 AS.entrepayee().sendKeys(Constant.firstName);
		 AS.PayeeAdd().sendKeys(Constant.State);
		 AS.payeeCity().sendKeys(Constant.City);
		 AS.payeeState().sendKeys(Constant.State);
		 AS.PayeeZip().sendKeys(Constant.ZipCode);
		 AS.payeePhNo().sendKeys(Constant.PhoneNum);
		 AS.payeeAccNo().sendKeys(Constant.AccNo);
		 AS.payeeveriAcc().sendKeys(Constant.AccNo);
		 AS.entreAmount().sendKeys(Constant.Ammount);
		 AS.clickSendPay().click();
		 
	   }
}
