package Passmate.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class passmatepageobjects {
	
	
	private static WebElement element=null;
	
	//About You Locators
	
	public static WebElement postcodetextbox(WebDriver driver) 
	{
		element=driver.findElement(By.name("postcode"));
		return element;
	}
	
	public static WebElement postcodenextbutton(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step0\"]/div/div/div/div/div[2]/div/button"));
		return element;
	}
	
	public static WebElement SelectGender(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"Female\"]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement SelectCarType(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"Manual\"]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement UserName(WebDriver driver) 
	{
		element=driver.findElement(By.name("name"));
		return element;
	}
	
	public static WebElement UserNameNextButton(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step3\"]/div/div/div/div/div[2]/div/button[2]"));
		return element;
	}
	
	public static WebElement UserEmail(WebDriver driver) 
	{
		element=driver.findElement(By.name("email"));
		return element;
	}
	
	public static WebElement UserEmailNextButton(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step4\"]/div/div/div/div/div[2]/div/button[2]"));
		return element;
	}
	
	public static WebElement UserPhone(WebDriver driver) 
	{
		element=driver.findElement(By.name("phoneNumber"));
		return element; 
	}
	
	public static WebElement UserPhoneNextButton(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step5\"]/div/div/div/div/div[2]/div/button[2]"));
		return element;
	}
	
	public static WebElement SelectLicenseRadio(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"Yes\"]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement EnterNotAvailableText(WebDriver driver) 
	{
		element=driver.findElement(By.name("availability"));
		return element; 
	}
	
	public static WebElement ClickFinalNextOnPageOne(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step7\"]/div/div/div/div/div[2]/div/button[2]"));
		return element;
	}
	
	//Learning Style Locators
	
	public static WebElement ClickLetsGo(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/form/div[2]/div/div/button[1]/span[1]"));
		return element;
	}
	
	public static WebElement ClickLS1(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step0\"]/div/div/div/div/div[1]/label[4]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement ClickLS2(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div/div/div/div[1]/label[5]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement ClickLS3(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step2\"]/div/div/div/div/div[1]/label[3]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement ClickLS4(WebDriver driver) 
	{//*[@id="step3"]/div/div/div/div/div[1]/label[1]/span[1]/span[1]/input
		element=driver.findElement(By.xpath("//*[@id=\"step3\"]/div/div/div/div/div[1]/label[2]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement ClickLS5(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step4\"]/div/div/div/div/div[1]/label[3]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement ClickLS6(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step5\"]/div/div/div/div/div[1]/label[3]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement ClickDrivingExpRadio(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"I've had some lessons before\"]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement ClickAnythingelseYes(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"Yes\"]/span[1]/span[1]/input"));
		return element;
	}
	
	public static WebElement EnterAnythingelseText(WebDriver driver) 
	{
		element=driver.findElement(By.name("requirementsText"));
		return element; 
	}
	
	public static WebElement ClickFinalSubmitButton(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"step7\"]/div/div/div/div/div/div/button[2]"));
		return element;
	}
	
	
	//Results page locators
	public static WebElement SeeAllOffers(WebDriver driver) {
		
		//System.out.println(driver.findElements(By.xpath("//*[@name='see20']")).get(1));
		//element=driver.findElement(By.cssSelector(".instructor-card:nth-child(1) > #see-all-offer #see-all-offer-btn"));
		element=driver.findElements(By.xpath("//*[@name='see20']")).get(1);//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='see20']")));
		
		return element;
	}
	

	//Driver Profile Locators
	
	public static WebElement ClickBookNow(WebDriver driver) {
		element=driver.findElement(By.name("book2"));
		return element;
	}

   //checkout locators
	public static WebElement applycode(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/form/div[1]/div[5]/input"));
		return element;
	}
	
	public static WebElement clickapplybutton(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/form/div[1]/div[5]/button"));
		return element;
	}
	
	
	
	public static WebElement cardname(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"cardHolderName\"]/input")); //*[@id="cardHolderName"]/input
		return element;
	}
	public static WebElement Cardnumber(WebDriver driver) 
	{
		element=driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/div/div[2]/span/input"));
		return element;
	}
	
	public static WebElement CardDate(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/span/input"));
		return element;
		
	}
	
	public static WebElement AddCVV(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"root\"]/form/span[2]/span/input"));
		return element;
		
	}
	
	public static WebElement closepopup(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/form/div[3]/div/div/button")); //*[@id="root"]/div/div[3]/div[2]/form/div[2]/button[1]
		return element;
		
	}
	public static WebElement ClickPay(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/form/div[2]/button[1]")); //*[@id="root"]/div/div[3]/div[2]/form/div[2]/button[1]
		return element;
		
	}
}
