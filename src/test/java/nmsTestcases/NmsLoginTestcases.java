package nmsTestcases;
 
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import nmsHelpers.NmsDataProvider;
import nmsHelpers.NmsDrivers;
import nmsHelpers.NmsExtentReport;
import nmsLocations.NmsLoginLocations;
import nmsLocations.NmsPunchInLocations;
import nmsmodules.NmsLoginModule;
import nmsmodules.NmsPunchInModule;
 
@Listeners(nmsHelpers.NmsListeners.class)
public class NmsLoginTestcases extends NmsDrivers{
	
	int i=0;
    ExtentReports extent;
    ExtentTest test;
    NmsLoginModule login = new NmsLoginModule();
    //NmsPunchInModule punchin = new NmsPunchInModule();
    NmsLoginLocations locator = new NmsLoginLocations();
    NmsPunchInLocations Punchin= new NmsPunchInLocations();
    
    
	@BeforeSuite
	public void loader() {
		load();
	}
	 
	@BeforeClass 
	public void setUp() {
		NmsExtentReport.setupExtentReport();
	} 
	
 
    @AfterSuite
    public void tearDown() {
      // driver.quit();
    }
	
    @DataProvider(name = "ExcelData")
    public Object[][] excelData() throws IOException {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\NmsAutomationReport.xlsx";
//        System.out.println(filePath);
        String sheetName = "Login";
        
        return NmsDataProvider.getExcelData(filePath, sheetName);
    }
    
    @Test(dataProvider = "ExcelData")
    public void authentication(String testId, String Description, String email, String password, String status, String orgId) throws TimeoutException {
//    	System.out.println("auth block");
    	NmsExtentReport.getTest().info("TC_ID: "+login.convertTcID(testId));
    	NmsExtentReport.getTest().info("Test Description: "+Description);
    	if(i==0) {
    		new NmsLoginModule().fieldOrgId("nintriva").buttonContinue();
    		i++;
    	}
    	
    	
    	
    	new NmsLoginModule()
    	.fieldEmail(email)
    	.fieldPassword(password)
     	.buttonLogin(status);
    	
//    	Punchin.clickPunchInButton();
//    	wait.until(ExpectedConditions.visibilityOfElementLocated(locator.punchInButton)).click();
    	
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    	WebElement clickablePunchInButton = wait.until(ExpectedConditions.elementToBeClickable(punchInButton));
//    	clickablePunchInButton.click();

    	
    }
 
}
 