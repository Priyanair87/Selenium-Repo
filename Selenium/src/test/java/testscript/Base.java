package testscript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {

	  WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base= new Base();
		base.browserInitialisation();
		base.driverQuit();
	}
	
	public void browserInitialisation()
	{
		 driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		
	}
	
	public void driverQuit()
	{
		//driver.close();
				driver.quit();
	}

}
