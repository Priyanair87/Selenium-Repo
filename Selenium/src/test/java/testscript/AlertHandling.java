package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	public void simpleMethods()
	{
		// only ok
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alert.click();
		driver.switchTo().alert().accept();  //accept()--okay
	}
	public void conformationMethods()
	{
		//okay and cancle
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirm.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();   //dismiss()---cancel()
	}
	public void promptMethods()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement prompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("hello");  //sendKeys()---send message()
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.browserInitialisation();
		//alerthandling.simpleMethods();
		alerthandling.conformationMethods();
		alerthandling.promptMethods();
		

	}

}
