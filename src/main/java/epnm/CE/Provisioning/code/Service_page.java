package epnm.CE.Provisioning.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import epnm.CE.Provisioning.base.TestBase;

public class Service_page extends TestBase {
	
	
	@FindBy(xpath="//*[@id=\"xwt_widget_form_TableSinglePicker_1\"]/div/div[2]")
	WebElement customer_select;
	
	@FindBy(name = "dijit_form_TextBox_6")
	WebElement servicename;
	
	
	@FindBy(xpath = "//textarea[@id='dijit_form_SimpleTextarea_0']")
	WebElement servicename_desc;
	
	@FindBy(id ="xwt_widget_form_NumberTextBox_0")
	WebElement mtu_1;
	
	@FindBy(id="dijit_form_CheckBox_14")
	WebElement cfm_ena_dis;
	
	@FindBy(xpath="//*[@id=\"action-21_label\"]")
	WebElement next;
	
	CFM_entry cfm_entry;
	
    public Service_page() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public EVPL_UNIA Servicepage_entry(String sn,String sd,String mtu1) throws Exception {
		
		/*Select service_1 = new Select(customer_select);
		service_1.selectByVisibleText("Infrastructure");*/
		 
		servicename.sendKeys(sn);
		 
		servicename_desc.sendKeys(sd);
		mtu_1.clear();
		Thread.sleep(3000);
		mtu_1.sendKeys(mtu1);
		if(prop.getProperty("cfm").equals("true")) {
			System.out.println("--------------if_entry-------------");
			if(cfm_ena_dis.isSelected()) {
				System.out.println("---------2nd_if_entry----------");
				cfm_entry = new CFM_entry();
				cfm_entry.CFM_details();
			}
			else {
				cfm_ena_dis.click();
				cfm_entry = new CFM_entry();
				cfm_entry.CFM_details();
			}
		}
			else {
			cfm_ena_dis.click();
		}
		next.click();
		Thread.sleep(10000);
		return new EVPL_UNIA();
		
	}
	
	

}
