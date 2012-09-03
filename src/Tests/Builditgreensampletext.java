package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import Tests.Base.TestBase;

public class Builditgreensampletext extends TestBase{


	@Test
	public void testBuilditgreensampletext() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		driver.findElement(By.name("Submit")).click();
		assertTrue(driver.getPageSource().contains("Please re-enter the code displayed in the image below. "));
		
		//Take a screenshot of the result
		this.takeScreenshot("/var/lib/jenkins/workspace/testWD/screenshots/",this.getClass().getName()+"_step_1.png");
		
	}

	
}
