package ETOE.gJE;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase2 {
	
	
	
	
	
	@Test 
	public void Testcase() throws InterruptedException {
	
	int 	sub=subtract();
	System.out.println(sub);
		
}
	
	
	@Test
	
	
	public void add() {
		
		
		int a=10;
		int b=20;
		
		int sum=a+b;
		
		System.out.println(sum);
		
		
		
	}
	
	
	
	
	public static int subtract() {
		
		
		int a=30;
		int b=20;
		
		int sub=a-b;
		return sub;
		

		
		
		
	}
}