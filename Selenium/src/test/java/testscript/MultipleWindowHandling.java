package testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{

	public void multipleWindowHandling()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		String prentwindow=driver.getWindowHandle();  //---Parent window handle
		System.out.println(prentwindow);
		
		System.out.println("***********************************************");
		Set<String> childhandle=driver.getWindowHandles();    // child window handle
		
		for (String set:childhandle)
		{
			System.out.println("window handle"+set);
			driver.switchTo().window(set);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("***********************************************");
			
		}
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleWindowHandling multiple=new MultipleWindowHandling();
		multiple.browserInitialisation();
		multiple.multipleWindowHandling();
	}

}
