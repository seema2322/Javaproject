package ETOE.gJE;

import org.testng.annotations.Test;

public class TestBike {

	
	@Test
	
	public void test() {
		
		
		Inheritanceparent b=new Inheritanceparent();
		Herobike he=new Herobike(); 
		
		 b.colour="red";
		 b.price=1000;
		 he.tyretype();
		 he.stopbike();
		 he.stopbike();
		 b.stopbike();
		 b.stratbike();
		 
		}
}
