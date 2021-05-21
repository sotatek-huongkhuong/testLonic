package test;

import org.testng.annotations.Test;

import Pages.LonicPage;

public class lonicTest extends BaseTest{

	@Test
	public void changeSceneAndViewPort()
	{
		driver.get("https://sotatek-duyta.github.io/Chris-test/home");
		LonicPage lonicpage= new LonicPage(driver);
		
		//go to scene 1
		lonicpage.waitForPageLoaded(driver);
		lonicpage.waitForPic0Present();
		lonicpage.checkbtn1VisibleInViewPort();
		lonicpage.clickGoTo1();
		
		// go to scene 2;
		lonicpage.waitForPic1Present();
		lonicpage.checkbtn2VisibleInViewPort();
		lonicpage.clickGoTo2();
		
		// go to scene 3;
		lonicpage.waitForPic2Present();
		lonicpage.checkbtn3VisibleInViewPort();
		lonicpage.clickGoTo3();
		
		// go to scene 4;
		lonicpage.waitForPic3Present();
		lonicpage.checkbtn4VisibleInViewPort();
		lonicpage.clickGoTo4();
		
		// go to scene 5;
		lonicpage.waitForPic4Present();
		lonicpage.checkbtn5VisibleInViewPort();
		lonicpage.clickGoTo5();

		//go to the picture of the house (scene 6)
		lonicpage.waitForPic5Present();
		lonicpage.checkbtn7VisibleInViewPort();
		lonicpage.scrollToBtnGoTo6();
		lonicpage.checkbtn6VisibleInViewPort();
		lonicpage.clickGoTo6();
		
		// go to scene 5
		lonicpage.waitForPic6Present();
		lonicpage.scrollToBtnGoTo5();
		lonicpage.checkbtn5VisibleInViewPort();
		lonicpage.clickGoTo5();
		
		//go to scene 7
		lonicpage.waitForPic5Present();
		lonicpage.checkbtn4VisibleInViewPort();
		lonicpage.scrollToBtnGoTo7();
		lonicpage.checkbtn7VisibleInViewPort();
		lonicpage.clickGoTo7();
		
		//go to scene 8
		lonicpage.waitForPic7Present();
		lonicpage.checkbtn8VisibleInViewPort();
		lonicpage.clickGoTo8();
		
		//go to scene 9
		lonicpage.waitForPic8Present();
		lonicpage.checkbtn9VisibleInViewPort();
		lonicpage.clickGoTo9();
		lonicpage.waitForPic9Present();
	}
}
