package epnm.CE.Provisioning.code;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import epnm.CE.Provisioning.base.TestBase;



public class LoginPage  extends TestBase{
		
		// Pagefactoy
		@FindBy(id ="label_username")
	     WebElement username;
		
		@FindBy(id = "label_password")
		WebElement password;
		
		@FindBy(id = "loginPage_LoginButton_label")
		WebElement loginbutton;
		
		@FindBy(xpath="//a[@title ='Evolved Programmable Network Manager']")
		WebElement Login_confirm;
		
		@FindBy(xpath="//*[@id=\"xwt_widget_form_TextButtonGroup_2\"]/span[2]/span")
		WebElement Popup_ok;
	    //Initialize objects
		public LoginPage() {
			
		PageFactory.initElements(driver,this);
		
		}
		
		public String login_confirm() {
			return Login_confirm.getText();
		}
		
		public  CE_Provisioning login_epnm (String un, String pwd) throws Exception    {
			username.sendKeys(un);
			password.sendKeys(pwd);
			Thread.sleep(3000);
			loginbutton.click();
			Popup_ok.click();	
			Thread.sleep(3000);
			return new CE_Provisioning();
		}
	
		
	}


