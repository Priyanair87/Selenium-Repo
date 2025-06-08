package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base{
	
		public void testCheckBox()
		{
			driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
			WebElement elementlinktext1=driver.findElement(By.linkText("Checkbox Demo"));
			elementlinktext1.click();
			WebElement element=driver.findElement(By.id("gridCheck"));
			element.click();
			WebElement element1=driver.findElement(By.id("button-two"));
			element1.click();
			WebElement element2=driver.findElement(By.id("button-two"));
			element2.click();
		}
	public void checkBoxHandle()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement elementlinktext1=driver.findElement(By.linkText("Checkbox Demo"));
		elementlinktext1.click();
		WebElement element=driver.findElement(By.id("gridCheck"));
		element.click();
		if(element.isSelected())
		{
			System.out.println("selected");
		}
			else
			{
				System.out.println("not selected");
				element.click();
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CheckBox checkbox= new CheckBox();
		checkbox.browserInitialisation();
		//checkbox.testCheckBox();
		checkbox.checkBoxHandle();
		
	}

}
