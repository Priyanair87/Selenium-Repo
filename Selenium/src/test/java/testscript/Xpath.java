package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {

	 public void relativeXpath()
	 {
		//tag[@attribute='value']
		 
		 WebElement elementid1=driver.findElement(By.xpath("//button[@id='button-one']"));
		 WebElement elementid2=driver.findElement(By.xpath("//input[@id='value-a']"));
		 WebElement elementid3=driver.findElement(By.xpath("//input[@id='value-b']"));
		 WebElement elementid4=driver.findElement(By.xpath("//button[@id='button-two']"));
		 WebElement elementid5=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		 
	 }
	 public void text()
	 {
		//tag[text()='text']

		 WebElement elementid1=driver.findElement(By.xpath("//button[text()='Show Message']"));
		 WebElement elementid2=driver.findElement(By.xpath("//button[text()='Get Total']"));
		 WebElement elementid3=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		 WebElement elementid4=driver.findElement(By.xpath("//button[text()='Get Results']"));
		 WebElement elementid5=driver.findElement(By.xpath("//button[text()='Start Download']"));
	 }
	 public void contains()
	 {
		   //syntax //tag[contains(@attribute,'value')]
		 WebElement elementid1=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		 WebElement elementid2=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		 WebElement elementid3=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
	 }
	 public void startWith()
	 {
		 //startsWith()  //tag[starts-with(@attribute,'value')]
		 WebElement elementid1=driver.findElement(By.xpath("//input[starts-with(@id,'single-i')]")); 
		 WebElement elementid2=driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]")); 
	 }
	 public void and()
	 {
		//tag[@attribute='value' and @attribute='value']
		 
		 WebElement elementid1=driver.findElement(By.xpath("input[@class='form-control' and @id='single-input-field']")); 
		 WebElement elementid2=driver.findElement(By.xpath("input[@type='button' and @id='button-one']")); 
		 WebElement elementid3=driver.findElement(By.xpath("input[@type='text' and @class='form-control datepicker']']")); 
	 }
	 
	 public void or()
	 {
		//tag[@attribute='value' or  @attribute='value']
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
