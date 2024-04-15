package Passmate.test;
import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class listener implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test is getting started "+result.getName());
	}

	
	public void onTestSuccess(ITestResult  result) {
		System.out.println("Test is passed "+result.getName());

	}
	
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		System.out.println("Test is started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test is finished");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String projectpath=System.getProperty("user.dir");
		//String path="C:\\Users\\Ahmed Bilal\\git\\AB\\Passmate\\test-output\\myReport.html";
		String path=projectpath+"\\test-output\\myReport.html";
		SendMail.execute(path);

	}

	}
