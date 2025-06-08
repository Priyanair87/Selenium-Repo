package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void id()
	{
	    driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	  //  WebElement element=driver.findElement(By.locator("locatorvalue"));
	    
	    WebElement element=driver.findElement(By.id("single-input-field"));
	    element.sendKeys("123");
	    WebElement buttoname=driver.findElement(By.id("button-one"));
	    buttoname.click();
	    WebElement elementid1=driver.findElement(By.id("value-b"));
	    WebElement elementid2=driver.findElement(By.id("value-a"));
	    WebElement elementid3=driver.findElement(By.id("button-one"));
	    WebElement elementid4=driver.findElement(By.id("downloadButton"));
	    WebElement elementid5=driver.findElement(By.id("autoclosable-btn-success"));
	    
	}
	public void className()
	{
		WebElement elementclassname1=driver.findElement(By.className("col-lg-3 col-md-3 col-sm-12 col-xs-12"));
		WebElement elementclassname2=driver.findElement(By.className("form-control datepicker"));
		WebElement elementclassname3=driver.findElement(By.className("btn btn-primary"));
	}
	
	public void name()
	{
		WebElement elementname1=driver.findElement(By.name("description"));
		WebElement elementname2=driver.findElement(By.name("keywords"));
		WebElement elementname3=driver.findElement(By.name("author"));
	}
	
	public void linkText()
	{
		WebElement elementlinktext1=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement elementlinktext2=driver.findElement(By.linkText("Select Input"));
		WebElement elementlinktext3=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement elementlinktext4=driver.findElement(By.linkText("Form Submit"));
		WebElement elementlinktext5=driver.findElement(By.linkText("Select Input"));
	}
	public void partialLinkText()
	{
		WebElement elementpartitiallinktext1=driver.findElement(By.partialLinkText("Radio Buttons"));
		WebElement elementpartitiallinktext2=driver.findElement(By.partialLinkText("Ajax Form"));
		WebElement elementpartitiallinktext3=driver.findElement(By.partialLinkText("Radio"));
		WebElement elementpartitiallinktext4=driver.findElement(By.partialLinkText("Form"));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Locators locators=new Locators();
      locators.browserInitialisation();
      locators.id();
      locators.className();
      locators.name();
      locators.linkText();
      locators.partialLinkText();
      
      }

}
