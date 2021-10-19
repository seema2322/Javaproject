package ETOE.gJE;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase {
	
	
	
	
	public int sal;
	public String name;
	@Test 
	public void Testcase() throws InterruptedException {
		
		
		Testcase anu=new Testcase();
		Testcase seema=new Testcase();
		Testcase ishita=new Testcase();
		anu.name="anu";
		seema.sal=23423;
		
		System.out.println(anu.name);
		System.out.println(seema.sal);
	}
}