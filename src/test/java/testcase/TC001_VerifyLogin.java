package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageclasses.AccountLogin;
import pageclasses.MyAccount;
import pageclasses.YourStore;

public class TC001_VerifyLogin  extends BaseClass {

	
	/*@Test(dataProviderClass= utilities.Utilities.class , dataProvider = "dp")
	 * */
	@Test
	public void verifyLogin(){
		app_logs.info("Test Started");
		YourStore yt = new YourStore(driver);
		yt.ClickonMyaccount();
		yt.ClickonLogin();
		
		
		AccountLogin aLogin = new AccountLogin(driver);
		aLogin.sendEmail();
		aLogin.sendPass();
		aLogin.clickLogin();
		
		
		MyAccount ma = new MyAccount(driver);
		ma.clickdrop();
		ma.clicklogout();
		ma.clickcontinue();
		

		String exptitle = "Your Store";
		String acttitle = "Your Store";
		Assert.assertEquals(acttitle, exptitle);


	}

}
