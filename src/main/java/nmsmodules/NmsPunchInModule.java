
package nmsmodules;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import nmsHelpers.NmsDrivers;
import nmsLocations.NmsPunchInLocations;

public class NmsPunchInModule extends NmsDrivers {

	NmsPunchInLocations locator = new NmsPunchInLocations();
	private WebElement[] WFH;
	private WebElement selectWorkmode;
	
	

	public NmsPunchInModule clickPunchInButton() throws InterruptedException {
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"overlay\"]")));
			
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator.punchInButton)).click();

	          } catch (Exception e) {
	        System.err.println("Failed to click the Punch In button: " + e.getMessage());
	          }
		return this;
	}
		
	public NmsPunchInModule selectWorkmode(String workmode) throws InterruptedException {
		
		try {
	        WebElement workModeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.selectWorkMode));
	        String currentWorkMode = workModeDropdown.getText(); // Get the currently selected option
	        
	        // Check the current work mode and switch if necessary
	        if (!currentWorkMode.equals(workmode)) { // Switch only if current mode doesn't match the desired mode
	            workModeDropdown.click(); // Open the dropdown
	            
	            // Select the desired work mode from the dropdown options
	            WebElement desiredOption = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.Hybrid));
	            desiredOption.click();
	        } else {
	            System.out.println("Work mode is already set to: " + currentWorkMode);
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    } catch (Exception e) {
	        System.err.println("Failed to select the work mode: " + e.getMessage());
	    }
	    return this;
	}
		
	
//	public NmsPunchInModule selectProjectDropdown(String selectProject) throws InterruptedException {
//		// TODO Auto-generated method stub
//		try {
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator.selectProjectDropdown)).click();
//	       
//	        
//	          } catch (Exception e) {
//	        System.err.println("Failed to select the selectProject dropdown: " + e.getMessage());
//	          }
//		return this;
//	}
//	
//	
//	

	
	

	public NmsPunchInModule submitButton() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator.submitButton)).click();
	        
	          } catch (Exception e) {
	        System.err.println("Failed to select the workmode dropdown: " + e.getMessage());
	          }
		return this;
	}
	
	
	public NmsPunchInModule DialogueBoxYes() throws InterruptedException {
	
		try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator.DialogueBoxYes)).click();
	        
	          } catch (Exception e) {
	        System.err.println("Failed to select the workmode dropdown: " + e.getMessage());
	          }
		return this;
	}
		

		public NmsPunchInModule PunchboardTab() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(locator.PunchboardTab)).click();
	        
	          } catch (Exception e) {
	        System.err.println("Failed to select the workmode dropdown: " + e.getMessage());
	          }
		return this;
	}
	
	
	

	public String convertTcID(String testId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
}

