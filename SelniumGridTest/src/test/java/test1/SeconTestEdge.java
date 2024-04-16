package test1;

import org.openqa.selenium.edge.EdgeDriver;

public class SeconTestEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("testing...");
		//1.lanche browser
		
		// Edge browser
		//EdgeDriver driver=new EdgeDriver();
		EdgeDriver WebDriver = new EdgeDriver();
		
        //open url https://demo.opencart.com/
		//driver.get("https://demo.opencart.com/");
	
		//Edge
		WebDriver.get("https://frontend.staging.saytutension.baamtuservices.com/home/community-health-worker");
		
		// validate title should be "your Store"
		
		// Edge
		String act_title=WebDriver.getTitle();
		
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
