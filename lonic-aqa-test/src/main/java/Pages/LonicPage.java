package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.*;
public class LonicPage extends BasePage{
	@FindBy(id= "button-go-to-0")
	WebElement btnGotoPic0;
	@FindBy(id= "button-go-to-1")
	WebElement btnGotoPic1;
	@FindBy(id= "button-go-to-2")
	WebElement btnGotoPic2;
	@FindBy(id= "button-go-to-3")
	WebElement btnGotoPic3;
	@FindBy(id= "button-go-to-4")
	WebElement btnGotoPic4;
	@FindBy(id= "button-go-to-5")
	WebElement btnGotoPic5;
	@FindBy(id= "button-go-to-6")
	WebElement btnGotoPic6;
	@FindBy(id= "button-go-to-7")
	WebElement btnGotoPic7;
	@FindBy(id= "button-go-to-8")
	WebElement btnGotoPic8;
	@FindBy(id= "button-go-to-9")
	WebElement btnGotoPic9;
	
	@FindBy(xpath="//img[@src='assets/20201102_152648.jpg']")
	WebElement pic0;
	@FindBy(xpath="//img[@src='assets/20201102_152507.jpg']")
	WebElement pic1;
	@FindBy(xpath="//img[@src='assets/20201102_152112.jpg']")
	WebElement pic2;
	@FindBy(xpath="//img[@src='assets/20201102_151819.jpg']")
	WebElement pic3;
	@FindBy(xpath="//img[@src='assets/20201102_151448.jpg']")
	WebElement pic4;
	@FindBy(xpath="//img[@src='assets/20201102_151217.jpg']")
	WebElement pic5;
	@FindBy(xpath="//img[@src='assets/20201102_150944.jpg']")
	WebElement pic6;
	@FindBy(xpath="//img[@src='assets/20201102_150435.jpg']")
	WebElement pic7;
	@FindBy(xpath="//img[@src='assets/20201102_150217.jpg']")
	WebElement pic8;
	@FindBy(xpath="//img[@src='assets/20201102_145719.jpg']")
	WebElement pic9;
	
	
	public LonicPage(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void scrollToBtnGoTo1()
	{
		scrollToElement(btnGotoPic1);
	}
	public void scrollToBtnGoTo2()
	{
		scrollToElement(btnGotoPic2);
	}
	public void scrollToBtnGoTo3()
	{
		scrollToElement(btnGotoPic3);
	}
	public void scrollToBtnGoTo4()
	{
		scrollToElement(btnGotoPic4);
	}
	public void scrollToBtnGoTo5()
	{
		scrollToElement(btnGotoPic5);
	}
	public void scrollToBtnGoTo6()
	{
		scrollToElement(btnGotoPic6);
	}
	public void scrollToBtnGoTo7()
	{
		scrollToElement(btnGotoPic7);
	}
	public void scrollToBtnGoTo8()
	{
		scrollToElement(btnGotoPic8);
	}
	public void scrollToBtnGoTo9()
	{
		scrollToElement(btnGotoPic9);
	}
	
	public void verifyBtn0isDisplayed ()
	{
		checkElementToClickable(btnGotoPic0,driver);
	}
	public void verifyBtn1isDisplayed()
	{
		checkElementToClickable(btnGotoPic1,driver);
	}	
	public void verifyBtn2isDisplayed()
	{
		checkElementToClickable(btnGotoPic2,driver);
	}	
	public void verifyBtn3isDisplayed()
	{
		checkElementToClickable(btnGotoPic3,driver);
	}	
	public void verifyBtn4isDisplayed()
	{
		checkElementToClickable(btnGotoPic4,driver);
	}	
	public void verifyBtn5isDisplayed()
	{
		checkElementToClickable(btnGotoPic5,driver);
	}	
	public void verifyBtn6isDisplayed()
	{
		checkElementToClickable(btnGotoPic6,driver);
	}	
	public void verifyBtn7isDisplayed()
	{
		checkElementToClickable(btnGotoPic7,driver);
	}	
	public void verifyBtn8isDisplayed ()
	{
		checkElementToClickable(btnGotoPic8,driver);
	}
	public void verifyBtn9isDisplayed ()
	{
		checkElementToClickable(btnGotoPic9,driver);
	}
	
	
	public void scrollToBtnGoTo0()
	{
		scrollToElement(btnGotoPic0);
	}

	public void clickGoTo0()
	{
		click(btnGotoPic0);
	}
	public void clickGoTo1()
	{
		click(btnGotoPic1);
	}	
	public void clickGoTo2()
	{
		click(btnGotoPic2);
	}	
	public void clickGoTo3()
	{
		click(btnGotoPic3);
	}	
	public void clickGoTo4()
	{
		click(btnGotoPic4);
	}	
	public void clickGoTo5()
	{
		click(btnGotoPic5);
	}	
	public void clickGoTo6()
	{
		click(btnGotoPic6);
	}	
	public void clickGoTo7()
	{
		click(btnGotoPic7);
	}	
	public void clickGoTo8()
	{
		click(btnGotoPic8);
	}
	public void clickGoTo9()
	{
		click(btnGotoPic9);
	}
	public void verifyBtn0VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic0))
		{
			System.out.println(btnGotoPic0+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic0+" isn't  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic0));
		}
		
	}
	public void verifyBtn1VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic1))
		{
			System.out.println(btnGotoPic1+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic1+" isn't  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic1));
		}
		
	}
	public void verifyBtn2VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic2))
		{
			System.out.println(btnGotoPic2+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic2+ " Not  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic2));
		}
		
	}
	public void verifyBtn3VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic3))
		{
			System.out.println(btnGotoPic3+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic3+" isn't  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic3));
		}
		
	}
	public void verifyBtn4VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic4))
		{
			System.out.println(btnGotoPic4+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic4+" isn't  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic4));
		}
		
	}
	public void verifyBtn5VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic5))
		{
			System.out.println(btnGotoPic5+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic5+" isn't  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic5));
		}
		
	}
	public void verifyBtn6VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic6))
		{
			System.out.println(btnGotoPic6+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic6+" isn't  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic6));
		}
		
	}
	public void verifyBtn7VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic7))
		{
			System.out.println(btnGotoPic7+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic7+" isn't  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic7));
		}
		
	}
	public void verifyBtn8VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic8))
		{
			System.out.println(btnGotoPic8+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic8+" isn't  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic8));
		}
		
	}
	public void verifyBtn9VisibleInViewPort()
	{
		if(isVisibleInViewport(btnGotoPic9))
		{
			System.out.println(btnGotoPic9+" is Visible In Viewport");
		}
		else
		{
			System.out.println(btnGotoPic9+" isn't  Visible In Viewport");
			Assert.assertTrue(isVisibleInViewport(btnGotoPic9));
		}
		
	}
	public void waitForPic0Present() {
		waitForElementPresent(pic0,driver);
	}
	
	public void waitForPic1Present() {
		waitForElementPresent(pic1,driver);

	}
	
	public void waitForPic2Present() {
		waitForElementPresent(pic2,driver);
	}
	
	public void waitForPic3Present() {
		waitForElementPresent(pic3,driver);
	}
	
	public void waitForPic4Present() {
		waitForElementPresent(pic4,driver);
	}
	
	public void waitForPic5Present() {
		waitForElementPresent(pic5,driver);
	}
	
	public void waitForPic6Present() {
		waitForElementPresent(pic6,driver);
	}
	
	public void waitForPic7Present() {
		waitForElementPresent(pic7,driver);
	}
	
	public void waitForPic8Present() {
		waitForElementPresent(pic8,driver);
	}
	public void waitForPic9Present() {
		waitForElementPresent(pic9,driver);
	}

	
	
}
