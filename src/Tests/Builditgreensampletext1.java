package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import Tests.Base.TestBase;

public class Builditgreensampletext1 extends TestBase{

	@Test
	public void testBuilditgreensampletext1() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("test");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("test@test.com");
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys("121212121");
		driver.findElement(By.name("notes")).clear();
		driver.findElement(By.name("notes")).sendKeys("this is a selenium test");
		driver.findElement(By.name("Submit")).click();
		assertTrue(driver.getPageSource().contains("Please re-enter the code displayed in the image below."));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.name("Submit")).click();
		assertTrue(driver.getPageSource().contains("Please log in. If you do not have an account, please register for an account below."));
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("test");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.name("Submit")).click();
		assertTrue(driver.getPageSource().contains("Login did not succeed.  Please try again."));
		driver.findElement(By.xpath("//a[contains(text(),'Start Here')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register now')]")).click();
		driver.findElement(By.name("Submit")).click();
		assertTrue(driver.getPageSource().contains("Please re-enter the code displayed in the image below.")); 
	}


}
