package in.amazon.testCase;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import in.amazon.objects.ObjectsRepository;
import in.amazon.pageObjects.PageObjects;
import in.amazon.utils.Browser;
import in.amazon.utils.Excel;

public class Test001 {

	@Test
	public void login() throws Exception {
		WebDriver driver = Browser.getObject(ObjectsRepository.browserName);
		driver.get(ObjectsRepository.url);
		PageObjects pageObjects = new PageObjects(driver);
		pageObjects.clickSignIn();

		ArrayList<String> list = Excel.getRowData(0);
		

		System.out.println(list);

		//pageObjects.enterUserName(list.get(0));
		//pageObjects.enterPassword(list.get(1));
		ArrayList<String> list1 = Excel.getRowData(1);
		pageObjects.inputDell(list1.get(0));
		pageObjects.searchLaptop();
		
		pageObjects.dell();
		

	}
}
