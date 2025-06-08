package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccessMethods extends Base{
	
	
	public void parent()//weak parent and strong child
	{
		WebElement showmsg=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	
	public void child()//weak child and strong parent
	{
		WebElement showmsg=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	}
	
	public void followingSibiling()// inside parent if siblings are there
	{
		WebElement showmsg=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));
	}
	
	public void followingSiblingfollowing()//
	{
		WebElement showmsg=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-two']"));
	}
	
	public void preceeding()
	{
		WebElement showmsg=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
	}
	public void ancestors()
	{
		WebElement showmsg=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='example my-3']"));
	}
	
	public void desendant()
	{
		WebElement showmsg=driver.findElement(By.xpath("(//div[@id='collapsibleNavbar']//descendant::li)[3]"));
	}
	
	public void indexing()
	{
		WebElement showmsg=driver.findElement(By.xpath("(//div[@id='collapsibleNavbar']//descendant::li)[6]"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessMethods accessmethods=new AccessMethods();
		
		
		
	}

}
