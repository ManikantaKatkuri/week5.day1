package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends BaseClass {
	@Test
	public  void createContact() throws InterruptedException {
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("David");
		driver.findElement(By.id("lastNameField")).sendKeys("Warner");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("FNLocal");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LNLocal");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test Leaf");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Test1234@gmail.com");
		WebElement ele = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select province = new Select (ele);
		province.selectByVisibleText("California");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("QA Automation");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println("Title of the Page: "+title);

	}

}