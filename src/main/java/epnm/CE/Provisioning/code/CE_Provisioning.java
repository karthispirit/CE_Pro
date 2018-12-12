package epnm.CE.Provisioning.code;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
import epnm.CE.Provisioning.base.TestBase;

public class CE_Provisioning extends TestBase{
	
	@FindBy(xpath="//div[contains(@class,'dijitInline toggleNode')]")
	WebElement menu_list;
	
	@FindBy(xpath="//*[@id=\"wcsuishell_node_id_menu_maps\"]/div/div[2]")
	WebElement maps;
	
	@FindBy(xpath = "//a[contains(text(),'Network Topology')]")
	WebElement network_topology;
	
	//@FindBy(xpath="//a[contains(text(),'Circuits/VCs')]")
	@FindBy(xpath="//*[@id=\"serviceTabMenuItem\"]")
	WebElement circuit_vc;
	
	@FindBy(xpath="//h3[contains(text(),'Circuits/VCs')]")
	WebElement circuit_vc_text;
	
	@FindBy(xpath="//span[contains(@class,'dijitReset dijitInline dijitIcon icon-serplus')]")
	WebElement create_vc;
	
	@FindBy(xpath="//input[@id='input-91']")
	WebElement evpl_select;
	
	@FindBy(xpath="//span[@id='action-2_label']")
	WebElement wizard_submit;
	
	
	public CE_Provisioning() {
		
		PageFactory.initElements(driver, this);
	}
	
	public Service_page move_2_network_topo() throws Exception {
		menu_list.click();
		maps.click();
		network_topology.click();
		Thread.sleep(3000);
		if (circuit_vc_text.isDisplayed()) {
			System.out.println("Circuit_displayed_move_to_create");
			
		}else {
			System.out.println("Circuit_not_displayed_move_to_create");
			circuit_vc.click();
		
		}
		Thread.sleep(3000);
		create_vc.click();
		evpl_select.click();
		Thread.sleep(10000);
		wizard_submit.click();
		Thread.sleep(10000);
		return new Service_page();
	}

}
