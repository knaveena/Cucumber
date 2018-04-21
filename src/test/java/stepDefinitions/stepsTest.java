package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class stepsTest {

	WebDriver driver;

	@Given("^The user has to be on the home page$")
	public void the_user_has_to_be_on_the_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/naveenakadem/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.shop.demoqa.com");
	}

	@When("^The user selects dress in search bar$")
	public void the_user_selects_dress_in_search_bar() throws Throwable {
		driver.navigate().to("http://www.shop.demoqa.com/?s=" + "dress" + "&post_type=product");
		List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
		items.get(0).click();
	}

	@When("^Adds the item to the cart$")
	public void adds_the_item_to_the_cart() throws Throwable {
		WebElement addToCart = driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
		addToCart.click();
	}

	@When("^Checkouts the item from the mini cart icon$")
	public void checkouts_the_item_from_the_mini_cart_icon() throws Throwable {
		WebElement cart = driver.findElement(By.cssSelector(".cart-button"));
		cart.click();
		WebElement continueTocart = driver.findElement(By.cssSelector(".checkout-button.alt"));
		continueTocart.click();
	}

	@When("^Enter all the details for billing$")
	public void enter_all_the_details_for_billing() throws Throwable {
		Thread.sleep(5000);
		WebElement firstName = driver.findElement(By.cssSelector("#billing_first_name"));
		firstName.sendKeys("Lakshay");

		WebElement lastName = driver.findElement(By.cssSelector("#billing_last_name"));
		lastName.sendKeys("Sharma");

		WebElement emailAddress = driver.findElement(By.cssSelector("#billing_email"));
		emailAddress.sendKeys("test@gmail.com");

		WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
		phone.sendKeys("07438862327");

		WebElement countryDropDown = driver.findElement(By.cssSelector("#billing_country_field .select2-arrow"));
		countryDropDown.click();
		Thread.sleep(2000);

		List<WebElement> countryList = driver.findElements(By.cssSelector("#select2-drop ul li"));
		for (WebElement country : countryList) {
			if (country.getText().equals("India")) {
				country.click();
				Thread.sleep(3000);
				break;
			}
		}
		WebElement city = driver.findElement(By.cssSelector("#billing_city"));
		city.sendKeys("Delhi");
		WebElement address = driver.findElement(By.cssSelector("#billing_address_1"));
		address.sendKeys("Shalimar Bagh");
		WebElement postcode = driver.findElement(By.cssSelector("#billing_postcode"));
		postcode.sendKeys("110088");
	}

	@When("^Same delivery address as billing$")
	public void same_delivery_address_as_billing() throws Throwable {
		WebElement shipToDifferentAddress = driver.findElement(By.cssSelector("#ship-to-different-address-checkbox"));
		if(shipToDifferentAddress.isSelected()) {
			shipToDifferentAddress.click();
		}
		Thread.sleep(3000); 
	}
	
	@When("^Selects the payment method as check$")
	public void selects_the_payment_method_as_check() throws Throwable {
		List<WebElement> paymentMethod = driver.findElements(By.cssSelector("ul.wc_payment_methods li"));
		paymentMethod.get(0).click();
	}

	@When("^Place the order$")
	public void place_the_order() throws Throwable {
		WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
		acceptTC.click();

		WebElement placeOrder = driver.findElement(By.cssSelector("#place_order"));
		placeOrder.submit();

		driver.quit();
	}

}
