package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {
	
public void tablePrinting()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	System.out.println(element.getText());
}

public void row()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[6]"));
	System.out.println(element.getText());
WebElement element1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[7]"));
	
	System.out.println(element1.getText());
}
public void cell()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	
	WebElement element1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[5]"));
	System.out.println(element1.getText());
	WebElement element2=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[7]/td[5]"));
	System.out.println(element2.getText());
}
public void column()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> colm=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
	for(WebElement list:colm)
	{
	System.out.println(list.getText());
	}

	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehandling=new TableHandling();
		tablehandling.browserInitialisation();
		//tablehandling.tablePrinting();
		//tablehandling.row();
		//tablehandling.cell();
		tablehandling.column();
	}

}
