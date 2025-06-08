package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends Base {
	
	public void actionMethod()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
		//actions.dragAndDrop(drag1,drop).build().perform();
		//actions.contextClick(drag1).build().perform();
		//actions.moveToElement(drag1).build().perform();
		actions.doubleClick(drop).build().perform();
		actions.click(drop).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionClass actionclass=new ActionClass();
		actionclass.browserInitialisation();
		actionclass.actionMethod();
		

	}
}
