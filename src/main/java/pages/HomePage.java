package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class HomePage{
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchKeyword(String place) {
		driver.findElement(By.xpath("//input[@id='search-keywords-selectized']")).sendKeys(place);		
	}
	
	public void clickFilters() {
		driver.findElement(By.xpath("//div[@data-target='#advanced-search']")).click();		
	}
	
	public void clickPropertyDropdownButton() {
		WebElement filterButton = driver.findElement(By.xpath("//button[@aria-owns='bs-select-10']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", filterButton);

		//driver.findElement(By.xpath("(//div[@class='filter-option-inner-inner'][normalize-space()='All'])[1]")).click();
	}
	
	public void selectPropertyType() {
		
		driver.findElement(By.xpath("(//span[normalize-space()='House'])[1]")).click();
	}
	
	public void clickBedsDropdownButton() {
		driver.findElement(By.xpath("//button[@aria-owns='bs-select-11']")).click();
	}
	
	public void selectBeds() {
		driver.findElement(By.xpath("//a[@id='bs-select-11-5']")).click();
	}
	
	public void clickCarsDropdownButton() {
		driver.findElement(By.xpath("//button[@aria-owns='bs-select-12']")).click();
	}
	
	public void selectCars() {
		driver.findElement(By.xpath("//a[@id='bs-select-12-2']")).click();
	}
	
	public void clickFeatureDropdownButton() {
		driver.findElement(By.xpath("//button[@aria-owns='bs-select-9']")).click();
	}
	
	public void selectFeature() {
		driver.findElement(By.xpath("//a[@id='bs-select-9-2']")).click();
	}
	
	public void clickSearch() {
		driver.findElement(By.xpath("//button[@class='btn input-bar-btn']")).click();
	}
	

	public void selectFirstItem() {
		driver.findElement(By.xpath("(//div[@class='property-item'])[1]")).click();
	}
	
	public void clickReadMore() {
		driver.findElement(By.xpath("//a[@href='#']")).click();
	}
	
	public String findKeyword() {
		return driver.findElement(By.xpath("//div[@class='col-md-12 summary']")).getText();
	}
	
	
	
}
	
	
	

