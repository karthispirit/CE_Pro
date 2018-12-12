package epnm.CE.Provisioning.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import epnm.CE.Provisioning.base.TestBase;

public class EVPL_UNIZ extends TestBase{
	
	@FindBy(xpath="//input[contains(@id,'dijit_form_TextBox_105')]")
	WebElement UNIZ_name;
	 
	@FindBy (xpath="//*[@id=\"xwt_widget_form_TableSinglePicker_17\"]/div/div[2]/div")
	WebElement device_selection;
	 
	/*@FindBy(xpath="//*[@id=\"xwt_widget_table__ByExampleWidget_20\"]")
	WebElement device_search;*/
	//*[@id="input-1350383"]
	/*@FindBy(xpath = "//*[@id=\"input-1350383\"]")
	WebElement device_value;
*/	
	@FindBy(xpath = "//*[@id=\"input-1350358\"]")
	WebElement device_value;
	
	@FindBy(xpath="//*[@id=\"xwt_widget_form_TableSinglePicker_19\"]/div/div[2]")
	WebElement port_selection;
	
	@FindBy(xpath="//*[@id=\"input-3162824\"]")
	WebElement port_value;
	
	@FindBy(xpath="//input[contains(@id,'xwt_widget_form_NumberTextBox_7')]")
	WebElement mtuZ;
	 
	@FindBy(xpath="//input[contains(@id,'dijit_form_TextBox_128')]")
	WebElement vlanZ_select;
	
	@FindBy(xpath="//span[contains(@id,'action-21_label')]")
	WebElement UNIZ_next;
	
	@FindBy(xpath="//span[contains(@id,'action-22_label')]")
	WebElement submit_evpl;

	public EVPL_UNIZ() {
		PageFactory.initElements(driver, this);
	}
	
	public Submit_page UNIZ_entry(String uname) throws Exception {
		UNIZ_name.sendKeys(uname);
		device_selection.click();
		/*device_search.sendKeys("903");*/
		Thread.sleep(2000);
		device_value.click();
		Thread.sleep(2000);
		port_selection.click();
		Thread.sleep(2000);
		port_value.click();
		mtuZ.clear();
		mtuZ.sendKeys(prop.getProperty("Z_mtu"));
		vlanZ_select.sendKeys(prop.getProperty("Z_VLAN"));
		submit_evpl.click();
		return new Submit_page();
		
	}
}
