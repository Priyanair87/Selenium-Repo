package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {
    public void tagAndId()
    {
    	 WebElement elementid1=driver.findElement(By.cssSelector("button#button-one"));
    	 WebElement elementid2=driver.findElement(By.cssSelector("input#value-a"));
    	 WebElement elementid3=driver.findElement(By.cssSelector("input#value-b"));
    	 WebElement elementid4=driver.findElement(By.cssSelector("input#gridCheck"));
    	 WebElement elementid5=driver.findElement(By.cssSelector("input#button-two"));
    }
    public void tagAndClass()
    {
    	WebElement elementid1=driver.findElement(By.cssSelector("input.form-control"));
    	WebElement elementid2=driver.findElement(By.cssSelector("input.form-check-input"));
    	//form submit
    	WebElement elementid3=driver.findElement(By.cssSelector("input.form-check-input"));
    	//Ajax form submit
    	WebElement elementid4=driver.findElement(By.cssSelector("input.form-control"));
    }
    public void tagAndAttribute()
    {
    	WebElement elementid1=driver.findElement(By.cssSelector("button[id='button-one']"));
    	WebElement elementid2=driver.findElement(By.cssSelector("input[id='value-b']"));
    	WebElement elementid3=driver.findElement(By.cssSelector("input[id='value-a']"));
    	WebElement elementid4=driver.findElement(By.cssSelector("button[id='button-two']"));
    	WebElement elementid5=driver.findElement(By.cssSelector("button[id='button-one']"));
    	
    }
    
    public void tagClassAttribute()
    {
    	WebElement elementid1=driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
    	WebElement elementid2=driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
    	WebElement elementid3=driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
    	WebElement elementid4=driver.findElement(By.cssSelector("input.form-check-input[id='gridCheck']"));
    	WebElement elementid5=driver.findElement(By.cssSelector("input.form-check-input[id='invalidCheck']"));
    	
    }
    
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Tag and ID(tag#id)
				//2.Tag and class(tag.class)
				//3.Tag and Attribute(tag[attribute=value]
				//4.Tag,class,and Attribute(tag.classname[attribute=value]
	}

}
