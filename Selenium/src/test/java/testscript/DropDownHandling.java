package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling extends Base{
	
	public void dropDown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement element=driver.findElement(By.id("single-input-field"));
	    Select sc=new Select(element) ;// constructor
	    sc.selectByVisibleText("Red");
	    //sc.selectByValue("Green");
	    //sc.selectByIndex(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		DropDownHandling dropdown=new DropDownHandling();
		
		dropdown.browserInitialisation();
		dropdown.dropDown();
	}

}
