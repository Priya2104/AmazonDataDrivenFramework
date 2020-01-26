package in.amazon.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjects {
	WebDriver driver;

	public PageObjects(WebDriver driver) {
		this.driver = driver;

	}

	// HomePage

	public void clickSignIn() {

		driver.findElement(By.linkText("Sign in")).click();

	}
	// UserName

	public void enterUserName(String userName) {
		driver.findElement(By.id("ap_email")).sendKeys(userName);
		driver.findElement(By.id("continue")).click();
	}

	// Password
	public void enterPassword(String password) {
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
	}

	// Search
	public void inputDell(String input) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
	}
	
	
	//search laptop
	public void searchLaptop() {
		driver.findElement(By.linkText("Laptops")).click();
}
	//click in dell
	public void dell() {
		driver.findElement(By.linkText("Dell")).click();
	}

}
