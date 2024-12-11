package nmsLocations;
 
import org.openqa.selenium.By;
 
public class NmsLoginLocations {
	/* This class contains the locations of
	 * web elements of Nms login page.
	 */
	 
	
	
	public By fieldEmail = By.xpath("//input[@type='email']");
	public By fieldPassword = By.xpath("//input[@type='password']");
	public By buttonLogin = By.xpath("//button[@type='submit']");
	public By dropdownButton = By.xpath("//div[@class='left']");
	public By punchInButton = By.xpath("//div[@class='card-top']");

}
  