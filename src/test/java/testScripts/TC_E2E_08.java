package testScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;

public class TC_E2E_08 extends BaseClass{
	

	@Test
	public void testScripts() throws Exception{
		//Enabling desktopMode
		//Clicks on Dotted Hamburger
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc='More options']").click();
		//Clicks on desktop site
		driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.android.chrome:id/checkbox']").click();
		
		//Validate Home screen 
		softAssert.assertEquals(driver.findElementByXPath("//android.widget.Button[@text='Account settings']").isDisplayed(),true , "Home screen is not displayed");
		Reporter.log("Homescreen is displayed" , true);
		
		//will click on account settings
		driver.findElementByXPath("//android.widget.Button[@text='Account settings']").click();
		
		//Validate Account settings menu 
		softAssert.assertEquals(driver.findElementByXPath("//android.view.MenuItem[@text='Wish List']").isDisplayed(), true , "Account Setting Menu is not displayed");
		Reporter.log("Account settings menu is displayed" , true);
		
		//will click on wishlist 
		driver.findElementByXPath("//android.view.MenuItem[@text='Wish List']").click();
		
		//validate wishlist page 
		softAssert.assertEquals(driver.findElementByXPath("//android.widget.Button[@text='ADD TO CART']").isDisplayed(), true , "Wish List screen is not displayed");
		Reporter.log("Wish LIst screen is displayed",true);
		
		//will click on add to cart button 
		driver.findElementByXPath("//android.widget.Button[@text='ADD TO CART']").click();
		
		Reporter.log("product is added successfully",true);
		
		//will click on cart button 
		driver.findElementByXPath("//android.view.View[@resource-id='cart']").click();
		
		//validate Cart screen 
		softAssert.assertEquals(driver.findElementByXPath("(//android.view.View/child::android.widget.Image)[2]").isDisplayed(), true , "Cart screen is not displayed");
		Reporter.log("Cart screen is displayed",true);
		
		//Will click on the first product
		driver.findElementByXPath("(//android.view.View/child::android.widget.Image)[2]").click();
		
		//Validates Product detail screen 
		softAssert.assertEquals(driver.findElementByXPath("//android.widget.Button[@text='BUY NOW']").isDisplayed(), true , "Product detail screen is not displayed");
		Reporter.log("Product detail screen is not displayed",true);
		
		//will click on buy now button 
		driver.findElementByXPath("//android.widget.Button[@text='BUY NOW']").click();
		
		//Validates Address screen 
		softAssert.assertEquals(driver.findElementByXPath("//android.view.View[@content-desc='Add New Address']").isDisplayed(), true , "Address screen is not displayed");
		Reporter.log("Address screen is displayed",true);
		
		//will click on add new address 
		driver.findElementByXPath("//android.view.View[@content-desc='Add New Address']").click();
		
		//Validate add adress screen 
		softAssert.assertEquals(driver.findElementByXPath("//android.widget.EditText[@resource-id=\r\n"
				+ "'Name']").isDisplayed(), true , "Add Address screen is not displayed");
		Reporter.log("Add Address screen is Displayed ",true);
		
		
		//Will locatte Name textField 
		driver.findElementByXPath("//android.widget.EditText[@resource-id=\r\n"
				+ "'Name']").sendKeys("DineshKumar");
		
		Reporter.log("Name entered",true);
		
		//will locate HouseTextField 
		driver.findElementByXPath("//android.widget.EditText[@resource-id=\r\n"
				+ "'House/Office Info']").sendKeys("833");
		Reporter.log("House info entered",true);
		
		//will locate Street INfo
		driver.findElementByXPath("//android.widget.EditText[@resource-id=\r\n"
				+ "'Street Info']").sendKeys("12th Main");
		Reporter.log("Street entered",true);
		
		//will locate LandMark textfield 
		driver.findElementByXPath("//android.widget.EditText[@resource-id=\r\n"
				+ "'Landmark']").sendKeys("Central Mall");
		Reporter.log("Landmark entered",true);
		
		//taps on ContryDropdown 
		driver.findElementByXPath("//android.view.View[@text='Country']").click();
		//taps on India 
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='USA']").click();
		Reporter.log("Country selecetd",true);
		
		//taps on State dropdown 
		driver.findElementByXPath("//android.view.View[@text='State']").click();
		//taps on alaska
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Alaska']").click();
		Reporter.log("State selecetd",true);
		
		//Taps on city dropdown
		driver.findElementByXPath("//android.view.View[@text='City']").click();
		//Taps on Juneau
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Juneau']").click();
		
		Reporter.log("City selecetd",true);
		//Help center 
		driver.findElementByXPath("//android.view.View[@content-desc=\"Help Center\"]/android.widget.TextView").click();
		Reporter.log("Help center screen is visible ",true);
		//sends value to pincode text field 
		driver.findElementByXPath("//android.widget.EditText[@resource-id='Pincode']").sendKeys("432101");
		Reporter.log("Pincode",true);
		//phone number
		driver.findElementByXPath("//android.widget.EditText[@resource-id='Phone Number']").sendKeys("9876543210");
		Reporter.log("Phone number entered",true);
		//add address 
		driver.findElementByXPath("//android.widget.Button[@text='Add Address']").click();
		Reporter.log("Address addedd sucessfully",true);
		//select an address
		driver.findElementByXPath("//android.widget.RadioButton[contains(@text,'Address')]").click();
		Reporter.log("Address selecetd",true);
		//click on proceed
		driver.findElementByXPath("//android.widget.Button[@text='Proceed']").click();
		Reporter.log("Paymentscreen displayed",true);
		Thread.sleep(2000);
		//click on cash on delivery
		driver.findElementByXPath("//android.widget.TextView[@text='Cash On Delivery (COD)']").click();
		Reporter.log("Cash on deleivery selecetd ",true);
		//click on proceed
		driver.findElementByXPath("//android.widget.Button[@text='Proceed']").click();
		Thread.sleep(7000);
		Reporter.log("Order confirmation message is displayed",true);
		//account settings
		driver.findElementByXPath("//android.widget.Button[@text='Account settings']").click();
		Reporter.log("Account settings menu is displayed",true);
		//tap on my order
		driver.findElementByXPath("//android.view.MenuItem[@text='My Orders']").click();
		Reporter.log("Same product is present in My order screen",true);
	}
}
