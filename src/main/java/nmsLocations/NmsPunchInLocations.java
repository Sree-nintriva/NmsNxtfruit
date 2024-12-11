package nmsLocations;

import org.openqa.selenium.By;

public class NmsPunchInLocations {

 	
    
	public By punchInButton = By.xpath("//button[@type='submit']");
	
	public By selectWorkMode = By.xpath("//*[@id=\"pn_id_25_label\"]");
	//public By WFO= By.xpath("//*[@id="pn_id_25_list"]/p-dropdownitem[1]");
	//public By OnSite=By.xpath("//*[@id="pn_id_25_list"]/p-dropdownitem[2]/li");
	//public By WFH=By.xpath("//*[@id=\"pn_id_25_list\"]/p-dropdownitem[3]/li");
	public By Hybrid=By.xpath("//*[@id=\"pn_id_25_list\"]/p-dropdownitem[4]/li");
	
    public By selectProjectDropdown=By.xpath("//span[@id='pn_id_39_label']");
   // public By TestingProject= By.xpath("//*[@id=\"pn_id_31_list\"]/p-dropdownitem[1]/li");
   //public By NMS= By.xpath("//*[@id=\"p-highlighted-option\"]");
   // public By TestProject= By.xpath("//*[@id=\"pn_id_31_list\"]/p-dropdownitem[3]/li");
   // public By nintriva= By.xpath("//*[@id=\"pn_id_31_list\"]/p-dropdownitem[4]/li");
    
	public By taskField = By.xpath("//span[@id='pn_id_40_label']");
	//public By Testing=By.xpath("//*[@id=\"p-highlighted-option\"]");
	//public By ProjectManagement=By.xpath("//*[@id=\"pn_id_32_list\"]/p-dropdownitem[2]/li");
	
	public By submitButton =By.xpath("/html/body/app-root/div/ng-component/div[1]/div/nms-dashboard/nms-user-dashboard/div/div[1]/div[1]/div/div/div[2]/nms-punch-in-punch-out/div/form/p-dialog/div/div/div[3]/nms-primary-button/nms-base-button/button");
	
	public By DialogueBoxYes=By.xpath("/html/body/app-root/div/ng-component/div[1]/div/nms-dashboard/nms-user-dashboard/div/div[1]/div[1]/div/div/div[2]/nms-punch-in-punch-out/div/p-dialog[2]/div/div/div[2]/div[2]/nms-primary-button/nms-base-button/button");
	
	//public By DialogueBoxNo=By.xpath("/html/body/app-root/div/ng-component/div[1]/div/nms-dashboard/nms-user-dashboard/div/div[1]/div[1]/div/div/div[2]/nms-punch-in-punch-out/div/p-dialog[2]/div/div/div[2]/div[2]/nms-secondary-button/nms-base-button/button");
	

	public By PunchboardTab= By.xpath("/html/body/app-root/div/ng-component/div[1]/aside/nms-sidebar/aside/div/nav/ul/li[3]/div/div[1]/div[1]");

	public void clickPunchInButton() {
		// TODO Auto-generated method stub
		
		
	}

	
	

}
