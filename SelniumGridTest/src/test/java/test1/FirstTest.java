package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("testing...");
		//1.lanche browser
		// chrome browser
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
        //open url https://demo.opencart.com/
		//driver.get("https://demo.opencart.com/");
		
		// Chrome
driver.get("https://frontend.staging.saytutension.baamtuservices.com/home/community-health-worker");
		
		
		// validate title should be "your Store"
		// Chrome
		String act_title=driver.getTitle();
			
	if(act_title.equals("SaytuTensionFront"))
	//(act_title.equals("Your Store"))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test Failed");
	}
	//close browser
	
	//driver.close();
	//driver.quit();
}
}
