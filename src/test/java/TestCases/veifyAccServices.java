package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.AccountServices;

import PageObjectModel.CommonMethod;
import PageObjectModel.LogInPage;
import PageObjectModel.RegesterPageObject;
import Resources.baseClass;
import Resources.Constant;

public class veifyAccServices extends baseClass {
	
	public AccountServices AS;
	public LogInPage LOG;
	
	@Test
	   public void AccountServices() {
		
		LOG=new LogInPage(driver);
	    LOG.entreUser().sendKeys(VrifyRegester.username);
	    LOG.entrePass().sendKeys(Constant.Password);
	    LOG.clickSubmit().click();
	    
	  	
		 AS=new AccountServices(driver);
		 
		//new Account verification---
		 AS.newAcc().click();
		 String ActnewAccText=AS.getNewAccText().getText();
		 String ExpnewAccText=Constant.newAccOpText;
		 CommonMethod.handleAssersions(ActnewAccText,ExpnewAccText, "New Account open text did not match");
		 AS.selectAccType().click();
		 CommonMethod.handleDropdown(AS.selectAccType(), 1);
		 AS.clickopNewAcc().click();
		 
		 AS.clickAccountsOverview().click();
		 String ActAvailText=AS.availAmoText().getText();
		 String ExpAvailText=Constant.AvailAmoText;
		 CommonMethod.handleAssersions(ActAvailText,ExpAvailText, "Transaction complete text did not match");
		 
		 //verify transfer Amount---
		 AS.clickTransferFunds().click();
		 AS.amoTransfer().sendKeys(Constant.Ammount);
		 AS.clickTransferFunds().click();
		 String ActTransText=AS.TransferCompText().getText();
		 String ExpTransTextText=Constant.TransferComText;
		 CommonMethod.handleAssersions(ActTransText,ExpTransTextText, "Transaction complete text did not match");
		 
		 //BillPay verification---
		 AS.clickBillPay().click();
		 AS.entrepayee().sendKeys(Constant.firstName);
		 AS.PayeeAdd().sendKeys(Constant.State);
		 AS.payeeCity().sendKeys(Constant.City);
		 AS.payeeState().sendKeys(Constant.State);
		 AS.PayeeZip().sendKeys(Constant.ZipCode);
		 AS.payeePhNo().sendKeys(Constant.PhoneNum);
		 AS.payeeAccNo().sendKeys(Constant.AccNo);
		 AS.payeeveriAcc().sendKeys(Constant.AccNo);
		 AS.payeeAmo().sendKeys(Constant.Ammount);
		 AS.clickSendPay().click();
		 
		 //verify Transactions---
		 AS.clickFindTransactions().click();
		 String ActTransacText=AS.FindTransacText().getText();
		 String ExpActTransacText=Constant.findTranscText;
		 CommonMethod.handleAssersions(ActTransacText,ExpActTransacText, "Transaction text did not match");
		 
		 AS.clickUpdateCon().click();
		 AS.clickReqLoan().click();
	   }
}
