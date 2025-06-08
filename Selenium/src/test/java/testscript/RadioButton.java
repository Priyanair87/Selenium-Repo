package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base{
	
	public void checkRadioButton()
	{
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	//male
	WebElement element=driver.findElement(By.id("inlineRadio1"));
	element.click();
	WebElement element1=driver.findElement(By.id("button-one"));
	element1.click();
	//female
	WebElement element3=driver.findElement(By.cssSelector("input#inlineRadio2"));
	element3.click();
	WebElement element4=driver.findElement(By.id("button-one"));
	element4.click();
	}
	
	public void checkRadioButton1()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement element=driver.findElement(By.id("inlineRadio1"));
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
	public void checkGroupRadioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
		//Male
		WebElement element=driver.findElement(By.id("inlineRadio11"));//male
		element.click();
		WebElement element1=driver.findElement(By.cssSelector("input#inlineRadio22"));//1 to 18
		element1.click();
		WebElement element2=driver.findElement(By.cssSelector("button#button-two"));//get result
		element2.click();
		WebElement element3=driver.findElement(By.cssSelector("input#inlineRadio23"));//19 to 44
		element3.click();
		WebElement element4=driver.findElement(By.cssSelector("button#button-two"));//get result
		element4.click();
		WebElement element5=driver.findElement(By.cssSelector("input#inlineRadio24"));//45 to 60
		element5.click();
		WebElement element6=driver.findElement(By.cssSelector("button#button-two"));//get result
		element6.click();
		//female
		
		WebElement element7=driver.findElement(By.cssSelector("input#inlineRadio21")); //female
		element7.click();
		WebElement element8=driver.findElement(By.cssSelector("input#inlineRadio22"));//1 to 18
		element8.click();
		WebElement element9=driver.findElement(By.cssSelector("input#inlineRadio23"));//19 t0 44
		element9.click();
		WebElement element10=driver.findElement(By.cssSelector("input#inlineRadio24"));// 45 to 60
		element10.click();
		WebElement element11=driver.findElement(By.cssSelector("button#button-two"));//get result
		element11.click();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton radiobutton=new RadioButton();
		radiobutton.browserInitialisation();
		//radiobutton.checkRadioButton();
		//radiobutton.checkGroupRadioButton();
		radiobutton.checkRadioButton1();
	}

}
