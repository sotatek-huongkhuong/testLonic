package test;

import org.testng.annotations.Test;

import Pages.LonicPage;

public class lonicTest extends BaseTest{

	@Test
	public void goToTop()
	{
		driver.get("https://sotatek-duyta.github.io/Chris-test/home");
		LonicPage lonicpage= new LonicPage(driver);
		
		//go to scene 1
		lonicpage.waitForPageLoaded(driver);
		lonicpage.waitForPic0Present();
		lonicpage.clickGoTo1();
		
		// go to scene 2;
		lonicpage.waitForPic1Present();
		lonicpage.clickGoTo2();
		
		// go to scene 3;
		lonicpage.waitForPic2Present();
		lonicpage.clickGoTo3();
		
		// go to scene 4;
		lonicpage.waitForPic3Present();
		lonicpage.clickGoTo4();
		
		// go to scene 5;
		lonicpage.waitForPic4Present();
		lonicpage.clickGoTo5();

		//go to the picture of the house
		lonicpage.waitForPic5Present();
		lonicpage.clickGoTo6();
		
		// go to scene 5
		lonicpage.waitForPic6Present();
		lonicpage.clickGoTo5();
		
		//go to scene 7
		lonicpage.waitForPic5Present();
		lonicpage.clickGoTo7();
		
		//go to scene 7
		lonicpage.waitForPic7Present();
		lonicpage.clickGoTo8();
		
		//go to scene 7
		lonicpage.waitForPic8Present();
		lonicpage.clickGoTo9();
		lonicpage.waitForPic9Present();
	}
}
