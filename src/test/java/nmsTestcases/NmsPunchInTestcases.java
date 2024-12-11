package nmsTestcases;


import java.io.IOException;
import java.util.concurrent.TimeoutException;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nmsHelpers.NmsDataProvider;
import nmsHelpers.NmsDrivers;
import nmsHelpers.NmsExtentReport;
//import nmsmodules.NmsLoginModule;
import nmsmodules.NmsPunchInModule;
 
@Listeners(nmsHelpers.NmsListeners.class)
public class NmsPunchInTestcases extends NmsDrivers{

	int i=0;
    ExtentReports extent;
    ExtentTest test;
    NmsPunchInModule PunchIn = new NmsPunchInModule();
	
	
	
//	
//	@BeforeSuite
//	public void loader() {
//		load();
//	}
//	
//	@BeforeClass
//	public void setUp() {
//		NmsExtentReport.setupExtentReport();
//	}
//	
// 
//    @AfterSuite
//    public void tearDown() {
//      // driver.quit();
//    }
	
    @DataProvider(name = "ExcelData")
    public Object[][] excelData() throws IOException {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\NmsAutomationReport.xlsx";
//        System.out.println(filePath);
        String sheetName = "PunchIn";
        
        return NmsDataProvider.getExcelData(filePath, sheetName);
    }
    
    @Test(dataProvider = "ExcelData")
    public void attendance(String testId, String Description, String Workmode, String SelectProject, String Task, String Status) throws TimeoutException, InterruptedException {
//    	System.out.println("auth block");
    	NmsExtentReport.getTest().info("TC_ID: "+PunchIn.convertTcID(testId));
    	NmsExtentReport.getTest().info("Test Description: "+Description);
    	    	
    	
    	 new NmsPunchInModule()
    	 .clickPunchInButton()
    	 .selectWorkmode(Workmode)
    	 .submitButton()
    	 .DialogueBoxYes()
    	 .PunchboardTab();
	
    }
}