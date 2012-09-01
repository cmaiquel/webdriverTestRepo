package Tests;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Tests.Base.TestBase;

public class Builditgreensampletext extends TestBase{


	@Test
	public void testBuilditgreensampletext() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		driver.findElement(By.name("Submit")).click();
		assertTrue(driver.getPageSource().contains("Please re-enter the code displayed in the image below. "));
		//Take a screenshot of the result
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("/var/lib/jenkins/workspace/testWD/screenshots/Builditgreensampletext.png"));
	}

	
}
