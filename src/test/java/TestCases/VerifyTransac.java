package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.CommonMethod;
import PageObjectModel.FindTransac;
import PageObjectModel.LogInPage;
import Resources.baseClass;
import Resources.Constant;

public class VerifyTransac extends baseClass {
public LogInPage LOG;
public FindTransac FTO;
	
	@Test
	   public void FindTransactions() {
		
		LOG=new LogInPage(driver);
	    LOG.entreUser().sendKeys(VrifyRegester.username);
	    LOG.entrePass().sendKeys(Constant.Password);
	    LOG.clickSubmit().click();
	    
	  //verify Transactions---
	    
	    FTO=new FindTransac(driver);
	    FTO.clickFindTransactions().click();
		String ActTransacText=FTO.FindTransacText().getText();
		String ExpActTransacText=Constant.findTranscText;
		CommonMethod.handleAssersions(ActTransacText,ExpActTransacText, "Transaction text did not match");
		 
		FTO.clickFindTransactions().click();
	    FTO.entreTransID().sendKeys(Constant.transID);
	    
	    FTO.clickFindTransactions().click();
	    FTO.entreTransDate().sendKeys(Constant.transDate);
	    
	    FTO.clickFindTransactions().click();
	    FTO.entrefromDate().sendKeys(Constant.transDate);
	    FTO.entretoDate().sendKeys(Constant.transDate);
	    
	    FTO.clickFindTransactions().click();
	    FTO.entreamount().sendKeys(Constant.Ammount);
	    FTO.SubTransactions().click();
	   String ActTransReText=FTO.traResultText().getText();
		String ExpTransReText=Constant.transresult;
		CommonMethod.handleAssersions(ActTransReText,ExpTransReText, "Transaction Result text did not match");
	    
		//Verify transactions--
		FTO.clickUpdateCon().click();
		/*FTO.submitPro().click();
		String ActproUpText=FTO.profUpText().getText();
		String ExpproUpText=Constant.proUp;
		CommonMethod.handleAssersions(ActproUpText,ExpproUpText, "Profile updated text did not match");
		*/
	}
	

}
