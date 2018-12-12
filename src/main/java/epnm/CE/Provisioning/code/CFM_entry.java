package epnm.CE.Provisioning.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import epnm.CE.Provisioning.base.TestBase;

public class CFM_entry extends TestBase{
	
	
	@FindBy(xpath="//*[@id=\"widget_xwt_widget_form_FilteringSelect_3\"]/div[1]")
	By CFM_domain_name;
	
	
	@FindBy(xpath="//input[@id='xwt_widget_form_NumberTextBox_1']")
	WebElement CFM_domain_level;
	
	@FindBy(xpath="//*[@id=\"widget_xwt_widget_form_FilteringSelect_8\"]/div[1]")
	By CCI;
	
	 public CFM_entry() {
		 PageFactory.initElements(driver, this);
	 }
	
	public Service_page CFM_details() {
		System.out.println("-----------enter_cfm_details-------");
		//*[@id="widget_xwt_widget_form_FilteringSelect_3"]/div[1]
		
		List<WebElement> s1 = driver.findElements(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div/div[4]/div[2]/div/div[3]/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/div[3]/div[2]/div/div/div[1]/div[2]/div[2]/div/div[1]"));
		System.out.println(s1.size());
		System.out.println(s1.get(0));
		s1.get(0).click();
		System.out.println("------------------exit_cfm_details--------");
		CFM_domain_level.clear();
		CFM_domain_level.sendKeys("3");
		//List<WebElement> s2= driver.findElements(By.xpath("//*[@id=\"widget_xwt_widget_form_FilteringSelect_8\"]/div[1]"));
		List<WebElement> s2= driver.findElements(By.xpath("//*[@id=\"widget_xwt_widget_form_FilteringSelect_8\"]/div[3]"));
		Iterator<WebElement> it = s2.iterator();
		while (it.hasNext()) {
		    WebElement wb  = it.next();
		    System.out.println(wb.getText());
		    /*if(wb.getText().equals("")) {
		        wb.click();
		        break;*/
		    }
            System.out.println(s2.size());
            System.out.println(s2.get(0));
		s2.get(0);
		
		return new Service_page();
		
	}

}
