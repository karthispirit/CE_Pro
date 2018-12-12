package epnm.CE.Provisioning.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import epnm.CE.Provisioning.base.TestBase;
import epnm.CE.Provisioning.code.CE_Provisioning;
import epnm.CE.Provisioning.code.EVPL_UNIA;
import epnm.CE.Provisioning.code.EVPL_UNIZ;
import epnm.CE.Provisioning.code.LoginPage;
import epnm.CE.Provisioning.code.Service_page;
import epnm.CE.Provisioning.code.Submit_page;

public class Epnm_Loginpage_Test extends TestBase{
		
		 LoginPage  loginpage;
		 CE_Provisioning ce_Provisioning;
		 Service_page service_page;
		 EVPL_UNIA Evpl_unia;
		 EVPL_UNIZ Evpl_uniz;
		 Submit_page submit_page;
		 
		 
		 public Epnm_Loginpage_Test() {
			super();
		}
		
		@BeforeMethod
		public void setup() {
			
			initialization();
			 loginpage = new LoginPage();
		}
		
	/*	@Test( priority=0)
		public void Login_epnm_confirm_test() throws Exception {
			ce_Provisioning = loginpage.login_epnm(prop.getProperty("username"),prop.getProperty("password"));
			String title = loginpage.login_confirm();
			Assert.assertEquals(title, "Evolved Programmable Network Manager");
			Thread.sleep(3000);
		}*/
		
		@Test(priority=1)
		public void create_evpl_test() throws Exception {
			ce_Provisioning = loginpage.login_epnm(prop.getProperty("username"),prop.getProperty("password"));
			String title = loginpage.login_confirm();
			Assert.assertEquals(title, "Evolved Programmable Network Manager");
			Thread.sleep(3000);
			service_page = ce_Provisioning.move_2_network_topo();
			Evpl_unia = service_page.Servicepage_entry(prop.getProperty("service_name"),prop.getProperty("service_description"),prop.getProperty("mtu1"));
			Evpl_uniz = Evpl_unia.UNIA_entry(prop.getProperty("UNIA_name"));
			submit_page = Evpl_uniz.UNIZ_entry(prop.getProperty("UNIZ_name"));
		}
		
		/* @Test(priority=2, dependsOnMethods="create_evpl_test")
		
		public void Service_page_test() throws Exception {
			
			
			
		}
	   @AfterMethod
	    public void closebrowser() throws Exception {
	    	Thread.sleep(10000);
	    	driver.quit();
	    }*/
	}



