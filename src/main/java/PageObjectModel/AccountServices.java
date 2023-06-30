package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountServices {
	

		
		public WebDriver driver;
		private By AccOverview=By.xpath("//a[contains(text(),'Accounts Overview')]");
		private By TransferFunds=By.xpath("//a[contains(text(),'Transfer Funds')]");
		private By BillPay=By.xpath("//a[contains(text(),'Bill Pay')]");
		private By FindTransactions=By.xpath("//a[contains(text(),'Find Transactions')]");
		private By UpdateCon=By.xpath("//a[contains(text(),'Update Contact Info')]");
	
		private By ReqLoan=By.xpath("//a[contains(text(),'Request Loan')]");
		private By Amount=By.xpath("//input[@id='amount']");
		private By Transfer=By.xpath("//input[@value='Transfer']");
		private By TransferComp=By.xpath("//h1[@class='title']");
		private By FindTransac=By.xpath("//h1[contains(text(),'Find Transactions')]");
		private By newAcc=By.xpath("//a[contains(text(),'Open New Account')]");
		private By newAccText=By.xpath("//h1[contains(text(),'Open New Account')]");
		private By AccType=By.xpath("//select[@id='type']");
		private By opNewAcc=By.xpath("//input[@value='Open New Account']");
		
		private By availAmo=By.xpath("//th[contains(text(),'Available Amount')]");
		
		public AccountServices(WebDriver driver2) {
			// TODO Auto-generated constructor stub
			this.driver=driver2;
		}
		
		
		public WebElement availAmoText() {
			return driver.findElement(availAmo);
		}
		public WebElement clickopNewAcc() {
			return driver.findElement(opNewAcc);
		}
		public WebElement selectAccType() {
			return driver.findElement(AccType);
		}
		public WebElement getNewAccText() {
			return driver.findElement(newAccText);
		}
		public WebElement newAcc() {
			return driver.findElement(newAcc);
		}
		public WebElement FindTransacText() {
			return driver.findElement(FindTransac);
		}
		public WebElement TransferCompText() {
			return driver.findElement(TransferComp);
		}
		public WebElement amoTransfer() {
			return driver.findElement(Transfer);
		}
		public WebElement entreAmount() {
			return driver.findElement(Amount);
		}
		public WebElement clickReqLoan() {
			return driver.findElement(ReqLoan);
		}
		public WebElement clickUpdateCon() {
			return driver.findElement(UpdateCon);
		}
		public WebElement clickFindTransactions() {
			return driver.findElement(FindTransactions);
		}
		public WebElement clickBillPay() {
			return driver.findElement(BillPay);
		}
		public WebElement clickTransferFunds() {
			return driver.findElement(TransferFunds);
		}
		public WebElement clickAccountsOverview() {
			return driver.findElement(AccOverview);
		}
		
		private By payee=By.xpath("//input[@name='payee.name']");
		private By Add=By.xpath("//input[@name='payee.address.street']");
		private By city=By.xpath("//input[@name='payee.address.city']");
		private By payState=By.xpath("//input[@name='payee.address.state']");
		private By zip=By.xpath("//input[@name='payee.address.zipCode']");
		private By phNo=By.xpath("//input[@name='payee.phoneNumber']");
		private By Acc=By.xpath("//input[@name='payee.accountNumber']");
		private By veriAcc=By.xpath("//input[@name='verifyAccount']");
		private By Amm=By.xpath("//input[@name='amount']");
		private By SendPay=By.xpath("//input[@value='Send Payment']");
		
		public WebElement payeeState() {
			return driver.findElement(payState);
		}
		public WebElement clickSendPay() {
			return driver.findElement(SendPay);
		}
		public WebElement payeeAmo() {
			return driver.findElement(Amm);
		}
		public WebElement payeeveriAcc() {
			return driver.findElement(veriAcc);
		}
		public WebElement payeeAccNo() {
			return driver.findElement(Acc);
		}
		public WebElement payeePhNo() {
			return driver.findElement(phNo);
		}
		public WebElement PayeeZip() {
			return driver.findElement(zip);
		}
		public WebElement PayeeAdd() {
			return driver.findElement(Add);
		}
		public WebElement entrepayee() {
			return driver.findElement(payee);
		}
		public WebElement payeeCity() {
			return driver.findElement(city);
		}
	}


