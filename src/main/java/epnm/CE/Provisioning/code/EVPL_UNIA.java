package epnm.CE.Provisioning.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

import epnm.CE.Provisioning.base.TestBase;

public class EVPL_UNIA extends TestBase{
	
	
	@FindBy (id = "dijit_form_TextBox_49")
	WebElement UNIA_name;
	
	@FindBy (xpath="//*[@id=\"xwt_widget_form_TableSinglePicker_4\"]/div/div[2]/div")
	WebElement device_selection;
	
	@FindBy(xpath = "//*[@id=\"input-1350358\"]")
	WebElement device_value;
	//*[@id="xwt_widget_form_TableSinglePicker_19"]/div/div[2]
	@FindBy(xpath="/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div[3]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[5]/div[2]/div/div/div[2]")
	WebElement port_selection;
	
	@FindBy(xpath="//*[@id=\"input-1388109\"]")
	WebElement port_value;
	
	@FindBy(xpath="//input[contains(@id,'xwt_widget_form_NumberTextBox_3')]")
	WebElement mtuA;
	
	@FindBy(xpath="//input[contains(@id,'dijit_form_TextBox_72')]")
	WebElement vlanA_select;
	
	@FindBy(xpath="//span[contains(@id,'action-21_label')]")
	WebElement UNIA_next;
	
	
	
	public EVPL_UNIA() {
		
		PageFactory.initElements(driver, this);
	}
	
	public EVPL_UNIZ UNIA_entry(String uname) throws Exception {
		UNIA_name.sendKeys(uname);
		device_selection.click();
		Thread.sleep(2000);
		device_value.click();
		Thread.sleep(2000);
		port_selection.click();
		Thread.sleep(2000);
		port_value.click();
		mtuA.clear();
		mtuA.sendKeys(prop.getProperty("A_mtu"));
		vlanA_select.sendKeys(prop.getProperty("A_VLAN"));
		UNIA_next.click();
		
		return new EVPL_UNIZ();
		
		
	}
}
