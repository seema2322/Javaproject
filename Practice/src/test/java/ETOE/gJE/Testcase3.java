package ETOE.gJE;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase3 {
	
	
	
	
	
	@Test 
	public void Testcase() throws InterruptedException {
	
	
	 System.out.println("this will start the claass");
}
	
	@Test 
	public void Testcase2() throws InterruptedException {
	
	
	 System.out.println("this will end the claass");
}

	@Test 
	public void Usemethod() throws InterruptedException {
	
		Testcase2();
		Testcase();
}
}