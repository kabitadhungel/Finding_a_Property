package stepdefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	private WebDriver driver;
	private HomePage homePage;
	
	@Before
	public void setUp() {
		System.setProperty("WebDriver.chrome.driver","/Users/kabitadhungel/eclipse-workspace/Finding-a-Property/src/test/java/resources");
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		driver.manage().window().maximize();
	}
	
	@Given("I am on the Homepage")
	public void userIsOnTheHomePage() {
		driver.get("https://www.belleproperty.com/");
	}
	
	@Then("I enter keyword {string}")
	public void iEnterSearchKeyword(String place) {
		homePage.searchKeyword(place);
	}
	
	@When("I click toggle filter button")
	public void clickToggleFilterButton() {
		homePage.clickFilters();
	}
	
	@And("I select property type house")
	public void iselectPropertyType() {
		homePage.clickPropertyDropdownButton();
		homePage.selectPropertyType();
	}
	
	@And("I select beds 5+")
	public void iselectBeds() {
		homePage.clickBedsDropdownButton();
		homePage.selectBeds();
	}
	
	@And("I select cars 2+")
	public void iselectCars() {
		homePage.clickCarsDropdownButton();
		homePage.selectCars();
	}
	
	@And("I select feature balcony")
	public void selectFeature() {
		homePage.clickFeatureDropdownButton();
		homePage.selectFeature();
	}
	
	@And("I click on the search button")
	public void clickSearch() {
		homePage.clickSearch();
	}
	
	@And("I choose first listing")
	public void iChooseFirstListing() {
		homePage.selectFirstItem();
	}
	
	@Then("I click on read more")
	public void iClickOnReadMore() {
		homePage.clickReadMore();
	}
	
	@Then("I look for the keyword balcony")
	public void keywordSearch() {
	    // Locate the element you want to scroll to
	    WebElement element = driver.findElement(By.xpath("//p[contains(text(), 'balcony')]"));

	    // Use JavaScript to scroll to the element
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);

	    // Verify if the keyword "balcony" is found
	    String balcony = homePage.findKeyword();
	    String expectedWord = "balcony";
	    
	    Assert.assertTrue(balcony.contains(expectedWord));
	    
	    System.out.println("Text Found!");
	}

	
	
	
	@After
	public void teardown() {
		if (driver !=null) {
			driver.quit();
		}
	}
}