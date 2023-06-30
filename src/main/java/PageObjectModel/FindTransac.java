package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindTransac {

	public WebDriver driver;
	private By TransID=By.xpath("//input[@id='criteria.transactionId']");
	private By TransDate=By.xpath("//input[@id='criteria.onDate']");
	private By fromDate=By.xpath("//input[@id='criteria.fromDate']");
	private By toDate=By.xpath("//input[@id='criteria.toDate']");
	private By amount=By.xpath("//input[@id='criteria.amount']");
	private By FindTransac=By.xpath("//h1[contains(text(),'Find Transactions')]");
	private By FindTransactions=By.xpath("//a[contains(text(),'Find Transactions')]");
	private By SubTransactions=By.xpath("(//button[@type='submit'])[4]");
	private By traResult=By.xpath("//h1[contains(text(),'Transaction Results')]");
	private By UpdateCon=By.xpath("//a[contains(text(),'Update Contact Info')]");
	private By profUp=By.xpath("//h1[contains(text(),'Profile Updated')]");
	private By subPro=By.xpath("//input[@value='Update Profile']");
	public FindTransac(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement SubTransactions() {
		return driver.findElement(SubTransactions);
	}
	public WebElement submitPro() {
		return driver.findElement(subPro);
	}
	public WebElement profUpText() {
		return driver.findElement(profUp);
	}
	public WebElement clickUpdateCon() {
		return driver.findElement(UpdateCon);
	}
	public WebElement traResultText() {
		return driver.findElement(traResult);
	}
	public WebElement clickFindTransactions() {
		return driver.findElement(FindTransactions);
	}
	public WebElement FindTransacText() {
		return driver.findElement(FindTransac);
	}
	public WebElement entreamount() {
		return driver.findElement(amount);
	}
	public WebElement entrefromDate() {
		return driver.findElement(fromDate);
	}
	public WebElement entretoDate() {
		return driver.findElement(toDate);
	}
	public WebElement entreTransDate() {
		return driver.findElement(TransDate);
	}
	public WebElement entreTransID() {
		return driver.findElement(TransID);
	}
}
