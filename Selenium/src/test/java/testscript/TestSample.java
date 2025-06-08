package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestSample extends Base{
	public void addition()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element=driver.findElement(By.id("value-a"));
		element.sendKeys("10");
		 element.click();
		 WebElement element1=driver.findElement(By.id("value-b"));
		 element1.sendKeys("5");
		 element1.click();
		 WebElement element3=driver.findElement(By.id("button-two"));
		 element3.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TestSample testsample = new TestSample();
       testsample.browserInitialisation();
       testsample.addition();
	}

}
