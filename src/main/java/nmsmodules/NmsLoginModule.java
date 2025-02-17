package nmsmodules;
 
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
 
import org.testng.Assert;
 
import nmsHelpers.NmsDrivers;

import nmsHelpers.NmsExtentReport;

import nmsLocations.NmsLoginLocations;

import nmsLocations.NmsOrgIdLocations;
 
public class NmsLoginModule extends NmsDrivers {

	/* This class handles the operation of 

	 * various web elements of Nms Login page.

	 */

	NmsLoginLocations locator = new NmsLoginLocations();

	NmsOrgIdLocations locator1 = new NmsOrgIdLocations();

	WebElement fieldEmail;

	WebElement fieldPassword;

	public int convertTcID(String s) {

		int n;

		try {

	        // Parse the string as a double, then cast to an integer

	        double temp = Double.parseDouble(s);

	        n = (int) temp;

	    } catch (NumberFormatException e) {
 
	        System.err.println("Invalid TC ID: " + s);

	        n = -1; // Assign a default or error value

	    }

	    return n;

	}

	public NmsLoginModule fieldEmail(String email) {	

		fieldEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.fieldEmail));

		fieldEmail.sendKeys(email);

		return this;	

	}

	public NmsLoginModule fieldPassword(String password) {

		fieldPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.fieldPassword));

		fieldPassword.sendKeys(password);

		return this;

	}


	public NmsLoginModule buttonLogin(String status) {

	    WebElement val;
 
	    try {

	        // Wait for the login button to be visible and click it

	        val = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.buttonLogin));
	        Thread.sleep(2000);
	        val.click();

	        fieldEmail.clear();
	        fieldPassword.clear();

 
	        // Validate based on status

	        if (status.equals("TRUE")) {

	            // For status TRUE, login button should NOT be visible

	            try {

	                wait.until(ExpectedConditions.invisibilityOfElementLocated(locator.buttonLogin));

//	                NmsExtentReport.getTest().info("Login button is not visible as expected for status TRUE.");

	            } catch (TimeoutException e) {

	                NmsExtentReport.getTest().fail("Login button is still visible when it should not be for status TRUE.");

	                Assert.fail("Login button is still visible when it should not be for status TRUE.");

	            }

	        } else if (status.equals("FALSE")) {

	            // For status FALSE, upgrade button should NOT be visible

	            try {

	                wait.until(ExpectedConditions.visibilityOfElementLocated(locator.dropdownButton));

//	               NmsExtentReport.getTest().info("Upgrade button is visible as expected for status FALSE.");

	            } catch (TimeoutException e) {

//	               NmsExtentReport.getTest().fail("Upgrade button is not visible when it should be for status FALSE.");

	                Assert.fail("Upgrade button is not visible when it should be for status FALSE.");

	            }

	        }
 
	    } catch (TimeoutException e) {

	        // Handle timeout specifically

//	       NmsExtentReport.getTest().fail("Timeout while waiting for an element: " + e.getMessage());

	        Assert.fail("Timeout while waiting for an element: " + e.getMessage());

	    } catch (AssertionError e) {

	        // Handle assertion errors

//	        NmsExtentReport.getTest().fail("Assertion failed: " + e.getMessage());

	        throw e; // Re-throw to ensure test failure is recognized

	    } catch (Exception e) {

	        // Handle other unexpected exceptions

//	        NmsExtentReport.getTest().fail("Unexpected error: " + e.getMessage());

//	        throw e;

	    }
 
	    return this;

	}

 
	public NmsLoginModule fieldOrgId(String orgId) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator1.fieldOrgId)).sendKeys(orgId);

		return this;	

	}

	public NmsLoginModule buttonContinue() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator1.buttonContinue)).click();

		return this;

	}
	

 
}

 