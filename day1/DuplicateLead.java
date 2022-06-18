package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BaseClass {

	@Test
	public  void duplicateLead() throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("manikantak@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//div[contains(@class,'col-firstName')]/a[@class='linktext']"));
		String text=ele.getText();
		System.out.println("First Resulting Name is: "+text);
		ele.click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[1]")).click();
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead")) {
			System.out.println("Title is Duplicate Lead");
		}
		else {
			System.out.println("Title is Not Matching");
		}
		driver.findElement(By.linkText("Create Lead")).click(); 

	}

}