//package nmsmodules;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
//import org.testng.Assert;
//
//import nmsHelpers.NmsDrivers;
//import nmsHelpers.NmsExtentReport;
//import nmsLocations.NmsLoginLocations;
//import nmsLocations.NmsPunchInLocations;
//
//public class NmsPunchInModule extends NmsDrivers {
// 
//
//	private static final Wait wait = null;
//
//	//NmsLoginLocations locator = new NmsLoginLocations();
//
//	NmsPunchInLocations locator = new NmsPunchInLocations();
//
//	WebElement buttonPunchIn;
//    WebElement workModeDropdown;
//	WebElement selectProjectDropdown;
//	WebElement taskField;
//	WebElement submitButton;
//	
//	
//	//public int convertTcID(String s) {
//
//		//int n;
//
////		try {
////
////	        // Parse the string as a double, then cast to an integer
////
////	        double temp = Double.parseDouble(s);
////
////	        n = (int) temp;
////
////	    } catch (NumberFormatException e) {
//// 
////	        System.err.println("Invalid TC ID: " + s);
////
////	        n = -1; // Assign a default or error value
////
////	    }
////
////	    return n;
////
////	}
//	
//		
////
////	public NmsPunchInModule buttonPunchIn(String status) {
////		
////		Object locator;
////		buttonPunchIn =  wait.until(ExpectedConditions.visibilityOfElementLocated(locator.buttonPunchIn));
////		 WebElement val;
////		 
////		    try {
////
////		        // Wait for the login button to be visible and click it
////
////		        val = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.buttonPunchIn));
////		        Thread.sleep(2000);
////		        val.click();
////		        buttonPunchIn.click();
////		        
////		        
////		        
////	}
//	
//	
//	
//	
//	
//	
//	
//	public void clickPunchInAndWaitForPopup() {
//	    try {
//	        // Wait for the Punch-In button to be clickable and click it
//	        WebElement buttonPunchIn = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(locator.buttonPunchIn));
//	        buttonPunchIn.click();
//
//	        // Log the action (optional)
//	        System.out.println("Punch-In button clicked successfully.");
//
//	        // Wait for the popup to be visible
//	        WebElement punchInPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.punchInPopup));
//
//	        // Log the popup visibility (optional)
//	        System.out.println("Punch-In popup is visible.");
//	    } catch (TimeoutException e) {
//	        // Log and fail the test if either the button or popup doesn't appear in time
//	        System.err.println("Failed to interact with Punch-In button or popup: " + e.getMessage());
//	        Assert.fail("Punch-In button click or popup visibility failed: " + e.getMessage());
//	    } catch (Exception e) {
//	        // Catch and log any unexpected exceptions
//	        System.err.println("An unexpected error occurred: " + e.getMessage());
//	        throw new RuntimeException("Error while interacting with Punch-In button or popup", e);
//	    }
//	}
//
//	    
//			        //buttonPunchIn.click();
//			        
//	        
////
////	        // Wait for the login button to be visible and click it
////	        WebElement buttonLogin = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator.buttonPunchIn));
////	        buttonLogin.click();
//
////	        if (status.equals("SUCCESS")) {
////	            // Validate that the punch-in action succeeded (e.g., button becomes invisible)
////	            try {
////	                wait.until(ExpectedConditions.invisibilityOfElementLocated(locator.buttonPunchIn));
////	            } catch (TimeoutException e) {
////	                NmsExtentReport.getTest().fail("Punch-in button is still visible when it should not be for status SUCCESS.");
////	                Assert.fail("Punch-in button is still visible when it should not be for status SUCCESS.");
////	            }
////	        } else if (status.equals("FAILURE")) {
////	            // Validate that the error indicator or retry button is visible
////	            try {
////	                wait.until(ExpectedConditions.visibilityOfElementLocated(locator.buttonPunchIn));
////	            } catch (TimeoutException e) {
////	                NmsExtentReport.getTest().fail("Error indicator is not visible when it should be for status FAILURE.");
////	                Assert.fail("Error indicator is not visible when it should be for status FAILURE.");
////	            }
////	        }
////	    } catch (Exception e) {
////	        NmsExtentReport.getTest().fail("An unexpected error occurred: " + e.getMessage());
////	        Assert.fail("An unexpected error occurred: " + e.getMessage());
////	    }
////
////	    return this;
//	}
//
//
//	public String convertTcID(String testId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	public void buttonPunchIn(String status) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
////
////	public NmsPunchInModule  workModeDropdown(String mode) {
////	    WebElement  workModeDropdown = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator. workModeDropdown));
////	    Select select = new Select( workModeDropdown);
////	    select.selectByVisibleText(mode);
////
////	    // Validate the selected work mode
////	    String selectedOption = select.getFirstSelectedOption().getText();
////	    if (!selectedOption.equals(mode)) {
////	        NmsExtentReport.getTest().fail("Work mode '" + mode + "' is not selected.");
////	        Assert.fail("Work mode '" + mode + "' is not selected.");
////	    }
////	    return this;
////	}
////	
////
////	public NmsPunchInModule selectProjectDropdown(Object project) {
////	    // Open the dropdown
////	    WebElement selectProjectDropdown = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator.selectProjectDropdown));
////	    selectProjectDropdown.click();
////
////	    // Select the desired project from the dropdown options
////	    String optionXpath = "//li[contains(text(), '" + project + "')]"; // Adjust based on the actual DOM structure
////	    WebElement option = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(optionXpath)));
////	    option.click();
////
////	    // Validate the selected project (if UI indicates selection)
////	    WebElement selectedOption = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator.selectProjectDropdown)); // Update with correct locator
////	    if (!selectedOption.getText().equals(project)) {
////	        NmsExtentReport.getTest().fail("Project '" + project + "' is not selected.");
////	        Assert.fail("Project '" + project + "' is not selected.");
////	    }
////	    return this;
////	}
////	
////
////	public NmsPunchInModule taskField(Object task) {
////	    WebElement taskField = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator.taskField));
////	    taskField.clear();
////	    taskField.sendKeys((CharSequence[]) task);
////
////	    // Validate the task input
////	    if (!taskField.getAttribute("value").equals(task)) {
////	        NmsExtentReport.getTest().fail("Task name '" + task + "' was not entered correctly.");
////	        Assert.fail("Task name '" + task + "' was not entered correctly.");
////	    }
////	    return this;
////	}
////
////	public NmsDrivers submitButton(String status) {
////	    WebElement submitButton = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator.submitButton));
////	    submitButton.click();
////
////	    if (status.equals("SUCCESS")) {
////	        try {
////	            // Validate successful submission
////	            ((WebElement) wait.until(ExpectedConditions.invisibilityOfElementLocated(locator.submitButton))).click();
////	        } catch (TimeoutException e) {
////	            NmsExtentReport.getTest().fail("Submit button is still visible when it should not be for status SUCCESS.");
////	            Assert.fail("Submit button is still visible when it should not be for status SUCCESS.");
////	        }
////	    } else if (status.equals("FAILURE")) {
////	        try {
////	            // Validate error feedback on failure
////	            wait.until(ExpectedConditions.visibilityOfElementLocated(locator.submitButton));
////	        } catch (TimeoutException e) {
////	            NmsExtentReport.getTest().fail("Error message is not visible when it should be for status FAILURE.");
////	            Assert.fail("Error message is not visible when it should be for status FAILURE.");
////	        }
////	    }
////	    return this;
////	}
////
////
////
////	public String convertTcID(String testId) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////
////
////	public Object buttonPunchIn(String status) {
////		// TODO Auto-generated method stub
////		return null;
////	}
//
//}
