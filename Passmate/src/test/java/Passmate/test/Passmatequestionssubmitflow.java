package Passmate.test;

import org.testng.annotations.Test;
import Passmate.pageobjects.passmatepageobjects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Passmatequestionssubmitflow {

	WebDriver driver=null;
	

	public ExtentHtmlReporter htmlReporter; //used 3.1.5 version
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest()
	@Parameters("browser")
	public void setup(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			driver=new ChromeDriver();

		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
//comment
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\test-output\\myReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
		htmlReporter.config().setReportName("Functional Testing"); // Name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// Passing General information
		extent.setSystemInfo("Host name", "Passmate");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "AB");
	}
		
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException 
	{
		// String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0));
		//		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		//		   LocalDateTime now = LocalDateTime.now();  
		//		  String dateName =  dtf.format(now);
		LocalDate dateName = java.time.LocalDate.now();
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}


	@Test(priority=1,enabled=true) 
	public void AboutyouQuestions() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://q.weareotimo.com/questions");
		Thread.sleep(10000);
		passmatepageobjects.postcodetextbox(driver).click();
		 //JavaScript Executor to enter text
//	      JavascriptExecutor j = (JavascriptExecutor) driver;
//	      j.executeScript("document.getElementsByName('postcode')[0].value= 'L11aa'");
		passmatepageobjects.postcodetextbox(driver).sendKeys("L11aa");
		Thread.sleep(2000);
		passmatepageobjects.postcodenextbutton(driver).click();
		Thread.sleep(2000);
		passmatepageobjects.SelectGender(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.SelectCarType(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.UserName(driver).sendKeys("Ahmed Automated");
		Thread.sleep(1000);
		passmatepageobjects.UserNameNextButton(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.UserEmail(driver).sendKeys("ahmed.bilal+script@wearenova.co.uk");
		Thread.sleep(1000);
		passmatepageobjects.UserEmailNextButton(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.UserPhone(driver).sendKeys("03238551688");
		Thread.sleep(1000);
		passmatepageobjects.UserPhoneNextButton(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.SelectLicenseRadio(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.EnterNotAvailableText(driver).sendKeys("Never!");
		Thread.sleep(1000);
		passmatepageobjects.ClickFinalNextOnPageOne(driver).click();
		Thread.sleep(2000);
		
		
	}

	@Test(priority=2,enabled=true,dependsOnMethods="AboutyouQuestions")
	public void LearningStyleQuestions() throws InterruptedException {

		String Actual=driver.findElement(By.cssSelector(".header-heading--main")).getText();
		String expected="Learning style questions";
		assertEquals(Actual, expected);
		passmatepageobjects.ClickLetsGo(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.ClickLS1(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.ClickLS2(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.ClickLS3(driver).click();
		Thread.sleep(1000);
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		//This will scroll the web page till end.		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		passmatepageobjects.ClickLS4(driver).click();
		Thread.sleep(1000);
		
		passmatepageobjects.ClickLS5(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.ClickLS6(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.ClickDrivingExpRadio(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.ClickAnythingelseYes(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.EnterAnythingelseText(driver).sendKeys("Automated Test Text Added By Selenium");
		Thread.sleep(1000);
		passmatepageobjects.ClickFinalSubmitButton(driver).click();
		Thread.sleep(12000);

	}

	@Test(priority=3,enabled=true,dependsOnMethods="LearningStyleQuestions")
	public void ResultsPage() throws InterruptedException {
		
		String Actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[1]")).getText();//Verifying the heading of results page
		System.out.println(Actual);
		String expected="We’ve found the best driving instructors for you in your area";
		assertEquals(Actual, expected);

		String Actual1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div[1]/div[1]/div[3]/div[1]")).getText();//Verifying the driver bio question one
		String expected1="How would your pupils describe your teaching style?";
		assertEquals(Actual1, expected1);

		WebElement FAQ= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[1]"));//Verifying the FAQ Link
		WebElement Requestcallback= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/a[2]"));//Verifying the Call Back Link
		assertEquals(true, FAQ.isDisplayed(),"FAQ is Present!");
		assertEquals(true, Requestcallback.isDisplayed(),"Request call back is present!");
		Thread.sleep(2000);
		passmatepageobjects.SeeAllOffers(driver).click();
		Thread.sleep(5000);


	}

	@Test(priority=3,enabled=true,dependsOnMethods="ResultsPage")
	public void DriverProfile() throws InterruptedException {


		//		String Actual= driver.findElement(By.cssSelector("#root > div > div > div > div.instructor-card-details__first > div.instructor-card-details__profile-booking > div.instructor-card-details__block-booking.xs-hide > div:nth-child(2) > h6.jss740.jss758.instructor-card-details__recently-helped")).getText();
		//		String expected=" 10 hours";
		//		
		//		assertEquals(Actual, expected);
		passmatepageobjects.ClickBookNow(driver).click();
		Thread.sleep(8000);
		//		String Actual1= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/div[3]/h6[1]")).getText();
		//		String expected1=" 20 hours";
		//		assertEquals(Actual1, expected1);
		//		String Actual2= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div[2]/div[4]/h6[1]")).getText();
		//		String expected2=" 30 hours";
		//		assertEquals(Actual2, expected2);


	}

	@Test(priority=4,enabled=true,dependsOnMethods="DriverProfile")
	public void Checkout() throws InterruptedException {

		passmatepageobjects.applycode(driver).sendKeys("20");
		passmatepageobjects.clickapplybutton(driver).click();
		Thread.sleep(4000);
		String codetoastactual=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/form/div[3]/div/div/div[1]")).getText();
		System.out.println(codetoastactual);
		String expected="Great! You’ve got £20 off your remaining balance. Pay the £25 deposit now and your remaining balance will be £515";
		assertEquals(codetoastactual, expected);
		Thread.sleep(2000);
		passmatepageobjects.cardname(driver).sendKeys("AB Automated");
		driver.switchTo().frame("__privateStripeFrame7");
		Thread.sleep(2000);
		passmatepageobjects.Cardnumber(driver).sendKeys("4111111111111111");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("__privateStripeFrame8");
		Thread.sleep(1000);
		passmatepageobjects.CardDate(driver).click();
		passmatepageobjects.CardDate(driver).sendKeys("02/22");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("__privateStripeFrame9");
		passmatepageobjects.AddCVV(driver).sendKeys("243");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		passmatepageobjects.closepopup(driver).click();
		Thread.sleep(1000);
		passmatepageobjects.ClickPay(driver).click();
		Thread.sleep(6000);
		String actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/h1")).getText();
		String expectedmessage="Thanks for booking through passmate!";
		assertEquals(actual, expectedmessage);
		System.out.println("Successfully Completed the Passmate Suite!");
		
		
	}

	@AfterMethod(alwaysRun=true)
	public void end(ITestResult result) throws IOException
	{
		test= extent.createTest("The Test is "+result.getName());

		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent report
			String screenshotPath = Passmatequestionssubmitflow.getScreenshot(driver, result.getName());
			test.addScreenCaptureFromPath(screenshotPath); // adding screen shot
		} 
		else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "TEST CASE SKIPPED IS " + result.getName());
		}
		else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "TEST CASE PASSED IS " + result.getName());
			//test.log(Status.PASS, "Entered the postcode, Selected the GENDER as Female, Selected the CARTYPE as Manual, ");
		}
	}

	@AfterTest(alwaysRun=true)
	public void flush() throws Exception 
	{
		System.out.println("Quitting the sessions now after test.");
		extent.flush();
		driver.quit();
	}
}
