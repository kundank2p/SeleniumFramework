package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListners implements ITestListener {

   //This belongs to ITestListners and will execute before starting of test set/batch
    public void onStart (ITestContext arg)
    {
        System.out.println("Starts test execution.." +arg.getName());
    }
    //This belongs to ITestListner and will execute after starting of Test set/batch
    public void onFinish (ITestContext arg){
        System.out.println("Finish Test Execution" +arg.getName());
    }
    //This  belongs to ITestListner and will execute before the main test start i.e. @Test
    public void onTestStart (ITestResult arg0){
        System.out.println("Start Test Execution" +arg0.getName());
    }
    //This belongs to ITestListeners and will execute when a test is skipped
    public void onTestSkipped(ITestResult arg0){
        System.out.println("Skipped Test" +arg0.getName());
    }
    //This belongs to ITestListeners and will execute when a test is failed
    public void onTestFailure(ITestResult arg0){
        System.out.println("Failed Test" +arg0.getName());
    }
}
