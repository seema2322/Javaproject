package ETOE.gJE;

import org.testng.annotations.Test;

public class Herobike extends  Inheritanceparent{
	
	@Test
	public void test() {
	
	
	Inheritanceparent b=new Inheritanceparent();
	
	 b.colour="red";
	 b.price=1000;
	 
	}
	
	@Test 
	public void tyretype() {
		
		
		System.out.println("tubeless type");
	}
public void stratbike() {
		
		
		
		System.out.println("start the bike herobike ");
	}
	
public void stopbike() {
		
		
		
	System.out.println("stop the hero bike ");
	}
}
