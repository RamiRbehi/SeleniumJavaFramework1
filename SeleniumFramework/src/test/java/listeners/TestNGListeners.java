package listeners;

//import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener
//, ISuite 
{
	
	public void onTestStart(ITestResult result) {
		System.out.println("********* Test Started :"+result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("********* Test is Successful :"+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("********* Test Failed :"+result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("********* Test Skippped :"+result.getName());
	}
	
	public void onTestFailureButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestResult context) {
		System.out.println("********* Tests Completed :"+context.getName());
	}
	
//	public void onStart(ISuite suite) {
//		
//	}
//	
//	public void onFinish(ISuite suite) {
//		
//	}
}
